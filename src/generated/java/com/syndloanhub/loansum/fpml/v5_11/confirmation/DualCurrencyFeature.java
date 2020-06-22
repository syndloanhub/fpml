//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Describes the parameters for a dual currency option transaction.
 * 
 * <p>Java class for DualCurrencyFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DualCurrencyFeature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/confirmation}Currency"/&gt;
 *         &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="strike" type="{http://www.fpml.org/FpML-5/confirmation}DualCurrencyStrikePrice"/&gt;
 *         &lt;element name="spotRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="interestAtRisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DualCurrencyFeature", propOrder = {
    "currency",
    "fixingDate",
    "fixingTime",
    "strike",
    "spotRate",
    "interestAtRisk"
})
public class DualCurrencyFeature
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected Currency currency;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate fixingDate;
    protected BusinessCenterTime fixingTime;
    @XmlElement(required = true)
    protected DualCurrencyStrikePrice strike;
    protected BigDecimal spotRate;
    protected boolean interestAtRisk;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the fixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFixingDate() {
        return fixingDate;
    }

    /**
     * Sets the value of the fixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDate(LocalDate value) {
        this.fixingDate = value;
    }

    /**
     * Gets the value of the fixingTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    /**
     * Sets the value of the fixingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setFixingTime(BusinessCenterTime value) {
        this.fixingTime = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link DualCurrencyStrikePrice }
     *     
     */
    public DualCurrencyStrikePrice getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualCurrencyStrikePrice }
     *     
     */
    public void setStrike(DualCurrencyStrikePrice value) {
        this.strike = value;
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

    /**
     * Gets the value of the interestAtRisk property.
     * 
     */
    public boolean isInterestAtRisk() {
        return interestAtRisk;
    }

    /**
     * Sets the value of the interestAtRisk property.
     * 
     */
    public void setInterestAtRisk(boolean value) {
        this.interestAtRisk = value;
    }

}
