//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Describes the properties of an FX barrier.
 * 
 * <p>Java class for FxBarrierFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxBarrierFeature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barrierType" type="{http://www.fpml.org/FpML-5/confirmation}FxBarrierTypeEnum"/&gt;
 *         &lt;element name="direction" type="{http://www.fpml.org/FpML-5/confirmation}FxBarrierDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/confirmation}QuotedCurrencyPair"/&gt;
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/&gt;
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/confirmation}InformationSource" maxOccurs="unbounded"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;sequence&gt;
 *               &lt;element name="observationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *               &lt;element name="observationStartTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="observationEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *               &lt;element name="observationEndTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="observationPoint" type="{http://www.fpml.org/FpML-5/confirmation}FxBusinessCenterDateTime" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxBarrierFeature", propOrder = {
    "barrierType",
    "direction",
    "quotedCurrencyPair",
    "triggerRate",
    "informationSource",
    "observationStartDate",
    "observationStartTime",
    "observationEndDate",
    "observationEndTime",
    "observationPoint"
})
public class FxBarrierFeature implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected FxBarrierTypeEnum barrierType;
    @XmlSchemaType(name = "token")
    protected FxBarrierDirectionEnum direction;
    @XmlElement(required = true)
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(required = true)
    protected BigDecimal triggerRate;
    @XmlElement(required = true)
    protected List<InformationSource> informationSource;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate observationStartDate;
    protected BusinessCenterTime observationStartTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate observationEndDate;
    protected BusinessCenterTime observationEndTime;
    protected List<FxBusinessCenterDateTime> observationPoint;

    /**
     * Gets the value of the barrierType property.
     * 
     * @return
     *     possible object is
     *     {@link FxBarrierTypeEnum }
     *     
     */
    public FxBarrierTypeEnum getBarrierType() {
        return barrierType;
    }

    /**
     * Sets the value of the barrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxBarrierTypeEnum }
     *     
     */
    public void setBarrierType(FxBarrierTypeEnum value) {
        this.barrierType = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link FxBarrierDirectionEnum }
     *     
     */
    public FxBarrierDirectionEnum getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxBarrierDirectionEnum }
     *     
     */
    public void setDirection(FxBarrierDirectionEnum value) {
        this.direction = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationSource }
     * 
     * 
     */
    public List<InformationSource> getInformationSource() {
        if (informationSource == null) {
            informationSource = new ArrayList<InformationSource>();
        }
        return this.informationSource;
    }

    /**
     * Gets the value of the observationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getObservationStartDate() {
        return observationStartDate;
    }

    /**
     * Sets the value of the observationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationStartDate(LocalDate value) {
        this.observationStartDate = value;
    }

    /**
     * Gets the value of the observationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getObservationStartTime() {
        return observationStartTime;
    }

    /**
     * Sets the value of the observationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setObservationStartTime(BusinessCenterTime value) {
        this.observationStartTime = value;
    }

    /**
     * Gets the value of the observationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getObservationEndDate() {
        return observationEndDate;
    }

    /**
     * Sets the value of the observationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationEndDate(LocalDate value) {
        this.observationEndDate = value;
    }

    /**
     * Gets the value of the observationEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getObservationEndTime() {
        return observationEndTime;
    }

    /**
     * Sets the value of the observationEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setObservationEndTime(BusinessCenterTime value) {
        this.observationEndTime = value;
    }

    /**
     * Gets the value of the observationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxBusinessCenterDateTime }
     * 
     * 
     */
    public List<FxBusinessCenterDateTime> getObservationPoint() {
        if (observationPoint == null) {
            observationPoint = new ArrayList<FxBusinessCenterDateTime>();
        }
        return this.observationPoint;
    }

}
