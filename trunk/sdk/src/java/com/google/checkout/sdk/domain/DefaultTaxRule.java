//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.28 at 11:58:56 AM PDT 
//


package com.google.checkout.sdk.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultTaxRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultTaxRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="shipping-taxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tax-area" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="us-state-area" type="{http://checkout.google.com/schema/2}USStateArea"/>
 *                   &lt;element name="us-zip-area" type="{http://checkout.google.com/schema/2}USZipArea"/>
 *                   &lt;element name="us-country-area" type="{http://checkout.google.com/schema/2}USCountryArea"/>
 *                   &lt;element name="postal-area" type="{http://checkout.google.com/schema/2}PostalArea"/>
 *                   &lt;element name="world-area" type="{http://checkout.google.com/schema/2}WorldArea"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tax-areas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="us-state-area" type="{http://checkout.google.com/schema/2}USStateArea"/>
 *                     &lt;element name="us-zip-area" type="{http://checkout.google.com/schema/2}USZipArea"/>
 *                     &lt;element name="us-country-area" type="{http://checkout.google.com/schema/2}USCountryArea"/>
 *                     &lt;element name="postal-area" type="{http://checkout.google.com/schema/2}PostalArea"/>
 *                     &lt;element name="world-area" type="{http://checkout.google.com/schema/2}WorldArea"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultTaxRule", namespace = "http://checkout.google.com/schema/2", propOrder = {

})
public class DefaultTaxRule {

    @XmlElement(name = "shipping-taxed", namespace = "http://checkout.google.com/schema/2")
    protected Boolean shippingTaxed;
    @XmlElement(namespace = "http://checkout.google.com/schema/2")
    protected Double rate;
    @XmlElement(name = "tax-area", namespace = "http://checkout.google.com/schema/2")
    protected DefaultTaxRule.TaxArea taxArea;
    @XmlElement(name = "tax-areas", namespace = "http://checkout.google.com/schema/2")
    protected DefaultTaxRule.TaxAreas taxAreas;

    /**
     * Gets the value of the shippingTaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingTaxed() {
        return shippingTaxed;
    }

    /**
     * Sets the value of the shippingTaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingTaxed(Boolean value) {
        this.shippingTaxed = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxArea property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTaxRule.TaxArea }
     *     
     */
    public DefaultTaxRule.TaxArea getTaxArea() {
        return taxArea;
    }

    /**
     * Sets the value of the taxArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTaxRule.TaxArea }
     *     
     */
    public void setTaxArea(DefaultTaxRule.TaxArea value) {
        this.taxArea = value;
    }

    /**
     * Gets the value of the taxAreas property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTaxRule.TaxAreas }
     *     
     */
    public DefaultTaxRule.TaxAreas getTaxAreas() {
        return taxAreas;
    }

