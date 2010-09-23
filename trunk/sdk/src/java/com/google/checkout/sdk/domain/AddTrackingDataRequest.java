//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.23 at 12:14:48 PM PDT 
//


package com.google.checkout.sdk.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddTrackingDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTrackingDataRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="tracking-data" type="{http://checkout.google.com/schema/2}TrackingData"/>
 *       &lt;/all>
 *       &lt;attribute name="google-order-number" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTrackingDataRequest", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class AddTrackingDataRequest {

    @XmlElement(name = "tracking-data", namespace = "http://checkout.google.com/schema/2", required = true)
    protected TrackingData trackingData;
    @XmlAttribute(name = "google-order-number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String googleOrderNumber;

    /**
     * Gets the value of the trackingData property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingData }
     *     
     */
    public TrackingData getTrackingData() {
        return trackingData;
    }

    /**
     * Sets the value of the trackingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingData }
     *     
     */
    public void setTrackingData(TrackingData value) {
        this.trackingData = value;
    }

    /**
     * Gets the value of the googleOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleOrderNumber() {
        return googleOrderNumber;
    }

    /**
     * Sets the value of the googleOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleOrderNumber(String value) {
        this.googleOrderNumber = value;
    }


    public javax.xml.bind.JAXBElement<AddTrackingDataRequest> toJAXB() {
      return com.google.checkout.sdk.util.Utils.objectFactory().createAddTrackingData(this);
    }

    @Override
    public String toString() {
      return com.google.checkout.sdk.util.Utils.toXML(toJAXB());
    }
}
