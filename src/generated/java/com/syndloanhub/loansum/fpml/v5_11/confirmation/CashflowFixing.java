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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Details of the computation of a computed rate or price used to calculate the amount of a cashflow component. This computed rate or price may include averaging and/or various types of rate treatment rules. The details include all of the observations, the calculation parameters, and the resulting value.
 * 
 * <p>Java class for CashflowFixing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashflowFixing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="observationReference" type="{http://www.fpml.org/FpML-5/confirmation}CashflowObservationReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="calculatedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="capValue" type="{http://www.fpml.org/FpML-5/confirmation}Strike" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="floorValue" type="{http://www.fpml.org/FpML-5/confirmation}Strike" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="negativeInterestRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rounding" type="{http://www.fpml.org/FpML-5/confirmation}Rounding" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashflowFixing", propOrder = {
    "observationReference",
    "calculatedValue",
    "multiplier",
    "spread",
    "capValue",
    "floorValue",
    "negativeInterestRate",
    "rounding"
})
public class CashflowFixing
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<CashflowObservationReference> observationReference;
    protected BigDecimal calculatedValue;
    protected BigDecimal multiplier;
    protected BigDecimal spread;
    protected List<Strike> capValue;
    protected List<Strike> floorValue;
    protected Boolean negativeInterestRate;
    protected Rounding rounding;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the observationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashflowObservationReference }
     * 
     * 
     */
    public List<CashflowObservationReference> getObservationReference() {
        if (observationReference == null) {
            observationReference = new ArrayList<CashflowObservationReference>();
        }
        return this.observationReference;
    }

    /**
     * Gets the value of the calculatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedValue() {
        return calculatedValue;
    }

    /**
     * Sets the value of the calculatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedValue(BigDecimal value) {
        this.calculatedValue = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the capValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strike }
     * 
     * 
     */
    public List<Strike> getCapValue() {
        if (capValue == null) {
            capValue = new ArrayList<Strike>();
        }
        return this.capValue;
    }

    /**
     * Gets the value of the floorValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floorValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloorValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strike }
     * 
     * 
     */
    public List<Strike> getFloorValue() {
        if (floorValue == null) {
            floorValue = new ArrayList<Strike>();
        }
        return this.floorValue;
    }

    /**
     * Gets the value of the negativeInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegativeInterestRate() {
        return negativeInterestRate;
    }

    /**
     * Sets the value of the negativeInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegativeInterestRate(Boolean value) {
        this.negativeInterestRate = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
