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
 * A type defining the characteristics of the gas being traded in a physically settled gas transaction.
 * 
 * <p>Java class for GasProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/confirmation}GasProductTypeEnum"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="calorificValue" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeDecimal"/&gt;
 *           &lt;element name="quality" type="{http://www.fpml.org/FpML-5/confirmation}GasQuality"/&gt;
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
@XmlType(name = "GasProduct", propOrder = {
    "type",
    "calorificValue",
    "quality"
})
public class GasProduct
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected GasProductTypeEnum type;
    protected BigDecimal calorificValue;
    protected GasQuality quality;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GasProductTypeEnum }
     *     
     */
    public GasProductTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasProductTypeEnum }
     *     
     */
    public void setType(GasProductTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the calorificValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalorificValue() {
        return calorificValue;
    }

    /**
     * Sets the value of the calorificValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalorificValue(BigDecimal value) {
        this.calorificValue = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link GasQuality }
     *     
     */
    public GasQuality getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasQuality }
     *     
     */
    public void setQuality(GasQuality value) {
        this.quality = value;
    }

}
