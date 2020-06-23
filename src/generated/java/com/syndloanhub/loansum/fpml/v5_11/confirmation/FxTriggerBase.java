//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a european trigger applied to an FX digtal option.
 * 
 * <p>Java class for FxTriggerBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTriggerBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="triggerCondition" type="{http://www.fpml.org/FpML-5/confirmation}TriggerConditionEnum"/&gt;
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/confirmation}QuotedCurrencyPair"/&gt;
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/&gt;
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTriggerBase", propOrder = {
    "triggerCondition",
    "quotedCurrencyPair",
    "triggerRate",
    "spotRate"
})
@XmlSeeAlso({
    FxTrigger.class
})
public class FxTriggerBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TriggerConditionEnum triggerCondition;
    @XmlElement(required = true)
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(required = true)
    protected BigDecimal triggerRate;
    protected BigDecimal spotRate;

    /**
     * Gets the value of the triggerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public TriggerConditionEnum getTriggerCondition() {
        return triggerCondition;
    }

    /**
     * Sets the value of the triggerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public void setTriggerCondition(TriggerConditionEnum value) {
        this.triggerCondition = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpotRate(BigDecimal value) {
        this.spotRate = value;
    }

}
