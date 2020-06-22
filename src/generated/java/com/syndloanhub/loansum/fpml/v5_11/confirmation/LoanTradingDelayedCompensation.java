//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that incorporates elements of interest and fee accruals, for the purpose of defining delayed compensation.
 * 
 * <p>Java class for LoanTradingDelayedCompensation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTradingDelayedCompensation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="amount" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}SimplePayerReceiver.model" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LoanTradingSettlementAccruals.model"/&gt;
 *         &lt;element name="nonAccruingFee" type="{http://www.fpml.org/FpML-5/confirmation}LoanTradingNonAccruingFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanTradingDelayedCompensation", propOrder = {
    "amount",
    "payerPartyReference",
    "receiverPartyReference",
    "facilityAccrual",
    "loanContractInterestAccrual",
    "letterOfCreditAccrual",
    "nonAccruingFee"
})
public class LoanTradingDelayedCompensation
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected NonNegativeMoney amount;
    protected PartyReference payerPartyReference;
    protected PartyReference receiverPartyReference;
    protected List<LoanTradingFacilityFeeAccrual> facilityAccrual;
    protected List<LoanTradingLoanContractAccrual> loanContractInterestAccrual;
    protected List<LoanTradingLetterOfCreditAccrual> letterOfCreditAccrual;
    protected List<LoanTradingNonAccruingFee> nonAccruingFee;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setAmount(NonNegativeMoney value) {
        this.amount = value;
    }

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
     * Gets the value of the facilityAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanTradingFacilityFeeAccrual }
     * 
     * 
     */
    public List<LoanTradingFacilityFeeAccrual> getFacilityAccrual() {
        if (facilityAccrual == null) {
            facilityAccrual = new ArrayList<LoanTradingFacilityFeeAccrual>();
        }
        return this.facilityAccrual;
    }

    /**
     * Gets the value of the loanContractInterestAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractInterestAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractInterestAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanTradingLoanContractAccrual }
     * 
     * 
     */
    public List<LoanTradingLoanContractAccrual> getLoanContractInterestAccrual() {
        if (loanContractInterestAccrual == null) {
            loanContractInterestAccrual = new ArrayList<LoanTradingLoanContractAccrual>();
        }
        return this.loanContractInterestAccrual;
    }

    /**
     * Gets the value of the letterOfCreditAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterOfCreditAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterOfCreditAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanTradingLetterOfCreditAccrual }
     * 
     * 
     */
    public List<LoanTradingLetterOfCreditAccrual> getLetterOfCreditAccrual() {
        if (letterOfCreditAccrual == null) {
            letterOfCreditAccrual = new ArrayList<LoanTradingLetterOfCreditAccrual>();
        }
        return this.letterOfCreditAccrual;
    }

    /**
     * Gets the value of the nonAccruingFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonAccruingFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonAccruingFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanTradingNonAccruingFee }
     * 
     * 
     */
    public List<LoanTradingNonAccruingFee> getNonAccruingFee() {
        if (nonAccruingFee == null) {
            nonAccruingFee = new ArrayList<LoanTradingNonAccruingFee>();
        }
        return this.nonAccruingFee;
    }

}
