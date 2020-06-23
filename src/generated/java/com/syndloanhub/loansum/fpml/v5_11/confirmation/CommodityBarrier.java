//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of how a barrier option will trigger (that is, knock-in or knock-out) or expire based on the position of the spot rate relative to trigger level.
 * 
 * <p>Java class for CommodityBarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBarrier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="knock" type="{http://www.fpml.org/FpML-5/confirmation}CommodityKnockEnum"/&gt;
 *           &lt;element name="featurePaymentAmount" type="{http://www.fpml.org/FpML-5/confirmation}PositiveMoney" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/confirmation}CommodityTrigger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBarrier", propOrder = {
    "knock",
    "featurePaymentAmount",
    "trigger"
})
public class CommodityBarrier implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CommodityKnockEnum knock;
    protected PositiveMoney featurePaymentAmount;
    @XmlElement(required = true)
    protected CommodityTrigger trigger;

    /**
     * Gets the value of the knock property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityKnockEnum }
     *     
     */
    public CommodityKnockEnum getKnock() {
        return knock;
    }

    /**
     * Sets the value of the knock property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityKnockEnum }
     *     
     */
    public void setKnock(CommodityKnockEnum value) {
        this.knock = value;
    }

    /**
     * Gets the value of the featurePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveMoney }
     *     
     */
    public PositiveMoney getFeaturePaymentAmount() {
        return featurePaymentAmount;
    }

    /**
     * Sets the value of the featurePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveMoney }
     *     
     */
    public void setFeaturePaymentAmount(PositiveMoney value) {
        this.featurePaymentAmount = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityTrigger }
     *     
     */
    public CommodityTrigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityTrigger }
     *     
     */
    public void setTrigger(CommodityTrigger value) {
        this.trigger = value;
    }

}
