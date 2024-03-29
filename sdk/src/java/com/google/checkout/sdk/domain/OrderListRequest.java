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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="financial-state" type="{http://checkout.google.com/schema/2}FinancialOrderState" minOccurs="0"/>
 *         &lt;element name="fulfillment-state" type="{http://checkout.google.com/schema/2}FulfillmentOrderState" minOccurs="0"/>
 *         &lt;element name="date-time-zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="start-date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="end-date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderListRequest", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class OrderListRequest {

    @XmlElement(name = "financial-state", namespace = "http://checkout.google.com/schema/2")
    protected FinancialOrderState financialState;
    @XmlElement(name = "fulfillment-state", namespace = "http://checkout.google.com/schema/2")
    protected FulfillmentOrderState fulfillmentState;
    @XmlElement(name = "date-time-zone", namespace = "http://checkout.google.com/schema/2")
    protected String dateTimeZone;
    @XmlAttribute(name = "start-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "end-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the financialState property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialOrderState }
     *     
     */
    public FinancialOrderState getFinancialState() {
        return financialState;
    }

    /**
     * Sets the value of the financialState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialOrderState }
     *     
     */
    public void setFinancialState(FinancialOrderState value) {
        this.financialState = value;
    }

    /**
     * Gets the value of the fulfillmentState property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public FulfillmentOrderState getFulfillmentState() {
        return fulfillmentState;
    }

    /**
     * Sets the value of the fulfillmentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public void setFulfillmentState(FulfillmentOrderState value) {
        this.fulfillmentState = value;
    }

    /**
     * Gets the value of the dateTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeZone() {
        return dateTimeZone;
    }

    /**
     * Sets the value of the dateTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeZone(String value) {
        this.dateTimeZone = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }


    public javax.xml.bind.JAXBElement<OrderListRequest> toJAXB() {
      return com.google.checkout.sdk.util.Utils.objectFactory().createOrderListRequest(this);
    }

    @Override
    public String toString() {
      return com.google.checkout.sdk.util.Utils.toXML(toJAXB());
    }
}
