//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.01 at 04:42:31 PM CEST 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreateCMSSignatureRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCMSSignatureRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyboxIdentifier" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}BoxIdentifierType"/&gt;
 *         &lt;element name="DataObject" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}CMSDataObjectRequiredMetaType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Structure" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="detached"/&gt;
 *             &lt;enumeration value="enveloping"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PAdESCompatibility" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCMSSignatureRequestType", propOrder = {
    "keyboxIdentifier",
    "dataObject"
})
public class CreateCMSSignatureRequestType {

    @XmlElement(name = "KeyboxIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keyboxIdentifier;
    @XmlElement(name = "DataObject", required = true)
    protected CMSDataObjectRequiredMetaType dataObject;
    @XmlAttribute(name = "Structure", required = true)
    protected String structure;
    @XmlAttribute(name = "PAdESCompatibility")
    protected Boolean pAdESCompatibility;

    /**
     * Gets the value of the keyboxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboxIdentifier() {
        return keyboxIdentifier;
    }

    /**
     * Sets the value of the keyboxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboxIdentifier(String value) {
        this.keyboxIdentifier = value;
    }

    /**
     * Gets the value of the dataObject property.
     * 
     * @return
     *     possible object is
     *     {@link CMSDataObjectRequiredMetaType }
     *     
     */
    public CMSDataObjectRequiredMetaType getDataObject() {
        return dataObject;
    }

    /**
     * Sets the value of the dataObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMSDataObjectRequiredMetaType }
     *     
     */
    public void setDataObject(CMSDataObjectRequiredMetaType value) {
        this.dataObject = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructure(String value) {
        this.structure = value;
    }

    /**
     * Gets the value of the pAdESCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPAdESCompatibility() {
        if (pAdESCompatibility == null) {
            return false;
        } else {
            return pAdESCompatibility;
        }
    }

    /**
     * Sets the value of the pAdESCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPAdESCompatibility(Boolean value) {
        this.pAdESCompatibility = value;
    }

}
