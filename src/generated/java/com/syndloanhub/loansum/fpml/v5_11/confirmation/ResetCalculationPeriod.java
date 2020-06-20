//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The period calculation details for a calculation/accrual period. This will include information about the dates and duration of the accrual period, the rate fixing(s), the notional in effect, and the amount of the accrual.
 * 
 * <p>Java class for ResetCalculationPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetCalculationPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CashflowCalculationPeriodDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}DayCountAndYearFraction.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetCalculationPeriod", propOrder = {
    "adjustedStartDate",
    "adjustedEndDate",
    "numberOfDays",
    "dayCountFraction",
    "dayCountYearFraction"
})
public class ResetCalculationPeriod
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate adjustedStartDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate adjustedEndDate;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDays;
    protected DayCountFraction dayCountFraction;
    protected BigDecimal dayCountYearFraction;

    /**
     * Gets the value of the adjustedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAdjustedStartDate() {
        return adjustedStartDate;
    }

    /**
     * Sets the value of the adjustedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedStartDate(LocalDate value) {
        this.adjustedStartDate = value;
    }

    /**
     * Gets the value of the adjustedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAdjustedEndDate() {
        return adjustedEndDate;
    }

    /**
     * Sets the value of the adjustedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedEndDate(LocalDate value) {
        this.adjustedEndDate = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDays(BigInteger value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

    /**
     * Gets the value of the dayCountYearFraction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayCountYearFraction() {
        return dayCountYearFraction;
    }

    /**
     * Sets the value of the dayCountYearFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayCountYearFraction(BigDecimal value) {
        this.dayCountYearFraction = value;
    }

}