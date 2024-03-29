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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestReceivedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestReceivedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="refund-amount-notification" type="{http://checkout.google.com/schema/2}RefundAmountNotification" minOccurs="0"/>
 *         &lt;element name="order-state-change-notification" type="{http://checkout.google.com/schema/2}OrderStateChangeNotification" minOccurs="0"/>
 *         &lt;element name="charge-amount-notification" type="{http://checkout.google.com/schema/2}ChargeAmountNotification" minOccurs="0"/>
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
@XmlType(name = "RequestReceivedResponse", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class RequestReceivedResponse {

    @XmlElement(name = "refund-amount-notification", namespace = "http://checkout.google.com/schema/2")
    protected RefundAmountNotification refundAmountNotification;
    @XmlElement(name = "order-state-change-notification", namespace = "http://checkout.google.com/schema/2")
    protected OrderStateChangeNotification orderStateChangeNotification;
    @XmlElement(name = "charge-amount-notification", namespace = "http://checkout.google.com/schema/2")
    protected ChargeAmountNotification chargeAmountNotification;
    @XmlAttribute(name = "serial-number", required = true)
    protected String serialNumber;

    /**
     * Gets the value of the refundAmountNotification property.
     * 
     * @return
     *     possible object is
     *     {@link RefundAmountNotification }
     *     
     */
    public RefundAmountNotification getRefundAmountNotification() {
        return refundAmountNotification;
    }

    /**
     * Sets the value of the refundAmountNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundAmountNotification }
     *     
     */
    public void setRefundAmountNotification(RefundAmountNotification value) {
        this.refundAmountNotification = value;
    }

    /**
     * Gets the value of the orderStateChangeNotification property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStateChangeNotification }
     *     
     */
    public OrderStateChangeNotification getOrderStateChangeNotification() {
        return orderStateChangeNotification;
    }

    /**
     * Sets the value of the orderStateChangeNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStateChangeNotification }
     *     
     */
    public void setOrderStateChangeNotification(OrderStateChangeNotification value) {
        this.orderStateChangeNotification = value;
    }

    /**
     * Gets the value of the chargeAmountNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeAmountNotification }
     *     
     */
    public ChargeAmountNotification getChargeAmountNotification() {
        return chargeAmountNotification;
    }

    /**
     * Sets the value of the chargeAmountNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeAmountNotification }
     *     
     */
    public void setChargeAmountNotification(ChargeAmountNotification value) {
        this.chargeAmountNotification = value;
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


    public javax.xml.bind.JAXBElement<RequestReceivedResponse> toJAXB() {
      return com.google.checkout.sdk.util.Utils.objectFactory().createRequestReceived(this);
    }

    @Override
    public String toString() {
      return com.google.checkout.sdk.util.Utils.toXML(toJAXB());
    }
}
