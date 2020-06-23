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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureToPay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureToPay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="gracePeriodExtension" type="{http://www.fpml.org/FpML-5/confirmation}GracePeriodExtension" minOccurs="0"/&gt;
 *         &lt;element name="paymentRequirement" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureToPay", propOrder = {
    "applicable",
    "gracePeriodExtension",
    "paymentRequirement"
})
public class FailureToPay
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected boolean applicable;
    protected GracePeriodExtension gracePeriodExtension;
    protected Money paymentRequirement;

    /**
     * Gets the value of the applicable property.
     * 
     */
    public boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     */
    public void setApplicable(boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the gracePeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodExtension }
     *     
     */
    public GracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    /**
     * Sets the value of the gracePeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodExtension }
     *     
     */
    public void setGracePeriodExtension(GracePeriodExtension value) {
        this.gracePeriodExtension = value;
    }

    /**
     * Gets the value of the paymentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentRequirement() {
        return paymentRequirement;
    }

    /**
     * Sets the value of the paymentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentRequirement(Money value) {
        this.paymentRequirement = value;
    }

}
