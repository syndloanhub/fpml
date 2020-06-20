//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Simple product representation providing key information about a variety of different products. Generic products - for use in Transparency reporting to define a product that represents an OTC derivative transaction whose economics are not fully described using an FpML schema. In other views, generic products are present for convenience to support internal messaging and workflows that are cross-product. Generic products are not full trade representations as such they are not intended to be used for confirming trades.
 * 
 * <p>Java class for GenericProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Product"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="multiLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BuyerSeller.model"/&gt;
 *           &lt;element name="counterpartyReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/confirmation}SimplePayment" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDate2"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDate2" minOccurs="0"/&gt;
 *         &lt;element name="terminationDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDate2"/&gt;
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/confirmation}TradeUnderlyer2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/confirmation}CashflowNotional" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}GenericCommodityAttributes.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}GenericEquityAttributes.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}GenericOptionAttributes.model" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequency" type="{http://www.fpml.org/FpML-5/confirmation}GenericFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resetFrequency" type="{http://www.fpml.org/FpML-5/confirmation}GenericResetFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedCurrency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/confirmation}SettlementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/confirmation}Payment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericProduct", propOrder = {
    "multiLeg",
    "buyerPartyReference",
    "buyerAccountReference",
    "sellerPartyReference",
    "sellerAccountReference",
    "counterpartyReference",
    "premium",
    "effectiveDate",
    "expirationDate",
    "terminationDate",
    "underlyer",
    "notional",
    "grade",
    "settlementPeriods",
    "loadType",
    "quantity",
    "quantityFrequency",
    "fixedPrice",
    "interconnectionPoint",
    "optionEntitlement",
    "numberOfOptions",
    "optionType",
    "commencementDate",
    "exerciseStyle",
    "strike",
    "feature",
    "paymentFrequency",
    "resetFrequency",
    "settlementCurrency",
    "settlementType",
    "additionalPayment"
})
public class GenericProduct
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected Boolean multiLeg;
    protected PartyReference buyerPartyReference;
    protected AccountReference buyerAccountReference;
    protected PartyReference sellerPartyReference;
    protected AccountReference sellerAccountReference;
    protected List<PartyReference> counterpartyReference;
    protected SimplePayment premium;
    @XmlElement(required = true)
    protected AdjustableDate2 effectiveDate;
    protected AdjustableDate2 expirationDate;
    @XmlElement(required = true)
    protected AdjustableDate2 terminationDate;
    protected List<TradeUnderlyer2> underlyer;
    protected List<CashflowNotional> notional;
    protected List<GenericCommodityGrade> grade;
    protected List<GenericCommodityDeliveryPeriod> settlementPeriods;
    @XmlSchemaType(name = "token")
    protected LoadTypeEnum loadType;
    protected BigDecimal quantity;
    protected CommodityQuantityFrequency quantityFrequency;
    protected FixedPrice fixedPrice;
    protected InterconnectionPoint interconnectionPoint;
    protected BigDecimal optionEntitlement;
    protected BigDecimal numberOfOptions;
    protected OptionType optionType;
    protected AdjustableDate2 commencementDate;
    protected GenericExerciseStyle exerciseStyle;
    protected List<GenericOptionStrike> strike;
    protected List<GenericProductFeature> feature;
    protected List<GenericFrequency> paymentFrequency;
    protected List<GenericResetFrequency> resetFrequency;
    protected List<IdentifiedCurrency> settlementCurrency;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    protected List<Payment> additionalPayment;

    /**
     * Gets the value of the multiLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiLeg() {
        return multiLeg;
    }

    /**
     * Sets the value of the multiLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiLeg(Boolean value) {
        this.multiLeg = value;
    }

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBuyerPartyReference(PartyReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the buyerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getBuyerAccountReference() {
        return buyerAccountReference;
    }

    /**
     * Sets the value of the buyerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setBuyerAccountReference(AccountReference value) {
        this.buyerAccountReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSellerPartyReference(PartyReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the sellerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getSellerAccountReference() {
        return sellerAccountReference;
    }

    /**
     * Sets the value of the sellerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setSellerAccountReference(AccountReference value) {
        this.sellerAccountReference = value;
    }

    /**
     * Gets the value of the counterpartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterpartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterpartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getCounterpartyReference() {
        if (counterpartyReference == null) {
            counterpartyReference = new ArrayList<PartyReference>();
        }
        return this.counterpartyReference;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setPremium(SimplePayment value) {
        this.premium = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setEffectiveDate(AdjustableDate2 value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setExpirationDate(AdjustableDate2 value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setTerminationDate(AdjustableDate2 value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlyer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlyer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeUnderlyer2 }
     * 
     * 
     */
    public List<TradeUnderlyer2> getUnderlyer() {
        if (underlyer == null) {
            underlyer = new ArrayList<TradeUnderlyer2>();
        }
        return this.underlyer;
    }

    /**
     * Gets the value of the notional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashflowNotional }
     * 
     * 
     */
    public List<CashflowNotional> getNotional() {
        if (notional == null) {
            notional = new ArrayList<CashflowNotional>();
        }
        return this.notional;
    }

    /**
     * Gets the value of the grade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericCommodityGrade }
     * 
     * 
     */
    public List<GenericCommodityGrade> getGrade() {
        if (grade == null) {
            grade = new ArrayList<GenericCommodityGrade>();
        }
        return this.grade;
    }

    /**
     * Gets the value of the settlementPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericCommodityDeliveryPeriod }
     * 
     * 
     */
    public List<GenericCommodityDeliveryPeriod> getSettlementPeriods() {
        if (settlementPeriods == null) {
            settlementPeriods = new ArrayList<GenericCommodityDeliveryPeriod>();
        }
        return this.settlementPeriods;
    }

    /**
     * Gets the value of the loadType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Sets the value of the loadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityQuantityFrequency }
     *     
     */
    public CommodityQuantityFrequency getQuantityFrequency() {
        return quantityFrequency;
    }

    /**
     * Sets the value of the quantityFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityQuantityFrequency }
     *     
     */
    public void setQuantityFrequency(CommodityQuantityFrequency value) {
        this.quantityFrequency = value;
    }

    /**
     * Gets the value of the fixedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPrice }
     *     
     */
    public FixedPrice getFixedPrice() {
        return fixedPrice;
    }

    /**
     * Sets the value of the fixedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPrice }
     *     
     */
    public void setFixedPrice(FixedPrice value) {
        this.fixedPrice = value;
    }

    /**
     * Gets the value of the interconnectionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link InterconnectionPoint }
     *     
     */
    public InterconnectionPoint getInterconnectionPoint() {
        return interconnectionPoint;
    }

    /**
     * Sets the value of the interconnectionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterconnectionPoint }
     *     
     */
    public void setInterconnectionPoint(InterconnectionPoint value) {
        this.interconnectionPoint = value;
    }

    /**
     * Gets the value of the optionEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionEntitlement() {
        return optionEntitlement;
    }

    /**
     * Sets the value of the optionEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionEntitlement(BigDecimal value) {
        this.optionEntitlement = value;
    }

    /**
     * Gets the value of the numberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfOptions() {
        return numberOfOptions;
    }

    /**
     * Sets the value of the numberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfOptions(BigDecimal value) {
        this.numberOfOptions = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType }
     *     
     */
    public OptionType getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType }
     *     
     */
    public void setOptionType(OptionType value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the commencementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getCommencementDate() {
        return commencementDate;
    }

    /**
     * Sets the value of the commencementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setCommencementDate(AdjustableDate2 value) {
        this.commencementDate = value;
    }

    /**
     * Gets the value of the exerciseStyle property.
     * 
     * @return
     *     possible object is
     *     {@link GenericExerciseStyle }
     *     
     */
    public GenericExerciseStyle getExerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Sets the value of the exerciseStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericExerciseStyle }
     *     
     */
    public void setExerciseStyle(GenericExerciseStyle value) {
        this.exerciseStyle = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strike property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrike().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOptionStrike }
     * 
     * 
     */
    public List<GenericOptionStrike> getStrike() {
        if (strike == null) {
            strike = new ArrayList<GenericOptionStrike>();
        }
        return this.strike;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericProductFeature }
     * 
     * 
     */
    public List<GenericProductFeature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<GenericProductFeature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericFrequency }
     * 
     * 
     */
    public List<GenericFrequency> getPaymentFrequency() {
        if (paymentFrequency == null) {
            paymentFrequency = new ArrayList<GenericFrequency>();
        }
        return this.paymentFrequency;
    }

    /**
     * Gets the value of the resetFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resetFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResetFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericResetFrequency }
     * 
     * 
     */
    public List<GenericResetFrequency> getResetFrequency() {
        if (resetFrequency == null) {
            resetFrequency = new ArrayList<GenericResetFrequency>();
        }
        return this.resetFrequency;
    }

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedCurrency }
     * 
     * 
     */
    public List<IdentifiedCurrency> getSettlementCurrency() {
        if (settlementCurrency == null) {
            settlementCurrency = new ArrayList<IdentifiedCurrency>();
        }
        return this.settlementCurrency;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the additionalPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getAdditionalPayment() {
        if (additionalPayment == null) {
            additionalPayment = new ArrayList<Payment>();
        }
        return this.additionalPayment;
    }

}
