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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract type that specifies an underlying floating rate cash accrual option.
 * 
 * <p>Java class for FloatingRateOptionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateOptionBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AccrualOptionBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FloatingRateIndexLoan.model"/&gt;
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pikSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateOptionBase", propOrder = {
    "floatingRateIndex",
    "indexTenor",
    "spread",
    "pikSpread"
})
@XmlSeeAlso({
    FloatingRateAccrual.class,
    FloatingRateOption.class
})
public abstract class FloatingRateOptionBase
    extends AccrualOptionBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected FloatingRateIndexLoan floatingRateIndex;
    protected Period indexTenor;
    @XmlElement(required = true)
    protected BigDecimal spread;
    protected BigDecimal pikSpread;

    /**
     * Gets the value of the floatingRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndexLoan }
     *     
     */
    public FloatingRateIndexLoan getFloatingRateIndex() {
        return floatingRateIndex;
    }

    /**
     * Sets the value of the floatingRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndexLoan }
     *     
     */
    public void setFloatingRateIndex(FloatingRateIndexLoan value) {
        this.floatingRateIndex = value;
    }

    /**
     * Gets the value of the indexTenor property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getIndexTenor() {
        return indexTenor;
    }

    /**
     * Sets the value of the indexTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setIndexTenor(Period value) {
        this.indexTenor = value;
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
     * Gets the value of the pikSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPikSpread() {
        return pikSpread;
    }

    /**
     * Sets the value of the pikSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPikSpread(BigDecimal value) {
        this.pikSpread = value;
    }

}
