//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An event representing the capitalization of interest amounts for a given accrual period against a single loan contract.
 * 
 * <p>Java class for InterestCapitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestCapitalization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}Period.model"/&gt;
 *         &lt;element name="calculationMethod" type="{http://www.fpml.org/FpML-5/confirmation}InterestCalculationMethodEnum"/&gt;
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/confirmation}MoneyWithParticipantShare"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="accrualSchedule" type="{http://www.fpml.org/FpML-5/confirmation}AccrualPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="projection" type="{http://www.fpml.org/FpML-5/confirmation}PaymentProjection" minOccurs="0"/&gt;
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
@XmlType(name = "InterestCapitalization", propOrder = {
    "startDate",
    "endDate",
    "calculationMethod",
    "amount",
    "accrualSchedule",
    "projection"
})
public class InterestCapitalization
    extends AbstractLoanContractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected InterestCalculationMethodEnum calculationMethod;
    @XmlElement(required = true)
    protected MoneyWithParticipantShare amount;
    protected List<AccrualPeriod> accrualSchedule;
    protected PaymentProjection projection;

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
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCalculationMethodEnum }
     *     
     */
    public InterestCalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCalculationMethodEnum }
     *     
     */
    public void setCalculationMethod(InterestCalculationMethodEnum value) {
        this.calculationMethod = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setAmount(MoneyWithParticipantShare value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accrualSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accrualSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccrualSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccrualPeriod }
     * 
     * 
     */
    public List<AccrualPeriod> getAccrualSchedule() {
        if (accrualSchedule == null) {
            accrualSchedule = new ArrayList<AccrualPeriod>();
        }
        return this.accrualSchedule;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProjection }
     *     
     */
    public PaymentProjection getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProjection }
     *     
     */
    public void setProjection(PaymentProjection value) {
        this.projection = value;
    }

}
