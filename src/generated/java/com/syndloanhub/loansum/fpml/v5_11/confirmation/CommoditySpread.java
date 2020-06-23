//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommoditySpread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySpread"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Money"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spreadConversionFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="spreadUnit" type="{http://www.fpml.org/FpML-5/confirmation}QuantityUnit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySpread", propOrder = {
    "spreadConversionFactor",
    "spreadUnit"
})
public class CommoditySpread
    extends Money
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BigDecimal spreadConversionFactor;
    protected QuantityUnit spreadUnit;

    /**
     * Gets the value of the spreadConversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpreadConversionFactor() {
        return spreadConversionFactor;
    }

    /**
     * Sets the value of the spreadConversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpreadConversionFactor(BigDecimal value) {
        this.spreadConversionFactor = value;
    }

    /**
     * Gets the value of the spreadUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getSpreadUnit() {
        return spreadUnit;
    }

    /**
     * Sets the value of the spreadUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setSpreadUnit(QuantityUnit value) {
        this.spreadUnit = value;
    }

}
