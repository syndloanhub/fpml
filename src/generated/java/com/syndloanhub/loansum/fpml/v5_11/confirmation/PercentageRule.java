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
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a content model for a calculation rule defined as percentage of the notional amount.
 * 
 * <p>Java class for PercentageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PaymentRule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="notionalAmountReference" type="{http://www.fpml.org/FpML-5/confirmation}NotionalAmountReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRule", propOrder = {
    "paymentPercent",
    "notionalAmountReference"
})
public class PercentageRule
    extends PaymentRule
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected BigDecimal paymentPercent;
    @XmlElement(required = true)
    protected NotionalAmountReference notionalAmountReference;

    /**
     * Gets the value of the paymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Sets the value of the paymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentPercent(BigDecimal value) {
        this.paymentPercent = value;
    }

    /**
     * Gets the value of the notionalAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountReference }
     *     
     */
    public NotionalAmountReference getNotionalAmountReference() {
        return notionalAmountReference;
    }

    /**
     * Sets the value of the notionalAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountReference }
     *     
     */
    public void setNotionalAmountReference(NotionalAmountReference value) {
        this.notionalAmountReference = value;
    }

}
