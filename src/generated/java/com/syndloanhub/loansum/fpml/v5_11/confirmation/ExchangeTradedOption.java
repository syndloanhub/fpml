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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An exchange traded option.
 * 
 * <p>Java class for ExchangeTradedOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTradedOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ExchangeTradedContract"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="strike" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="strikeCurrency" type="{http://www.fpml.org/FpML-5/confirmation}Currency" minOccurs="0"/&gt;
 *           &lt;element name="strikeUnits" type="{http://www.fpml.org/FpML-5/confirmation}PriceQuoteUnits" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/confirmation}PutCallEnum" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="exerciseStyle" type="{http://www.fpml.org/FpML-5/confirmation}ExerciseStyleEnum" minOccurs="0"/&gt;
 *           &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/confirmation}ExchangeTradedContractUnderlyer" minOccurs="0"/&gt;
 *           &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/confirmation}SettlementTypeEnum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTradedOption", propOrder = {
    "strike",
    "strikeCurrency",
    "strikeUnits",
    "optionType",
    "exerciseStyle",
    "underlyer",
    "settlementType"
})
public class ExchangeTradedOption
    extends ExchangeTradedContract
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BigDecimal strike;
    protected Currency strikeCurrency;
    protected PriceQuoteUnits strikeUnits;
    @XmlSchemaType(name = "token")
    protected PutCallEnum optionType;
    @XmlSchemaType(name = "token")
    protected ExerciseStyleEnum exerciseStyle;
    protected ExchangeTradedContractUnderlyer underlyer;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrike(BigDecimal value) {
        this.strike = value;
    }

    /**
     * Gets the value of the strikeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getStrikeCurrency() {
        return strikeCurrency;
    }

    /**
     * Sets the value of the strikeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setStrikeCurrency(Currency value) {
        this.strikeCurrency = value;
    }

    /**
     * Gets the value of the strikeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public PriceQuoteUnits getStrikeUnits() {
        return strikeUnits;
    }

    /**
     * Sets the value of the strikeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public void setStrikeUnits(PriceQuoteUnits value) {
        this.strikeUnits = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link PutCallEnum }
     *     
     */
    public PutCallEnum getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutCallEnum }
     *     
     */
    public void setOptionType(PutCallEnum value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the exerciseStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseStyleEnum }
     *     
     */
    public ExerciseStyleEnum getExerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Sets the value of the exerciseStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseStyleEnum }
     *     
     */
    public void setExerciseStyle(ExerciseStyleEnum value) {
        this.exerciseStyle = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public ExchangeTradedContractUnderlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public void setUnderlyer(ExchangeTradedContractUnderlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

}
