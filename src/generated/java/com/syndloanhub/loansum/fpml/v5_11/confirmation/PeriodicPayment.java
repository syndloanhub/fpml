//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PeriodicPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PaymentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentFrequency" type="{http://www.fpml.org/FpML-5/confirmation}Period" minOccurs="0"/&gt;
 *         &lt;element name="firstPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="firstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lastRegularPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="rollConvention" type="{http://www.fpml.org/FpML-5/confirmation}RollConventionEnum" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="fixedAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/&gt;
 *           &lt;element name="fixedAmountCalculation" type="{http://www.fpml.org/FpML-5/confirmation}FixedAmountCalculation"/&gt;
 *           &lt;element name="floatingAmountCalculation" type="{http://www.fpml.org/FpML-5/confirmation}FloatingAmountCalculation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="adjustedPaymentDates" type="{http://www.fpml.org/FpML-5/confirmation}AdjustedPaymentDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicPayment", propOrder = {
    "paymentFrequency",
    "firstPeriodStartDate",
    "firstPaymentDate",
    "lastRegularPaymentDate",
    "rollConvention",
    "fixedAmount",
    "fixedAmountCalculation",
    "floatingAmountCalculation",
    "adjustedPaymentDates"
})
public class PeriodicPayment
    extends PaymentBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected Period paymentFrequency;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate firstPeriodStartDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate firstPaymentDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastRegularPaymentDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rollConvention;
    protected Money fixedAmount;
    protected FixedAmountCalculation fixedAmountCalculation;
    protected FloatingAmountCalculation floatingAmountCalculation;
    protected List<AdjustedPaymentDates> adjustedPaymentDates;

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPaymentFrequency(Period value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the firstPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFirstPeriodStartDate() {
        return firstPeriodStartDate;
    }

    /**
     * Sets the value of the firstPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPeriodStartDate(LocalDate value) {
        this.firstPeriodStartDate = value;
    }

    /**
     * Gets the value of the firstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFirstPaymentDate() {
        return firstPaymentDate;
    }

    /**
     * Sets the value of the firstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPaymentDate(LocalDate value) {
        this.firstPaymentDate = value;
    }

    /**
     * Gets the value of the lastRegularPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLastRegularPaymentDate() {
        return lastRegularPaymentDate;
    }

    /**
     * Sets the value of the lastRegularPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRegularPaymentDate(LocalDate value) {
        this.lastRegularPaymentDate = value;
    }

    /**
     * Gets the value of the rollConvention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollConvention() {
        return rollConvention;
    }

    /**
     * Sets the value of the rollConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollConvention(String value) {
        this.rollConvention = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFixedAmount(Money value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the fixedAmountCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FixedAmountCalculation }
     *     
     */
    public FixedAmountCalculation getFixedAmountCalculation() {
        return fixedAmountCalculation;
    }

    /**
     * Sets the value of the fixedAmountCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedAmountCalculation }
     *     
     */
    public void setFixedAmountCalculation(FixedAmountCalculation value) {
        this.fixedAmountCalculation = value;
    }

    /**
     * Gets the value of the floatingAmountCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingAmountCalculation }
     *     
     */
    public FloatingAmountCalculation getFloatingAmountCalculation() {
        return floatingAmountCalculation;
    }

    /**
     * Sets the value of the floatingAmountCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingAmountCalculation }
     *     
     */
    public void setFloatingAmountCalculation(FloatingAmountCalculation value) {
        this.floatingAmountCalculation = value;
    }

    /**
     * Gets the value of the adjustedPaymentDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustedPaymentDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustedPaymentDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustedPaymentDates }
     * 
     * 
     */
    public List<AdjustedPaymentDates> getAdjustedPaymentDates() {
        if (adjustedPaymentDates == null) {
            adjustedPaymentDates = new ArrayList<AdjustedPaymentDates>();
        }
        return this.adjustedPaymentDates;
    }

}
