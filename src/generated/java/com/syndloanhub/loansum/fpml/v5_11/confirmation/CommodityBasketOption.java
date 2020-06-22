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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBasketOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Option"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/confirmation}PutCallEnum"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityBasketOptionFeatures.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityBasket.model"/&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element name="strikePriceUnderlyingReference" type="{http://www.fpml.org/FpML-5/confirmation}StrikePriceUnderlyingReference"/&gt;
 *             &lt;element name="strikePriceBasketReference" type="{http://www.fpml.org/FpML-5/confirmation}StrikePriceBasketReference"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityStrikePrice.model"/&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityFloatingStrikePrice.model"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="exercise" type="{http://www.fpml.org/FpML-5/confirmation}CommodityExerciseBasket"/&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/confirmation}CommodityPremium" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "CommodityBasketOption", propOrder = {
    "optionType",
    "effectiveDate",
    "terminationDate",
    "calculationPeriodsSchedule",
    "calculationPeriods",
    "notionalQuantityBasket",
    "notionalAmountBasket",
    "strikePriceUnderlyingReference",
    "strikePriceBasketReference",
    "strikePricePerUnit",
    "strikePricePerUnitSchedule",
    "floatingStrikePricePerUnit",
    "floatingStrikePricePerUnitSchedule",
    "exercise",
    "premium",
    "commonPricing",
    "marketDisruption",
    "settlementDisruption",
    "rounding"
})
public class CommodityBasketOption
    extends Option
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PutCallEnum optionType;
    protected AdjustableOrRelativeDate effectiveDate;
    protected AdjustableOrRelativeDate terminationDate;
    protected CommodityCalculationPeriodsSchedule calculationPeriodsSchedule;
    protected AdjustableDates calculationPeriods;
    protected CommodityBasketByNotional notionalQuantityBasket;
    protected CommodityBasketByPercentage notionalAmountBasket;
    protected StrikePriceUnderlyingReference strikePriceUnderlyingReference;
    protected StrikePriceBasketReference strikePriceBasketReference;
    protected NonNegativeMoney strikePricePerUnit;
    protected CommodityStrikeSchedule strikePricePerUnitSchedule;
    protected FloatingStrikePrice floatingStrikePricePerUnit;
    protected CommodityCalculationPeriodsSchedule floatingStrikePricePerUnitSchedule;
    @XmlElement(required = true)
    protected CommodityExerciseBasket exercise;
    @XmlElement(required = true)
    protected List<CommodityPremium> premium;
    protected Boolean commonPricing;
    protected CommodityMarketDisruption marketDisruption;
    @XmlSchemaType(name = "token")
    protected CommodityBullionSettlementDisruptionEnum settlementDisruption;
    protected Rounding rounding;

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
     * Gets the value of the calculationPeriodsSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public CommodityCalculationPeriodsSchedule getCalculationPeriodsSchedule() {
        return calculationPeriodsSchedule;
    }

    /**
     * Sets the value of the calculationPeriodsSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public void setCalculationPeriodsSchedule(CommodityCalculationPeriodsSchedule value) {
        this.calculationPeriodsSchedule = value;
    }

    /**
     * Gets the value of the calculationPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getCalculationPeriods() {
        return calculationPeriods;
    }

    /**
     * Sets the value of the calculationPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setCalculationPeriods(AdjustableDates value) {
        this.calculationPeriods = value;
    }

    /**
     * Gets the value of the notionalQuantityBasket property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBasketByNotional }
     *     
     */
    public CommodityBasketByNotional getNotionalQuantityBasket() {
        return notionalQuantityBasket;
    }

    /**
     * Sets the value of the notionalQuantityBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBasketByNotional }
     *     
     */
    public void setNotionalQuantityBasket(CommodityBasketByNotional value) {
        this.notionalQuantityBasket = value;
    }

    /**
     * Gets the value of the notionalAmountBasket property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBasketByPercentage }
     *     
     */
    public CommodityBasketByPercentage getNotionalAmountBasket() {
        return notionalAmountBasket;
    }

    /**
     * Sets the value of the notionalAmountBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBasketByPercentage }
     *     
     */
    public void setNotionalAmountBasket(CommodityBasketByPercentage value) {
        this.notionalAmountBasket = value;
    }

    /**
     * Gets the value of the strikePriceUnderlyingReference property.
     * 
     * @return
     *     possible object is
     *     {@link StrikePriceUnderlyingReference }
     *     
     */
    public StrikePriceUnderlyingReference getStrikePriceUnderlyingReference() {
        return strikePriceUnderlyingReference;
    }

    /**
     * Sets the value of the strikePriceUnderlyingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikePriceUnderlyingReference }
     *     
     */
    public void setStrikePriceUnderlyingReference(StrikePriceUnderlyingReference value) {
        this.strikePriceUnderlyingReference = value;
    }

    /**
     * Gets the value of the strikePriceBasketReference property.
     * 
     * @return
     *     possible object is
     *     {@link StrikePriceBasketReference }
     *     
     */
    public StrikePriceBasketReference getStrikePriceBasketReference() {
        return strikePriceBasketReference;
    }

    /**
     * Sets the value of the strikePriceBasketReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikePriceBasketReference }
     *     
     */
    public void setStrikePriceBasketReference(StrikePriceBasketReference value) {
        this.strikePriceBasketReference = value;
    }

    /**
     * Gets the value of the strikePricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getStrikePricePerUnit() {
        return strikePricePerUnit;
    }

    /**
     * Sets the value of the strikePricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setStrikePricePerUnit(NonNegativeMoney value) {
        this.strikePricePerUnit = value;
    }

    /**
     * Gets the value of the strikePricePerUnitSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityStrikeSchedule }
     *     
     */
    public CommodityStrikeSchedule getStrikePricePerUnitSchedule() {
        return strikePricePerUnitSchedule;
    }

    /**
     * Sets the value of the strikePricePerUnitSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityStrikeSchedule }
     *     
     */
    public void setStrikePricePerUnitSchedule(CommodityStrikeSchedule value) {
        this.strikePricePerUnitSchedule = value;
    }

    /**
     * Gets the value of the floatingStrikePricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingStrikePrice }
     *     
     */
    public FloatingStrikePrice getFloatingStrikePricePerUnit() {
        return floatingStrikePricePerUnit;
    }

    /**
     * Sets the value of the floatingStrikePricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingStrikePrice }
     *     
     */
    public void setFloatingStrikePricePerUnit(FloatingStrikePrice value) {
        this.floatingStrikePricePerUnit = value;
    }

    /**
     * Gets the value of the floatingStrikePricePerUnitSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public CommodityCalculationPeriodsSchedule getFloatingStrikePricePerUnitSchedule() {
        return floatingStrikePricePerUnitSchedule;
    }

    /**
     * Sets the value of the floatingStrikePricePerUnitSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public void setFloatingStrikePricePerUnitSchedule(CommodityCalculationPeriodsSchedule value) {
        this.floatingStrikePricePerUnitSchedule = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityExerciseBasket }
     *     
     */
    public CommodityExerciseBasket getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityExerciseBasket }
     *     
     */
    public void setExercise(CommodityExerciseBasket value) {
        this.exercise = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityPremium }
     * 
     * 
     */
    public List<CommodityPremium> getPremium() {
        if (premium == null) {
            premium = new ArrayList<CommodityPremium>();
        }
        return this.premium;
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
