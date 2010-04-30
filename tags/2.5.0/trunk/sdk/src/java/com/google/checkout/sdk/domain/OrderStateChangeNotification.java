//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.28 at 11:58:56 AM PDT 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderStateChangeNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStateChangeNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="new-fulfillment-order-state" type="{http://checkout.google.com/schema/2}FulfillmentOrderState"/>
 *         &lt;element name="new-financial-order-state" type="{http://checkout.google.com/schema/2}FinancialOrderState"/>
 *         &lt;element name="previous-fulfillment-order-state" type="{http://checkout.google.com/schema/2}FulfillmentOrderState"/>
 *         &lt;element name="previous-financial-order-state" type="{http://checkout.google.com/schema/2}FinancialOrderState"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="google-order-number" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="order-summary" type="{http://checkout.google.com/schema/2}OrderSummary" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="serial-number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStateChangeNotification", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class OrderStateChangeNotification implements com.google.checkout.sdk.notifications.Notification {

    @XmlElement(name = "new-fulfillment-order-state", namespace = "http://checkout.google.com/schema/2", required = true)
    protected FulfillmentOrderState newFulfillmentOrderState;
    @XmlElement(name = "new-financial-order-state", namespace = "http://checkout.google.com/schema/2", required = true)
    protected FinancialOrderState newFinancialOrderState;
    @XmlElement(name = "previous-fulfillment-order-state", namespace = "http://checkout.google.com/schema/2", required = true)
    protected FulfillmentOrderState previousFulfillmentOrderState;
    @XmlElement(name = "previous-financial-order-state", namespace = "http://checkout.google.com/schema/2", required = true)
    protected FinancialOrderState previousFinancialOrderState;
    @XmlElement(namespace = "http://checkout.google.com/schema/2")
    protected String reason;
    @XmlElement(namespace = "http://checkout.google.com/schema/2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "google-order-number", namespace = "http://checkout.google.com/schema/2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String googleOrderNumber;
    @XmlElement(name = "order-summary", namespace = "http://checkout.google.com/schema/2")
    protected OrderSummary orderSummary;
    @XmlAttribute(name = "serial-number", required = true)
    protected String serialNumber;

    /**
     * Gets the value of the newFulfillmentOrderState property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public FulfillmentOrderState getNewFulfillmentOrderState() {
        return newFulfillmentOrderState;
    }

    /**
     * Sets the value of the newFulfillmentOrderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public void setNewFulfillmentOrderState(FulfillmentOrderState value) {
        this.newFulfillmentOrderState = value;
    }

    /**
     * Gets the value of the newFinancialOrderState property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialOrderState }
     *     
     */
    public FinancialOrderState getNewFinancialOrderState() {
        return newFinancialOrderState;
    }

    /**
     * Sets the value of the newFinancialOrderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialOrderState }
     *     
     */
    public void setNewFinancialOrderState(FinancialOrderState value) {
        this.newFinancialOrderState = value;
    }

    /**
     * Gets the value of the previousFulfillmentOrderState property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public FulfillmentOrderState getPreviousFulfillmentOrderState() {
        return previousFulfillmentOrderState;
    }

    /**
     * Sets the value of the previousFulfillmentOrderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentOrderState }
     *     
     */
    public void setPreviousFulfillmentOrderState(FulfillmentOrderState value) {
        this.previousFulfillmentOrderState = value;
    }

    /**
     * Gets the value of the previousFinancialOrderState property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialOrderState }
     *     
     */
    public FinancialOrderState getPreviousFinancialOrderState() {
        return previousFinancialOrderState;
    }

    /**
     * Sets the value of the previousFinancialOrderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialOrderState }
     *     
     */
    public void setPreviousFinancialOrderState(FinancialOrderState value) {
        this.previousFinancialOrderState = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
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

    /**
     * Gets the value of the orderSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSummary }
     *     
     */
    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    /**
     * Sets the value of the orderSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSummary }
     *     
     */
    public void setOrderSummary(OrderSummary value) {
        this.orderSummary = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }


    public javax.xml.bind.JAXBElement<OrderStateChangeNotification> toJAXB() {
      return com.google.checkout.sdk.util.Utils.objectFactory().createOrderStateChangeNotification(this);
    }

    @Override
    public String toString() {
      return com.google.checkout.sdk.util.Utils.toXML(toJAXB());
    }
}
