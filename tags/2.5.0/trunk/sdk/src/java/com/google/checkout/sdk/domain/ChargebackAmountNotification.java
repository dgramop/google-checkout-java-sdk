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
 * <p>Java class for ChargebackAmountNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargebackAmountNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="google-order-number" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="latest-fee-refund-amount" type="{http://checkout.google.com/schema/2}Money" minOccurs="0"/>
 *         &lt;element name="total-chargeback-amount" type="{http://checkout.google.com/schema/2}Money"/>
 *         &lt;element name="latest-chargeback-amount" type="{http://checkout.google.com/schema/2}Money"/>
 *         &lt;element name="latest-chargeback-fee-amount" type="{http://checkout.google.com/schema/2}Money" minOccurs="0"/>
 *         &lt;element name="latest-promotion-chargeback-amount" type="{http://checkout.google.com/schema/2}Money" minOccurs="0"/>
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
@XmlType(name = "ChargebackAmountNotification", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class ChargebackAmountNotification implements com.google.checkout.sdk.notifications.Notification {

    @XmlElement(namespace = "http://checkout.google.com/schema/2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "google-order-number", namespace = "http://checkout.google.com/schema/2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String googleOrderNumber;
    @XmlElement(name = "latest-fee-refund-amount", namespace = "http://checkout.google.com/schema/2")
    protected Money latestFeeRefundAmount;
    @XmlElement(name = "total-chargeback-amount", namespace = "http://checkout.google.com/schema/2", required = true)
    protected Money totalChargebackAmount;
    @XmlElement(name = "latest-chargeback-amount", namespace = "http://checkout.google.com/schema/2", required = true)
    protected Money latestChargebackAmount;
    @XmlElement(name = "latest-chargeback-fee-amount", namespace = "http://checkout.google.com/schema/2")
    protected Money latestChargebackFeeAmount;
    @XmlElement(name = "latest-promotion-chargeback-amount", namespace = "http://checkout.google.com/schema/2")
    protected Money latestPromotionChargebackAmount;
    @XmlElement(name = "order-summary", namespace = "http://checkout.google.com/schema/2")
    protected OrderSummary orderSummary;
    @XmlAttribute(name = "serial-number", required = true)
    protected String serialNumber;

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
     * Gets the value of the latestFeeRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLatestFeeRefundAmount() {
        return latestFeeRefundAmount;
    }

    /**
     * Sets the value of the latestFeeRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLatestFeeRefundAmount(Money value) {
        this.latestFeeRefundAmount = value;
    }

    /**
     * Gets the value of the totalChargebackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalChargebackAmount() {
        return totalChargebackAmount;
    }

    /**
     * Sets the value of the totalChargebackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalChargebackAmount(Money value) {
        this.totalChargebackAmount = value;
    }

    /**
     * Gets the value of the latestChargebackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLatestChargebackAmount() {
        return latestChargebackAmount;
    }

    /**
     * Sets the value of the latestChargebackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLatestChargebackAmount(Money value) {
        this.latestChargebackAmount = value;
    }

    /**
     * Gets the value of the latestChargebackFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLatestChargebackFeeAmount() {
        return latestChargebackFeeAmount;
    }

    /**
     * Sets the value of the latestChargebackFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLatestChargebackFeeAmount(Money value) {
        this.latestChargebackFeeAmount = value;
    }

    /**
     * Gets the value of the latestPromotionChargebackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLatestPromotionChargebackAmount() {
        return latestPromotionChargebackAmount;
    }

    /**
     * Sets the value of the latestPromotionChargebackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLatestPromotionChargebackAmount(Money value) {
        this.latestPromotionChargebackAmount = value;
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


    public javax.xml.bind.JAXBElement<ChargebackAmountNotification> toJAXB() {
      return com.google.checkout.sdk.util.Utils.objectFactory().createChargebackAmountNotification(this);
    }

    @Override
    public String toString() {
      return com.google.checkout.sdk.util.Utils.toXML(toJAXB());
    }
}
