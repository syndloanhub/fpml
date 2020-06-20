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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * As per ISDA 2002 Definitions.
 * 
 * <p>Java class for Asian complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asian"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averagingInOut" type="{http://www.fpml.org/FpML-5/confirmation}AveragingInOutEnum"/&gt;
 *         &lt;element name="strikeFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="averagingPeriodIn" type="{http://www.fpml.org/FpML-5/confirmation}AveragingPeriod" minOccurs="0"/&gt;
 *         &lt;element name="averagingPeriodOut" type="{http://www.fpml.org/FpML-5/confirmation}AveragingPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asian", propOrder = {
    "averagingInOut",
    "strikeFactor",
    "averagingPeriodIn",
    "averagingPeriodOut"
})
public class Asian
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected AveragingInOutEnum averagingInOut;
    protected BigDecimal strikeFactor;
    protected AveragingPeriod averagingPeriodIn;
    protected AveragingPeriod averagingPeriodOut;

    /**
     * Gets the value of the averagingInOut property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingInOutEnum }
     *     
     */
    public AveragingInOutEnum getAveragingInOut() {
        return averagingInOut;
    }

    /**
     * Sets the value of the averagingInOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingInOutEnum }
     *     
     */
    public void setAveragingInOut(AveragingInOutEnum value) {
        this.averagingInOut = value;
    }

    /**
     * Gets the value of the strikeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikeFactor() {
        return strikeFactor;
    }

    /**
     * Sets the value of the strikeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikeFactor(BigDecimal value) {
        this.strikeFactor = value;
    }

    /**
     * Gets the value of the averagingPeriodIn property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingPeriodIn() {
        return averagingPeriodIn;
    }

    /**
     * Sets the value of the averagingPeriodIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingPeriodIn(AveragingPeriod value) {
        this.averagingPeriodIn = value;
    }

    /**
     * Gets the value of the averagingPeriodOut property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingPeriodOut() {
        return averagingPeriodOut;
    }

    /**
     * Sets the value of the averagingPeriodOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingPeriodOut(AveragingPeriod value) {
        this.averagingPeriodOut = value;
    }

}