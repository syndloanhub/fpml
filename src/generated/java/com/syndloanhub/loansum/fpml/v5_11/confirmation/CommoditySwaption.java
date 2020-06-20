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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Commodity Swaption.
 * 
 * <p>Java class for CommoditySwaption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySwaption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Product"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BuyerSeller.model"/&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/confirmation}PutCallEnum"/&gt;
 *         &lt;element name="commoditySwap" type="{http://www.fpml.org/FpML-5/confirmation}CommoditySwaptionUnderlying"/&gt;
 *         &lt;element name="physicalExercise" type="{http://www.fpml.org/FpML-5/confirmation}CommodityPhysicalExercise"/&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/confirmation}CommodityPremium"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityContent.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySwaption", propOrder = {
    "buyerPartyReference",
    "buyerAccountReference",
    "sellerPartyReference",
    "sellerAccountReference",
    "optionType",
    "commoditySwap",
    "physicalExercise",
    "premium",
    "commonPricing",
    "marketDisruption",
    "settlementDisruption",
    "rounding"
})
public class CommoditySwaption
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PartyReference buyerPartyReference;
    protected AccountReference buyerAccountReference;
    @XmlElement(required = true)
    protected PartyReference sellerPartyReference;
    protected AccountReference sellerAccountReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PutCallEnum optionType;
    @XmlElement(required = true)
    protected CommoditySwaptionUnderlying commoditySwap;
    @XmlElement(required = true)
    protected CommodityPhysicalExercise physicalExercise;
    @XmlElement(required = true)
    protected CommodityPremium premium;
    protected Boolean commonPricing;
    protected CommodityMarketDisruption marketDisruption;
    @XmlSchemaType(name = "token")
    protected CommodityBullionSettlementDisruptionEnum settlementDisruption;
    protected Rounding rounding;

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
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link PutCallEnum }
     *     
     */
    public PutCallEnum getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutCallEnum }
     *     
     */
    public void setOptionType(PutCallEnum value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the commoditySwap property.
     * 
     * @return
     *     possible object is
     *     {@link CommoditySwaptionUnderlying }
     *     
     */
    public CommoditySwaptionUnderlying getCommoditySwap() {
        return commoditySwap;
    }

    /**
     * Sets the value of the commoditySwap property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommoditySwaptionUnderlying }
     *     
     */
    public void setCommoditySwap(CommoditySwaptionUnderlying value) {
        this.commoditySwap = value;
    }

    /**
     * Gets the value of the physicalExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalExercise }
     *     
     */
    public CommodityPhysicalExercise getPhysicalExercise() {
        return physicalExercise;
    }

    /**
     * Sets the value of the physicalExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalExercise }
     *     
     */
    public void setPhysicalExercise(CommodityPhysicalExercise value) {
        this.physicalExercise = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPremium }
     *     
     */
    public CommodityPremium getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPremium }
     *     
     */
    public void setPremium(CommodityPremium value) {
        this.premium = value;
    }

    /**
     * Gets the value of the commonPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonPricing() {
        return commonPricing;
    }

    /**
     * Sets the value of the commonPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonPricing(Boolean value) {
        this.commonPricing = value;
    }

    /**
     * Gets the value of the marketDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public CommodityMarketDisruption getMarketDisruption() {
        return marketDisruption;
    }

    /**
     * Sets the value of the marketDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMarketDisruption }
     *     
     */
    public void setMarketDisruption(CommodityMarketDisruption value) {
        this.marketDisruption = value;
    }

    /**
     * Gets the value of the settlementDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public CommodityBullionSettlementDisruptionEnum getSettlementDisruption() {
        return settlementDisruption;
    }

    /**
     * Sets the value of the settlementDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBullionSettlementDisruptionEnum }
     *     
     */
    public void setSettlementDisruption(CommodityBullionSettlementDisruptionEnum value) {
        this.settlementDisruption = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setRounding(Rounding value) {
        this.rounding = value;
    }

}
