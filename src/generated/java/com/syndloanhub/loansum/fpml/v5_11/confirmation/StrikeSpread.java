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
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining a strike spread feature.
 * 
 * <p>Java class for StrikeSpread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrikeSpread"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upperStrike" type="{http://www.fpml.org/FpML-5/confirmation}OptionStrike"/&gt;
 *         &lt;element name="upperStrikeNumberOfOptions" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeSpread", propOrder = {
    "upperStrike",
    "upperStrikeNumberOfOptions"
})
public class StrikeSpread
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected OptionStrike upperStrike;
    @XmlElement(required = true)
    protected BigDecimal upperStrikeNumberOfOptions;

    /**
     * Gets the value of the upperStrike property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStrike }
     *     
     */
    public OptionStrike getUpperStrike() {
        return upperStrike;
    }

    /**
     * Sets the value of the upperStrike property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStrike }
     *     
     */
    public void setUpperStrike(OptionStrike value) {
        this.upperStrike = value;
    }

    /**
     * Gets the value of the upperStrikeNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperStrikeNumberOfOptions() {
        return upperStrikeNumberOfOptions;
    }

    /**
     * Sets the value of the upperStrikeNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperStrikeNumberOfOptions(BigDecimal value) {
        this.upperStrikeNumberOfOptions = value;
    }

}
