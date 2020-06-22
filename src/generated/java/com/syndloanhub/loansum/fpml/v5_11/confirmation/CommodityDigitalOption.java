//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
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
 * Defines the digital commodity option product type. Digital options exercise when a barrier is breached and are financially settled. The 'commodityDigitalOption' type is an extension of the 'commodityOption' product.
 * 
 * <p>Java class for CommodityDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDigitalOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Option"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/confirmation}PutCallEnum"/&gt;
 *         &lt;element name="commodity" type="{http://www.fpml.org/FpML-5/confirmation}Commodity"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityDigitalOptionFeatures.model"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/confirmation}NotionalAmount"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="notionalQuantity" type="{http://www.fpml.org/FpML-5/confirmation}CommodityNotionalQuantity"/&gt;
 *             &lt;element name="totalNotionalQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="exercise" type="{http://www.fpml.org/FpML-5/confirmation}CommodityDigitalExercise"/&gt;
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
@XmlType(name = "CommodityDigitalOption", propOrder = {
    "optionType",
    "commodity",
    "effectiveDate",
    "terminationDate",
    "calculationPeriodsSchedule",
    "calculationPeriods",
    "pricingDates",
    "averagingMethod",
    "digital",
    "notionalAmount",
    "notionalQuantity",
    "totalNotionalQuantity",
    "exercise",
    "premium",
    "commonPricing",
    "marketDisruption",
    "settlementDisruption",
    "rounding"
})
public class CommodityDigitalOption
    extends Option
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PutCallEnum optionType;
    @XmlElement(required = true)
    protected Commodity commodity;
    protected AdjustableOrRelativeDate effectiveDate;
    protected AdjustableOrRelativeDate terminationDate;
    protected CommodityCalculationPeriodsSchedule calculationPeriodsSchedule;
    protected AdjustableDates calculationPeriods;
    protected CommodityPricingDates pricingDates;
    @XmlSchemaType(name = "token")
    protected AveragingMethodEnum averagingMethod;
    @XmlElement(required = true)
    protected CommodityDigital digital;
    protected NotionalAmount notionalAmount;
    protected CommodityNotionalQuantity notionalQuantity;
    protected BigDecimal totalNotionalQuantity;
    @XmlElement(required = true)
    protected CommodityDigitalExercise exercise;
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
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
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
     * Gets the value of the pricingDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPricingDates }
     *     
     */
    public CommodityPricingDates getPricingDates() {
        return pricingDates;
    }

    /**
     * Sets the value of the pricingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPricingDates }
     *     
     */
    public void setPricingDates(CommodityPricingDates value) {
        this.pricingDates = value;
    }

    /**
     * Gets the value of the averagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public AveragingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    /**
     * Sets the value of the averagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public void setAveragingMethod(AveragingMethodEnum value) {
        this.averagingMethod = value;
    }

    /**
     * Gets the value of the digital property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDigital }
     *     
     */
    public CommodityDigital getDigital() {
        return digital;
    }

    /**
     * Sets the value of the digital property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDigital }
     *     
     */
    public void setDigital(CommodityDigital value) {
        this.digital = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount }
     *     
     */
    public NotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount }
     *     
     */
    public void setNotionalAmount(NotionalAmount value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the notionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getNotionalQuantity() {
        return notionalQuantity;
    }

    /**
     * Sets the value of the notionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setNotionalQuantity(CommodityNotionalQuantity value) {
        this.notionalQuantity = value;
    }

    /**
     * Gets the value of the totalNotionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNotionalQuantity() {
        return totalNotionalQuantity;
    }

    /**
     * Sets the value of the totalNotionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNotionalQuantity(BigDecimal value) {
        this.totalNotionalQuantity = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDigitalExercise }
     *     
     */
    public CommodityDigitalExercise getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDigitalExercise }
     *     
     */
    public void setExercise(CommodityDigitalExercise value) {
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
