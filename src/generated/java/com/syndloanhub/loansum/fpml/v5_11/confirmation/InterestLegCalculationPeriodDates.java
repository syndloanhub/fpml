//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Component that holds the various dates used to specify the interest leg of the return swap. It is used to define the InterestPeriodDates identifyer.
 * 
 * <p>Java class for InterestLegCalculationPeriodDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestLegCalculationPeriodDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/&gt;
 *         &lt;element name="terminationDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/&gt;
 *         &lt;element name="interestLegResetDates" type="{http://www.fpml.org/FpML-5/confirmation}InterestLegResetDates"/&gt;
 *         &lt;element name="interestLegPaymentDates" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableRelativeOrPeriodicDates2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestLegCalculationPeriodDates", propOrder = {
    "effectiveDate",
    "terminationDate",
    "interestLegResetDates",
    "interestLegPaymentDates"
})
public class InterestLegCalculationPeriodDates
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate effectiveDate;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate terminationDate;
    @XmlElement(required = true)
    protected InterestLegResetDates interestLegResetDates;
    @XmlElement(required = true)
    protected AdjustableRelativeOrPeriodicDates2 interestLegPaymentDates;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setEffectiveDate(AdjustableOrRelativeDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setTerminationDate(AdjustableOrRelativeDate value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the interestLegResetDates property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLegResetDates }
     *     
     */
    public InterestLegResetDates getInterestLegResetDates() {
        return interestLegResetDates;
    }

    /**
     * Sets the value of the interestLegResetDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLegResetDates }
     *     
     */
    public void setInterestLegResetDates(InterestLegResetDates value) {
        this.interestLegResetDates = value;
    }

    /**
     * Gets the value of the interestLegPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public AdjustableRelativeOrPeriodicDates2 getInterestLegPaymentDates() {
        return interestLegPaymentDates;
    }

    /**
     * Sets the value of the interestLegPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public void setInterestLegPaymentDates(AdjustableRelativeOrPeriodicDates2 value) {
        this.interestLegPaymentDates = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
