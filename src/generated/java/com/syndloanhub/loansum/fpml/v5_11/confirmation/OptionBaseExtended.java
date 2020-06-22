//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for options starting with the 4-3 release, until we refactor the schema as part of the 5-0 release series.
 * 
 * <p>Java class for OptionBaseExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionBaseExtended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}OptionBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/confirmation}Premium" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}exercise"/&gt;
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/confirmation}ExerciseProcedure"/&gt;
 *         &lt;element name="feature" type="{http://www.fpml.org/FpML-5/confirmation}OptionFeature" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="notionalReference" type="{http://www.fpml.org/FpML-5/confirmation}NotionalAmountReference"/&gt;
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}OptionDenomination.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}OptionSettlement.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionBaseExtended", propOrder = {
    "premium",
    "exercise",
    "exerciseProcedure",
    "feature",
    "notionalReference",
    "notionalAmount",
    "optionEntitlement",
    "entitlementCurrency",
    "numberOfOptions",
    "settlementType",
    "settlementDate",
    "settlementAmount",
    "settlementCurrency"
})
@XmlSeeAlso({
    CreditDefaultSwapOption.class
})
public abstract class OptionBaseExtended
    extends OptionBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected Premium premium;
    @XmlElementRef(name = "exercise", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected JAXBElement<? extends Exercise> exercise;
    @XmlElement(required = true)
    protected ExerciseProcedure exerciseProcedure;
    protected OptionFeature feature;
    protected NotionalAmountReference notionalReference;
    protected Money notionalAmount;
    protected BigDecimal optionEntitlement;
    protected Currency entitlementCurrency;
    protected BigDecimal numberOfOptions;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    protected AdjustableOrRelativeDate settlementDate;
    protected Money settlementAmount;
    protected Currency settlementCurrency;

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link Premium }
     *     
     */
    public Premium getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Premium }
     *     
     */
    public void setPremium(Premium value) {
        this.premium = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     
     */
    public JAXBElement<? extends Exercise> getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     
     */
    public void setExercise(JAXBElement<? extends Exercise> value) {
        this.exercise = value;
    }

    /**
     * Gets the value of the exerciseProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseProcedure }
     *     
     */
    public ExerciseProcedure getExerciseProcedure() {
        return exerciseProcedure;
    }

    /**
     * Sets the value of the exerciseProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseProcedure }
     *     
     */
    public void setExerciseProcedure(ExerciseProcedure value) {
        this.exerciseProcedure = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFeature }
     *     
     */
    public OptionFeature getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFeature }
     *     
     */
    public void setFeature(OptionFeature value) {
        this.feature = value;
    }

    /**
     * Gets the value of the notionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountReference }
     *     
     */
    public NotionalAmountReference getNotionalReference() {
        return notionalReference;
    }

    /**
     * Sets the value of the notionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountReference }
     *     
     */
    public void setNotionalReference(NotionalAmountReference value) {
        this.notionalReference = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNotionalAmount(Money value) {
        this.notionalAmount = value;
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
     * Gets the value of the entitlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getEntitlementCurrency() {
        return entitlementCurrency;
    }

    /**
     * Sets the value of the entitlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setEntitlementCurrency(Currency value) {
        this.entitlementCurrency = value;
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
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setSettlementDate(AdjustableOrRelativeDate value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSettlementAmount(Money value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSettlementCurrency(Currency value) {
        this.settlementCurrency = value;
    }

}