    /**
     * Sets the value of the taxAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTaxRule.TaxAreas }
     *     
     */
    public void setTaxAreas(DefaultTaxRule.TaxAreas value) {
        this.taxAreas = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="us-state-area" type="{http://checkout.google.com/schema/2}USStateArea"/>
     *         &lt;element name="us-zip-area" type="{http://checkout.google.com/schema/2}USZipArea"/>
     *         &lt;element name="us-country-area" type="{http://checkout.google.com/schema/2}USCountryArea"/>
     *         &lt;element name="postal-area" type="{http://checkout.google.com/schema/2}PostalArea"/>
     *         &lt;element name="world-area" type="{http://checkout.google.com/schema/2}WorldArea"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usStateArea",
        "usZipArea",
        "usCountryArea",
        "postalArea",
        "worldArea"
    })
    public static class TaxArea {

        @XmlElement(name = "us-state-area", namespace = "http://checkout.google.com/schema/2")
        protected USStateArea usStateArea;
        @XmlElement(name = "us-zip-area", namespace = "http://checkout.google.com/schema/2")
        protected USZipArea usZipArea;
        @XmlElement(name = "us-country-area", namespace = "http://checkout.google.com/schema/2")
        protected USCountryArea usCountryArea;
        @XmlElement(name = "postal-area", namespace = "http://checkout.google.com/schema/2")
        protected PostalArea postalArea;
        @XmlElement(name = "world-area", namespace = "http://checkout.google.com/schema/2")
        protected WorldArea worldArea;

        /**
         * Gets the value of the usStateArea property.
         * 
         * @return
         *     possible object is
         *     {@link USStateArea }
         *     
         */
        public USStateArea getUsStateArea() {
            return usStateArea;
        }

        /**
         * Sets the value of the usStateArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link USStateArea }
         *     
         */
        public void setUsStateArea(USStateArea value) {
            this.usStateArea = value;
        }

        /**
         * Gets the value of the usZipArea property.
         * 
         * @return
         *     possible object is
         *     {@link USZipArea }
         *     
         */
        public USZipArea getUsZipArea() {
            return usZipArea;
        }

        /**
         * Sets the value of the usZipArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link USZipArea }
         *     
         */
        public void setUsZipArea(USZipArea value) {
            this.usZipArea = value;
        }

        /**
         * Gets the value of the usCountryArea property.
         * 
         * @return
         *     possible object is
         *     {@link USCountryArea }
         *     
         */
        public USCountryArea getUsCountryArea() {
            return usCountryArea;
        }

        /**
         * Sets the value of the usCountryArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link USCountryArea }
         *     
         */
        public void setUsCountryArea(USCountryArea value) {
            this.usCountryArea = value;
        }

        /**
         * Gets the value of the postalArea property.
         * 
         * @return
         *     possible object is
         *     {@link PostalArea }
         *     
         */
        public PostalArea getPostalArea() {
            return postalArea;
        }

        /**
         * Sets the value of the postalArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link PostalArea }
         *     
         */
        public void setPostalArea(PostalArea value) {
            this.postalArea = value;
        }

        /**
         * Gets the value of the worldArea property.
         * 
         * @return
         *     possible object is
         *     {@link WorldArea }
         *     
         */
        public WorldArea getWorldArea() {
            return worldArea;
        }

        /**
         * Sets the value of the worldArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link WorldArea }
         *     
         */
        public void setWorldArea(WorldArea value) {
            this.worldArea = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="us-state-area" type="{http://checkout.google.com/schema/2}USStateArea"/>
     *           &lt;element name="us-zip-area" type="{http://checkout.google.com/schema/2}USZipArea"/>
     *           &lt;element name="us-country-area" type="{http://checkout.google.com/schema/2}USCountryArea"/>
     *           &lt;element name="postal-area" type="{http://checkout.google.com/schema/2}PostalArea"/>
     *           &lt;element name="world-area" type="{http://checkout.google.com/schema/2}WorldArea"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usStateAreaOrUsZipAreaOrUsCountryArea"
    })
    public static class TaxAreas {

        @XmlElements({
            @XmlElement(name = "us-zip-area", namespace = "http://checkout.google.com/schema/2", type = USZipArea.class),
            @XmlElement(name = "us-country-area", namespace = "http://checkout.google.com/schema/2", type = USCountryArea.class),
            @XmlElement(name = "world-area", namespace = "http://checkout.google.com/schema/2", type = WorldArea.class),
            @XmlElement(name = "postal-area", namespace = "http://checkout.google.com/schema/2", type = PostalArea.class),
            @XmlElement(name = "us-state-area", namespace = "http://checkout.google.com/schema/2", type = USStateArea.class)
        })
        protected List<Object> usStateAreaOrUsZipAreaOrUsCountryArea;

        /**
         * Gets the value of the usStateAreaOrUsZipAreaOrUsCountryArea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usStateAreaOrUsZipAreaOrUsCountryArea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsStateAreaOrUsZipAreaOrUsCountryArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USZipArea }
         * {@link USCountryArea }
         * {@link WorldArea }
         * {@link PostalArea }
         * {@link USStateArea }
         * 
         * 
         */
        public List<Object> getUsStateAreaOrUsZipAreaOrUsCountryArea() {
            if (usStateAreaOrUsZipAreaOrUsCountryArea == null) {
                usStateAreaOrUsZipAreaOrUsCountryArea = new ArrayList<Object>();
            }
            return this.usStateAreaOrUsZipAreaOrUsCountryArea;
        }

    }

}
