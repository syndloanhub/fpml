//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLimitUtilization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLimitUtilization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="executed" type="{http://www.fpml.org/FpML-5/confirmation}CreditLimitUtilizationPosition"/&gt;
 *         &lt;element name="pending" type="{http://www.fpml.org/FpML-5/confirmation}CreditLimitUtilizationPosition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLimitUtilization", propOrder = {
    "executed",
    "pending"
})
public class CreditLimitUtilization
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected CreditLimitUtilizationPosition executed;
    @XmlElement(required = true)
    protected CreditLimitUtilizationPosition pending;

    /**
     * Gets the value of the executed property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitUtilizationPosition }
     *     
     */
    public CreditLimitUtilizationPosition getExecuted() {
        return executed;
    }

    /**
     * Sets the value of the executed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitUtilizationPosition }
     *     
     */
    public void setExecuted(CreditLimitUtilizationPosition value) {
        this.executed = value;
    }

    /**
     * Gets the value of the pending property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitUtilizationPosition }
     *     
     */
    public CreditLimitUtilizationPosition getPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitUtilizationPosition }
     *     
     */
    public void setPending(CreditLimitUtilizationPosition value) {
        this.pending = value;
    }

}
