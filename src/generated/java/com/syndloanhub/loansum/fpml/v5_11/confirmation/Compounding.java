//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the compounding method and the compounding rate.
 * 
 * <p>Java class for Compounding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compounding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/FpML-5/confirmation}CompoundingMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="compoundingRate" type="{http://www.fpml.org/FpML-5/confirmation}CompoundingRate"/&gt;
 *         &lt;element name="compoundingSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="compoundingDates" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableRelativeOrPeriodicDates2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compounding", propOrder = {
    "compoundingMethod",
    "compoundingRate",
    "compoundingSpread",
    "compoundingDates"
})
public class Compounding
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlSchemaType(name = "token")
    protected CompoundingMethodEnum compoundingMethod;
    @XmlElement(required = true)
    protected CompoundingRate compoundingRate;
    protected BigDecimal compoundingSpread;
    protected AdjustableRelativeOrPeriodicDates2 compoundingDates;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

    /**
     * Gets the value of the compoundingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingRate }
     *     
     */
    public CompoundingRate getCompoundingRate() {
        return compoundingRate;
    }

    /**
     * Sets the value of the compoundingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingRate }
     *     
     */
    public void setCompoundingRate(CompoundingRate value) {
        this.compoundingRate = value;
    }

    /**
     * Gets the value of the compoundingSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompoundingSpread() {
        return compoundingSpread;
    }

    /**
     * Sets the value of the compoundingSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompoundingSpread(BigDecimal value) {
        this.compoundingSpread = value;
    }

    /**
     * Gets the value of the compoundingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public AdjustableRelativeOrPeriodicDates2 getCompoundingDates() {
        return compoundingDates;
    }

    /**
     * Sets the value of the compoundingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public void setCompoundingDates(AdjustableRelativeOrPeriodicDates2 value) {
        this.compoundingDates = value;
    }

}
