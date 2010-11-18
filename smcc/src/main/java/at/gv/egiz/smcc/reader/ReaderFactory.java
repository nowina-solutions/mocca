/*
 * Copyright 2008 Federal Chancellery Austria and
 * Graz University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.gv.egiz.smcc.reader;

import at.gv.egiz.smcc.conf.SMCCConfiguration;
import at.gv.egiz.smcc.util.SMCCHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.smartcardio.Card;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 * @author Clemens Orthacker <clemens.orthacker@iaik.tugraz.at>
 */
public class ReaderFactory {

  private final Logger log = LoggerFactory.getLogger(ReaderFactory.class);
  
  protected static SMCCConfiguration configuration;

  public void setConfiguration(SMCCConfiguration configuration) {
    if (configuration != null) {
      log.info("reader configuration: disablePinpad=" + configuration.isDisablePinpad());
    }
    ReaderFactory.configuration = configuration;
  }

  public static CardReader getReader(Card icc, CardTerminal ct) {

    Logger log = LoggerFactory.getLogger(ReaderFactory.class);
    String name = ct.getName();
    log.info("Creating reader : {}.", name);

    Map<Byte, Integer> features;
    if (configuration != null && configuration.isDisablePinpad()) {
      features = Collections.emptyMap();
    } else {
      features = queryFeatures(icc);
    }
    
    CardReader reader;
    if (features.isEmpty()) {
      reader = new DefaultCardReader(ct);
    } else {
      reader = new PinpadCardReader(ct, features);
    }

    return reader;
  }

  private static int SCARD_CTL_CODE(int code) {
    String os_name = System.getProperty("os.name").toLowerCase();
    if (os_name.indexOf("windows") > -1) {
      return (0x31 << 16 | (code) << 2);
    }
    return 0x42000000 + (code);
  }

  static int IOCTL_GET_FEATURE_REQUEST = SCARD_CTL_CODE(3400);

  private static Map<Byte, Integer> queryFeatures(Card icc) {
    Logger log = LoggerFactory.getLogger(ReaderFactory.class);
    Map<Byte, Integer> features = new HashMap<Byte, Integer>();
    if (icc == null) {
      log.warn("Invalid card handle, cannot query ifd features.");
    } else {
      try {
        if (log.isTraceEnabled()) {
          log.trace("GET_FEATURE_REQUEST {}", Integer.toHexString(IOCTL_GET_FEATURE_REQUEST));
        }
        byte[] resp = icc.transmitControlCommand(IOCTL_GET_FEATURE_REQUEST,
                new byte[0]);

        if (log.isTraceEnabled()) {
          log.trace("Response TLV {}", SMCCHelper.toString(resp));
        }
        // tag
        // length in bytes (always 4)
        // control code value for supported feature (in big endian)
        for (int i = 0; i < resp.length; i += 6) {
          Byte feature = new Byte(resp[i]);
          Integer ioctl = new Integer((0xff & resp[i + 2]) << 24) |
                  ((0xff & resp[i + 3]) << 16) |
                  ((0xff & resp[i + 4]) << 8) |
                  (0xff & resp[i + 5]);
          if (log.isInfoEnabled()) {
            if (feature.intValue() < CardReader.FEATURES.length) {
              log.info("IFD supports {}: {}", CardReader.FEATURES[feature
                  .intValue()], Integer.toHexString(ioctl.intValue()));
            } else {
              log.info("IFD supports unknown feature 0x{}, : {}", Integer
                      .toHexString(feature), Integer
                      .toHexString(ioctl.intValue()));
            }
          }
          features.put(feature, ioctl);
        }
      } catch (CardException ex) {
        log.debug("Failed to query IFD features: {}", ex.getMessage(), ex);
        log.info("IFD does not support secure pin entry.");
      }
    }
    return features;
  }

}
