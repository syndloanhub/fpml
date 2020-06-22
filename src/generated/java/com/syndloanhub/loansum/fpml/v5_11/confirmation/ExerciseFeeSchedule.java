//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to define a fee or schedule of fees to be payable on the exercise of an option. This fee may be defined as an amount or a percentage of the notional exercised.
 * 
 * <p>Java class for ExerciseFeeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseFeeSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}PayerReceiver.model"/&gt;
 *         &lt;element name="notionalReference" type="{http://www.fpml.org/FpML-5/confirmation}ScheduleReference"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="feeAmountSchedule" type="{http://www.fpml.org/FpML-5/confirmation}AmountSchedule"/&gt;
 *           &lt;element name="feeRateSchedule" type="{http://www.fpml.org/FpML-5/confirmation}Schedule"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="feePaymentDate" type="{http://www.fpml.org/FpML-5/confirmation}RelativeDateOffset"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseFeeSchedule", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "notionalReference",
    "feeAmountSchedule",
    "feeRateSchedule",
    "feePaymentDate"
})
public class ExerciseFeeSchedule
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PartyReference payerPartyReference;
    protected AccountReference payerAccountReference;
    @XmlElement(required = true)
    protected PartyReference receiverPartyReference;
    protected AccountReference receiverAccountReference;
    @XmlElement(required = true)
    protected ScheduleReference notionalReference;
    protected AmountSchedule feeAmountSchedule;
    protected Schedule feeRateSchedule;
    @XmlElement(required = true)
    protected RelativeDateOffset feePaymentDate;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPayerPartyReference(PartyReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the payerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getPayerAccountReference() {
        return payerAccountReference;
    }

    /**
     * Sets the value of the payerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setPayerAccountReference(AccountReference value) {
        this.payerAccountReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setReceiverPartyReference(PartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the receiverAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getReceiverAccountReference() {
        return receiverAccountReference;
    }

    /**
     * Sets the value of the receiverAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setReceiverAccountReference(AccountReference value) {
        this.receiverAccountReference = value;
    }

    /**
     * Gets the value of the notionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleReference }
     *     
     */
    public ScheduleReference getNotionalReference() {
        return notionalReference;
    }

    /**
     * Sets the value of the notionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleReference }
     *     
     */
    public void setNotionalReference(ScheduleReference value) {
        this.notionalReference = value;
    }

    /**
     * Gets the value of the feeAmountSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AmountSchedule }
     *     
     */
    public AmountSchedule getFeeAmountSchedule() {
        return feeAmountSchedule;
    }

    /**
     * Sets the value of the feeAmountSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountSchedule }
     *     
     */
    public void setFeeAmountSchedule(AmountSchedule value) {
        this.feeAmountSchedule = value;
    }

    /**
     * Gets the value of the feeRateSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getFeeRateSchedule() {
        return feeRateSchedule;
    }

    /**
     * Sets the value of the feeRateSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setFeeRateSchedule(Schedule value) {
        this.feeRateSchedule = value;
    }

    /**
     * Gets the value of the feePaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getFeePaymentDate() {
        return feePaymentDate;
    }

    /**
     * Sets the value of the feePaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setFeePaymentDate(RelativeDateOffset value) {
        this.feePaymentDate = value;
    }

}
