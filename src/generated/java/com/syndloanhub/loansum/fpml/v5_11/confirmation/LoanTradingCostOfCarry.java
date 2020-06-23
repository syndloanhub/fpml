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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that incorporates elements of an accrual calculation, for the purpose of defining cost-of-carry.
 * 
 * <p>Java class for LoanTradingCostOfCarry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTradingCostOfCarry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="amount" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}SimplePayerReceiver.model" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="accrual" type="{http://www.fpml.org/FpML-5/confirmation}LoanTradingCostOfCarryAccrual" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanTradingCostOfCarry", propOrder = {
    "amount",
    "payerPartyReference",
    "receiverPartyReference",
    "accrual"
})
public class LoanTradingCostOfCarry
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected NonNegativeMoney amount;
    protected PartyReference payerPartyReference;
    protected PartyReference receiverPartyReference;
    protected LoanTradingCostOfCarryAccrual accrual;

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
     * Gets the value of the accrual property.
     * 
     * @return
     *     possible object is
     *     {@link LoanTradingCostOfCarryAccrual }
     *     
     */
    public LoanTradingCostOfCarryAccrual getAccrual() {
        return accrual;
    }

    /**
     * Sets the value of the accrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanTradingCostOfCarryAccrual }
     *     
     */
    public void setAccrual(LoanTradingCostOfCarryAccrual value) {
        this.accrual = value;
    }

}
