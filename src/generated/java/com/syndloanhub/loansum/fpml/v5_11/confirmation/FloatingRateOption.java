//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A structure that represents the accruing floating rate option associated within a facility.
 * 
 * <p>Java class for FloatingRateOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}FloatingRateOptionBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/confirmation}Currency"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}Period.model"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="baseRateLimits" type="{http://www.fpml.org/FpML-5/confirmation}RateLimits" minOccurs="0"/&gt;
 *           &lt;element name="allInRateLimits" type="{http://www.fpml.org/FpML-5/confirmation}RateLimits" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="borrowerPartyReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="drawdownNoticeDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *           &lt;element name="fxRateSetNoticeDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *           &lt;element name="rateSetNoticeDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateOption", propOrder = {
    "currency",
    "startDate",
    "endDate",
    "baseRateLimits",
    "allInRateLimits",
    "borrowerPartyReference",
    "drawdownNoticeDays",
    "fxRateSetNoticeDays",
    "rateSetNoticeDays"
})
public class FloatingRateOption
    extends FloatingRateOptionBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected Currency currency;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDate;
    protected RateLimits baseRateLimits;
    protected RateLimits allInRateLimits;
    protected List<PartyReference> borrowerPartyReference;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger drawdownNoticeDays;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fxRateSetNoticeDays;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rateSetNoticeDays;

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(LocalDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(LocalDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the baseRateLimits property.
     * 
     * @return
     *     possible object is
     *     {@link RateLimits }
     *     
     */
    public RateLimits getBaseRateLimits() {
        return baseRateLimits;
    }

    /**
     * Sets the value of the baseRateLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLimits }
     *     
     */
    public void setBaseRateLimits(RateLimits value) {
        this.baseRateLimits = value;
    }

    /**
     * Gets the value of the allInRateLimits property.
     * 
     * @return
     *     possible object is
     *     {@link RateLimits }
     *     
     */
    public RateLimits getAllInRateLimits() {
        return allInRateLimits;
    }

    /**
     * Sets the value of the allInRateLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLimits }
     *     
     */
    public void setAllInRateLimits(RateLimits value) {
        this.allInRateLimits = value;
    }

    /**
     * Gets the value of the borrowerPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getBorrowerPartyReference() {
        if (borrowerPartyReference == null) {
            borrowerPartyReference = new ArrayList<PartyReference>();
        }
        return this.borrowerPartyReference;
    }

    /**
     * Gets the value of the drawdownNoticeDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrawdownNoticeDays() {
        return drawdownNoticeDays;
    }

    /**
     * Sets the value of the drawdownNoticeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrawdownNoticeDays(BigInteger value) {
        this.drawdownNoticeDays = value;
    }

    /**
     * Gets the value of the fxRateSetNoticeDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFxRateSetNoticeDays() {
        return fxRateSetNoticeDays;
    }

    /**
     * Sets the value of the fxRateSetNoticeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFxRateSetNoticeDays(BigInteger value) {
        this.fxRateSetNoticeDays = value;
    }

    /**
     * Gets the value of the rateSetNoticeDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateSetNoticeDays() {
        return rateSetNoticeDays;
    }

    /**
     * Sets the value of the rateSetNoticeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateSetNoticeDays(BigInteger value) {
        this.rateSetNoticeDays = value;
    }

}