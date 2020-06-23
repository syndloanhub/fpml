//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
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
 * Floating Price Leg of a Commodity Swap. Each 'floatingLeg' defines a series of financial payments for a commodity the value of which is derived from a floating price such as an exchange or an index publication.
 * 
 * <p>Java class for FloatingPriceLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingPriceLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}FinancialSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityCalculationPeriods.model"/&gt;
 *         &lt;element name="commodity" type="{http://www.fpml.org/FpML-5/confirmation}Commodity"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityNotionalQuantity.model"/&gt;
 *         &lt;element name="calculation" type="{http://www.fpml.org/FpML-5/confirmation}FloatingLegCalculation"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityPaymentDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityFreightFlatRate.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPriceLeg", propOrder = {
    "calculationDates",
    "calculationPeriods",
    "calculationPeriodsSchedule",
    "calculationPeriodsReference",
    "calculationPeriodsScheduleReference",
    "calculationPeriodsDatesReference",
    "commodity",
    "notionalQuantitySchedule",
    "notionalQuantity",
    "settlementPeriodsNotionalQuantity",
    "totalNotionalQuantity",
    "quantityReference",
    "calculation",
    "relativePaymentDates",
    "paymentDates",
    "masterAgreementPaymentDates",
    "flatRate",
    "flatRateAmount"
})
public class FloatingPriceLeg
    extends FinancialSwapLeg
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected AdjustableDates calculationDates;
    protected AdjustableDates calculationPeriods;
    protected CommodityCalculationPeriodsSchedule calculationPeriodsSchedule;
    protected CalculationPeriodsReference calculationPeriodsReference;
    protected CalculationPeriodsScheduleReference calculationPeriodsScheduleReference;
    protected CalculationPeriodsDatesReference calculationPeriodsDatesReference;
    @XmlElement(required = true)
    protected Commodity commodity;
    protected CommodityNotionalQuantitySchedule notionalQuantitySchedule;
    protected CommodityNotionalQuantity notionalQuantity;
    protected List<CommoditySettlementPeriodsNotionalQuantity> settlementPeriodsNotionalQuantity;
    protected BigDecimal totalNotionalQuantity;
    protected QuantityReference quantityReference;
    @XmlElement(required = true)
    protected FloatingLegCalculation calculation;
    protected CommodityRelativePaymentDates relativePaymentDates;
    protected AdjustableDatesOrRelativeDateOffset paymentDates;
    protected Boolean masterAgreementPaymentDates;
    @XmlSchemaType(name = "token")
    protected FlatRateEnum flatRate;
    protected NonNegativeMoney flatRateAmount;

    /**
     * Gets the value of the calculationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getCalculationDates() {
        return calculationDates;
    }

    /**
     * Sets the value of the calculationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setCalculationDates(AdjustableDates value) {
        this.calculationDates = value;
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
     * Gets the value of the calculationPeriodsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public CalculationPeriodsReference getCalculationPeriodsReference() {
        return calculationPeriodsReference;
    }

    /**
     * Sets the value of the calculationPeriodsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public void setCalculationPeriodsReference(CalculationPeriodsReference value) {
        this.calculationPeriodsReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public CalculationPeriodsScheduleReference getCalculationPeriodsScheduleReference() {
        return calculationPeriodsScheduleReference;
    }

    /**
     * Sets the value of the calculationPeriodsScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public void setCalculationPeriodsScheduleReference(CalculationPeriodsScheduleReference value) {
        this.calculationPeriodsScheduleReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsDatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public CalculationPeriodsDatesReference getCalculationPeriodsDatesReference() {
        return calculationPeriodsDatesReference;
    }

    /**
     * Sets the value of the calculationPeriodsDatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public void setCalculationPeriodsDatesReference(CalculationPeriodsDatesReference value) {
        this.calculationPeriodsDatesReference = value;
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
     * Gets the value of the notionalQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public CommodityNotionalQuantitySchedule getNotionalQuantitySchedule() {
        return notionalQuantitySchedule;
    }

    /**
     * Sets the value of the notionalQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public void setNotionalQuantitySchedule(CommodityNotionalQuantitySchedule value) {
        this.notionalQuantitySchedule = value;
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
     * Gets the value of the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsNotionalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommoditySettlementPeriodsNotionalQuantity }
     * 
     * 
     */
    public List<CommoditySettlementPeriodsNotionalQuantity> getSettlementPeriodsNotionalQuantity() {
        if (settlementPeriodsNotionalQuantity == null) {
            settlementPeriodsNotionalQuantity = new ArrayList<CommoditySettlementPeriodsNotionalQuantity>();
        }
        return this.settlementPeriodsNotionalQuantity;
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
     * Gets the value of the quantityReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityReference }
     *     
     */
    public QuantityReference getQuantityReference() {
        return quantityReference;
    }

    /**
     * Sets the value of the quantityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityReference }
     *     
     */
    public void setQuantityReference(QuantityReference value) {
        this.quantityReference = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingLegCalculation }
     *     
     */
    public FloatingLegCalculation getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingLegCalculation }
     *     
     */
    public void setCalculation(FloatingLegCalculation value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the relativePaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public CommodityRelativePaymentDates getRelativePaymentDates() {
        return relativePaymentDates;
    }

    /**
     * Sets the value of the relativePaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public void setRelativePaymentDates(CommodityRelativePaymentDates value) {
        this.relativePaymentDates = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setPaymentDates(AdjustableDatesOrRelativeDateOffset value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the masterAgreementPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterAgreementPaymentDates() {
        return masterAgreementPaymentDates;
    }

    /**
     * Sets the value of the masterAgreementPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterAgreementPaymentDates(Boolean value) {
        this.masterAgreementPaymentDates = value;
    }

    /**
     * Gets the value of the flatRate property.
     * 
     * @return
     *     possible object is
     *     {@link FlatRateEnum }
     *     
     */
    public FlatRateEnum getFlatRate() {
        return flatRate;
    }

    /**
     * Sets the value of the flatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatRateEnum }
     *     
     */
    public void setFlatRate(FlatRateEnum value) {
        this.flatRate = value;
    }

    /**
     * Gets the value of the flatRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getFlatRateAmount() {
        return flatRateAmount;
    }

    /**
     * Sets the value of the flatRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setFlatRateAmount(NonNegativeMoney value) {
        this.flatRateAmount = value;
    }

}
