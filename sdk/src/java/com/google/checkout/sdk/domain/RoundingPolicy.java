//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.23 at 12:14:48 PM PDT 
//


package com.google.checkout.sdk.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundingPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="mode" type="{http://checkout.google.com/schema/2}RoundingMode"/>
 *         &lt;element name="rule" type="{http://checkout.google.com/schema/2}RoundingRule"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundingPolicy", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class RoundingPolicy {

    @XmlElement(namespace = "http://checkout.google.com/schema/2", required = true)
    protected RoundingMode mode;
    @XmlElement(namespace = "http://checkout.google.com/schema/2", required = true)
    protected RoundingRule rule;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingMode }
     *     
     */
    public RoundingMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingMode }
     *     
     */
    public void setMode(RoundingMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingRule }
     *     
     */
    public RoundingRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingRule }
     *     
     */
    public void setRule(RoundingRule value) {
        this.rule = value;
    }

}
