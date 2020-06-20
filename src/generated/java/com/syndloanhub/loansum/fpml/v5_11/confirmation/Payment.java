//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining payments. Developers of FpML models are encouraged to make use of the SimplePayment type instead of this Payment type. In Transparency view, normally the payer and receiver party references are not used; however they may be provided if necessary for administrative activities such as Reporting Party Determination in FX.
 * 
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PaymentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}PayerReceiver.model"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrAdjustedDate" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.fpml.org/FpML-5/confirmation}PaymentType" minOccurs="0"/&gt;
 *         &lt;element name="settlementInformation" type="{http://www.fpml.org/FpML-5/confirmation}SettlementInformation" minOccurs="0"/&gt;
 *         &lt;element name="discountFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="presentValueAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "paymentAmount",
    "paymentDate",
    "paymentType",
    "settlementInformation",
    "discountFactor",
    "presentValueAmount"
})
public class Payment
    extends PaymentBase
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
    protected NonNegativeMoney paymentAmount;
    protected AdjustableOrAdjustedDate paymentDate;
    protected PaymentType paymentType;
    protected SettlementInformation settlementInformation;
    protected BigDecimal discountFactor;
    protected Money presentValueAmount;
    @XmlAttribute(name = "href")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object href;

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
     *     {@link AdjustableOrAdjustedDate }
     *     
     */
    public AdjustableOrAdjustedDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrAdjustedDate }
     *     
     */
    public void setPaymentDate(AdjustableOrAdjustedDate value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the settlementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation }
     *     
     */
    public SettlementInformation getSettlementInformation() {
        return settlementInformation;
    }

    /**
     * Sets the value of the settlementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation }
     *     
     */
    public void setSettlementInformation(SettlementInformation value) {
        this.settlementInformation = value;
    }

    /**
     * Gets the value of the discountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountFactor() {
        return discountFactor;
    }

    /**
     * Sets the value of the discountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountFactor(BigDecimal value) {
        this.discountFactor = value;
    }

    /**
     * Gets the value of the presentValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    /**
     * Sets the value of the presentValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPresentValueAmount(Money value) {
        this.presentValueAmount = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHref(Object value) {
        this.href = value;
    }

}
