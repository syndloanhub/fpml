//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermDepositFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDepositFeatures"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dualCurrency" type="{http://www.fpml.org/FpML-5/confirmation}DualCurrencyFeature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDepositFeatures", propOrder = {
    "dualCurrency"
})
public class TermDepositFeatures
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected DualCurrencyFeature dualCurrency;

    /**
     * Gets the value of the dualCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public DualCurrencyFeature getDualCurrency() {
        return dualCurrency;
    }

    /**
     * Sets the value of the dualCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public void setDualCurrency(DualCurrencyFeature value) {
        this.dualCurrency = value;
    }

}
