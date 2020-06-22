//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitApplicable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitApplicable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitType" type="{http://www.fpml.org/FpML-5/confirmation}LimitType"/&gt;
 *         &lt;element name="clipSize" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="amountUtilized" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="utilization" type="{http://www.fpml.org/FpML-5/confirmation}CreditLimitUtilization"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="amountRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/confirmation}Currency" minOccurs="0"/&gt;
 *         &lt;element name="velocity" type="{http://www.fpml.org/FpML-5/confirmation}Velocity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitApplicable", propOrder = {
    "limitType",
    "clipSize",
    "amountUtilized",
    "utilization",
    "amountRemaining",
    "currency",
    "velocity"
})
public class LimitApplicable
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LimitType limitType;
    @XmlElement(required = true)
    protected BigInteger clipSize;
    protected BigInteger amountUtilized;
    protected CreditLimitUtilization utilization;
    protected BigInteger amountRemaining;
    protected Currency currency;
    protected Velocity velocity;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType }
     *     
     */
    public LimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType }
     *     
     */
    public void setLimitType(LimitType value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the clipSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClipSize() {
        return clipSize;
    }

    /**
     * Sets the value of the clipSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClipSize(BigInteger value) {
        this.clipSize = value;
    }

    /**
     * Gets the value of the amountUtilized property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountUtilized() {
        return amountUtilized;
    }

    /**
     * Sets the value of the amountUtilized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountUtilized(BigInteger value) {
        this.amountUtilized = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitUtilization }
     *     
     */
    public CreditLimitUtilization getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitUtilization }
     *     
     */
    public void setUtilization(CreditLimitUtilization value) {
        this.utilization = value;
    }

    /**
     * Gets the value of the amountRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountRemaining() {
        return amountRemaining;
    }

    /**
     * Sets the value of the amountRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountRemaining(BigInteger value) {
        this.amountRemaining = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the velocity property.
     * 
     * @return
     *     possible object is
     *     {@link Velocity }
     *     
     */
    public Velocity getVelocity() {
        return velocity;
    }

    /**
     * Sets the value of the velocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Velocity }
     *     
     */
    public void setVelocity(Velocity value) {
        this.velocity = value;
    }

}
