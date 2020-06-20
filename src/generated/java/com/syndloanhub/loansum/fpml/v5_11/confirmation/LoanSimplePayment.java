//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type to specified payments in a simpler fashion than the Payment type. This construct should be used from the version 4.3 onwards.
 * 
 * <p>Java class for LoanSimplePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanSimplePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PaymentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}SimplePayerReceiver.model"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanSimplePayment", propOrder = {
    "payerPartyReference",
    "receiverPartyReference",
    "paymentAmount",
    "paymentDate"
})
@XmlSeeAlso({
    EventPayment.class,
    LoanAllocationPayment.class,
    LoanTradePayment.class
})
public class LoanSimplePayment
    extends PaymentBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PartyReference payerPartyReference;
    @XmlElement(required = true)
    protected PartyReference receiverPartyReference;
    @XmlElement(required = true)
    protected NonNegativeMoney paymentAmount;
    @XmlElement(required = true)
    protected AdjustableDate paymentDate;

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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPaymentAmount(NonNegativeMoney value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setPaymentDate(AdjustableDate value) {
        this.paymentDate = value;
    }

}
