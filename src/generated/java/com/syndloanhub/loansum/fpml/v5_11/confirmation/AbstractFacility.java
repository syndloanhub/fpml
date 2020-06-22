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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract type defining a facility baseline structure.
 * 
 * <p>Java class for AbstractFacility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}FacilitySummary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="governingLaw" type="{http://www.fpml.org/FpML-5/confirmation}GoverningLaw" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityFeatures.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityOptionsFeesAndRates.model"/&gt;
 *         &lt;element name="multiCurrency" type="{http://www.fpml.org/FpML-5/confirmation}MultiCurrency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFacility", propOrder = {
    "governingLaw",
    "feature",
    "lien",
    "seniority",
    "fixedRateOptionOrFloatingRateOptionOrLcOption",
    "accruingPikOption",
    "accruingFeeOption",
    "defaultRate",
    "mandatoryCostRate",
    "penaltyRate",
    "multiCurrency"
})
@XmlSeeAlso({
    DelayedDraw.class,
    LetterOfCreditFacility.class,
    Revolver.class,
    TermLoan.class
})
public abstract class AbstractFacility
    extends FacilitySummary
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected GoverningLaw governingLaw;
    protected List<FacilityFeature> feature;
    protected Lien lien;
    protected CreditSeniority seniority;
    @XmlElements({
        @XmlElement(name = "fixedRateOption", type = FixedRateOption.class),
        @XmlElement(name = "floatingRateOption", type = FloatingRateOption.class),
        @XmlElement(name = "lcOption", type = LcOption.class)
    })
    protected List<AccrualOptionBase> fixedRateOptionOrFloatingRateOptionOrLcOption;
    protected AccruingPikOption accruingPikOption;
    protected List<AccruingFeeOption> accruingFeeOption;
    protected PeriodRate defaultRate;
    protected PeriodRate mandatoryCostRate;
    protected PeriodRate penaltyRate;
    protected MultiCurrency multiCurrency;

    /**
     * Gets the value of the governingLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningLaw }
     *     
     */
    public GoverningLaw getGoverningLaw() {
        return governingLaw;
    }

    /**
     * Sets the value of the governingLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningLaw }
     *     
     */
    public void setGoverningLaw(GoverningLaw value) {
        this.governingLaw = value;
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
     * {@link FacilityFeature }
     * 
     * 
     */
    public List<FacilityFeature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<FacilityFeature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the lien property.
     * 
     * @return
     *     possible object is
     *     {@link Lien }
     *     
     */
    public Lien getLien() {
        return lien;
    }

    /**
     * Sets the value of the lien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lien }
     *     
     */
    public void setLien(Lien value) {
        this.lien = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSeniority }
     *     
     */
    public CreditSeniority getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSeniority }
     *     
     */
    public void setSeniority(CreditSeniority value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the fixedRateOptionOrFloatingRateOptionOrLcOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedRateOptionOrFloatingRateOptionOrLcOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedRateOptionOrFloatingRateOptionOrLcOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedRateOption }
     * {@link FloatingRateOption }
     * {@link LcOption }
     * 
     * 
     */
    public List<AccrualOptionBase> getFixedRateOptionOrFloatingRateOptionOrLcOption() {
        if (fixedRateOptionOrFloatingRateOptionOrLcOption == null) {
            fixedRateOptionOrFloatingRateOptionOrLcOption = new ArrayList<AccrualOptionBase>();
        }
        return this.fixedRateOptionOrFloatingRateOptionOrLcOption;
    }

    /**
     * Gets the value of the accruingPikOption property.
     * 
     * @return
     *     possible object is
     *     {@link AccruingPikOption }
     *     
     */
    public AccruingPikOption getAccruingPikOption() {
        return accruingPikOption;
    }

    /**
     * Sets the value of the accruingPikOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruingPikOption }
     *     
     */
    public void setAccruingPikOption(AccruingPikOption value) {
        this.accruingPikOption = value;
    }

    /**
     * Gets the value of the accruingFeeOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accruingFeeOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccruingFeeOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccruingFeeOption }
     * 
     * 
     */
    public List<AccruingFeeOption> getAccruingFeeOption() {
        if (accruingFeeOption == null) {
            accruingFeeOption = new ArrayList<AccruingFeeOption>();
        }
        return this.accruingFeeOption;
    }

    /**
     * Gets the value of the defaultRate property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRate }
     *     
     */
    public PeriodRate getDefaultRate() {
        return defaultRate;
    }

    /**
     * Sets the value of the defaultRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRate }
     *     
     */
    public void setDefaultRate(PeriodRate value) {
        this.defaultRate = value;
    }

    /**
     * Gets the value of the mandatoryCostRate property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRate }
     *     
     */
    public PeriodRate getMandatoryCostRate() {
        return mandatoryCostRate;
    }

    /**
     * Sets the value of the mandatoryCostRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRate }
     *     
     */
    public void setMandatoryCostRate(PeriodRate value) {
        this.mandatoryCostRate = value;
    }

    /**
     * Gets the value of the penaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRate }
     *     
     */
    public PeriodRate getPenaltyRate() {
        return penaltyRate;
    }

    /**
     * Sets the value of the penaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRate }
     *     
     */
    public void setPenaltyRate(PeriodRate value) {
        this.penaltyRate = value;
    }

    /**
     * Gets the value of the multiCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurrency }
     *     
     */
    public MultiCurrency getMultiCurrency() {
        return multiCurrency;
    }

    /**
     * Sets the value of the multiCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurrency }
     *     
     */
    public void setMultiCurrency(MultiCurrency value) {
        this.multiCurrency = value;
    }

}
