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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the rate of exchange at which the option has been struck.
 * 
 * <p>Java class for FxStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxStrikePrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/&gt;
 *         &lt;element name="strikeQuoteBasis" type="{http://www.fpml.org/FpML-5/confirmation}StrikeQuoteBasisEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxStrikePrice", propOrder = {
    "rate",
    "strikeQuoteBasis"
})
public class FxStrikePrice
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected BigDecimal rate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected StrikeQuoteBasisEnum strikeQuoteBasis;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the strikeQuoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public StrikeQuoteBasisEnum getStrikeQuoteBasis() {
        return strikeQuoteBasis;
    }

    /**
     * Sets the value of the strikeQuoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public void setStrikeQuoteBasis(StrikeQuoteBasisEnum value) {
        this.strikeQuoteBasis = value;
    }

}
