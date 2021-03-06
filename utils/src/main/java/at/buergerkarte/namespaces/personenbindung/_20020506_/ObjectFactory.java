/*
 * Copyright 2011 by Graz University of Technology, Austria
 * MOCCA has been developed by the E-Government Innovation Center EGIZ, a joint
 * initiative of the Federal Chancellery Austria and Graz University of Technology.
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.21 at 09:43:54 AM GMT 
//


package at.buergerkarte.namespaces.personenbindung._20020506_;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.buergerkarte.namespaces.personenbindung._20020506_ package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompressedIdentityLink_QNAME = new QName("http://www.buergerkarte.at/namespaces/personenbindung/20020506#", "CompressedIdentityLink");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.buergerkarte.namespaces.personenbindung._20020506_
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompressedIdentityLinkType }
     * 
     */
    public CompressedIdentityLinkType createCompressedIdentityLinkType() {
        return new CompressedIdentityLinkType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompressedIdentityLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/personenbindung/20020506#", name = "CompressedIdentityLink")
    public JAXBElement<CompressedIdentityLinkType> createCompressedIdentityLink(CompressedIdentityLinkType value) {
        return new JAXBElement<CompressedIdentityLinkType>(_CompressedIdentityLink_QNAME, CompressedIdentityLinkType.class, null, value);
    }

}
