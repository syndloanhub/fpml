//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
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
 * The barrier which, when breached, triggers the knock-in or knock-out of the barrier option.
 * 
 * <p>Java class for CommodityTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityTrigger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="levelQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="levelUnit" type="{http://www.fpml.org/FpML-5/confirmation}QuantityUnit"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="levelPercentage" type="{http://www.fpml.org/FpML-5/confirmation}Percentage"/&gt;
 *           &lt;element name="levelPrice" type="{http://www.fpml.org/FpML-5/confirmation}FixedPrice"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="triggerType" type="{http://www.fpml.org/FpML-5/confirmation}TriggerTypeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityTrigger", propOrder = {
    "levelQuantity",
    "levelUnit",
    "levelPercentage",
    "levelPrice",
    "triggerType"
})
public class CommodityTrigger
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BigDecimal levelQuantity;
    protected QuantityUnit levelUnit;
    protected BigDecimal levelPercentage;
    protected FixedPrice levelPrice;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TriggerTypeEnum triggerType;

    /**
     * Gets the value of the levelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelQuantity() {
        return levelQuantity;
    }

    /**
     * Sets the value of the levelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelQuantity(BigDecimal value) {
        this.levelQuantity = value;
    }

    /**
     * Gets the value of the levelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getLevelUnit() {
        return levelUnit;
    }

    /**
     * Sets the value of the levelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setLevelUnit(QuantityUnit value) {
        this.levelUnit = value;
    }

    /**
     * Gets the value of the levelPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelPercentage() {
        return levelPercentage;
    }

    /**
     * Sets the value of the levelPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelPercentage(BigDecimal value) {
        this.levelPercentage = value;
    }

    /**
     * Gets the value of the levelPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPrice }
     *     
     */
    public FixedPrice getLevelPrice() {
        return levelPrice;
    }

    /**
     * Sets the value of the levelPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPrice }
     *     
     */
    public void setLevelPrice(FixedPrice value) {
        this.levelPrice = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public void setTriggerType(TriggerTypeEnum value) {
        this.triggerType = value;
    }

}
