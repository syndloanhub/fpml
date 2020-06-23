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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoTouchLowerBarrierObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoTouchLowerBarrierObservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="triggerRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/confirmation}QuotedCurrencyPair"/&gt;
 *           &lt;element name="minimumObservedRate" type="{http://www.fpml.org/FpML-5/confirmation}ObservedRate" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="triggerPrice" type="{http://www.fpml.org/FpML-5/confirmation}PositiveMoney"/&gt;
 *           &lt;element name="minimumObservedPrice" type="{http://www.fpml.org/FpML-5/confirmation}ObservedPrice" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoTouchLowerBarrierObservation", propOrder = {
    "triggerRate",
    "quotedCurrencyPair",
    "minimumObservedRate",
    "triggerPrice",
    "minimumObservedPrice"
})
public class NoTouchLowerBarrierObservation implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BigDecimal triggerRate;
    protected QuotedCurrencyPair quotedCurrencyPair;
    protected ObservedRate minimumObservedRate;
    protected PositiveMoney triggerPrice;
    protected ObservedPrice minimumObservedPrice;

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
     * Gets the value of the minimumObservedRate property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedRate }
     *     
     */
    public ObservedRate getMinimumObservedRate() {
        return minimumObservedRate;
    }

    /**
     * Sets the value of the minimumObservedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedRate }
     *     
     */
    public void setMinimumObservedRate(ObservedRate value) {
        this.minimumObservedRate = value;
    }

    /**
     * Gets the value of the triggerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveMoney }
     *     
     */
    public PositiveMoney getTriggerPrice() {
        return triggerPrice;
    }

    /**
     * Sets the value of the triggerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveMoney }
     *     
     */
    public void setTriggerPrice(PositiveMoney value) {
        this.triggerPrice = value;
    }

    /**
     * Gets the value of the minimumObservedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedPrice }
     *     
     */
    public ObservedPrice getMinimumObservedPrice() {
        return minimumObservedPrice;
    }

    /**
     * Sets the value of the minimumObservedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedPrice }
     *     
     */
    public void setMinimumObservedPrice(ObservedPrice value) {
        this.minimumObservedPrice = value;
    }

}
