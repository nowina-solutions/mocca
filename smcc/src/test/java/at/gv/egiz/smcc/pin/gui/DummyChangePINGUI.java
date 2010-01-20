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
package at.gv.egiz.smcc.pin.gui;

import at.gv.egiz.smcc.CancelledException;
import at.gv.egiz.smcc.PINSpec;

public abstract class DummyChangePINGUI implements ModifyPINGUI {

  @Override
  public void validKeyPressed() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void correctionButtonPressed() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void allKeysCleared() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void finish() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void finishDirect() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void modifyPINDirect(PINSpec spec, int retries) throws CancelledException, InterruptedException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void enterCurrentPIN(PINSpec spec, int retries) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void enterNewPIN(PINSpec spec) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void confirmNewPIN(PINSpec spec) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}