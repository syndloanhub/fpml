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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An event representing adjustment in the notional amount of a loan contract that has no cash flow effect. E.g. an amount adjustment due to a defaulted loan.
 * 
 * <p>Java class for LoanContractAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustment" type="{http://www.fpml.org/FpML-5/confirmation}Adjustment"/&gt;
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/confirmation}MoneyWithParticipantShare"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractAdjustment", propOrder = {
    "adjustment",
    "amount"
})
public class LoanContractAdjustment
    extends AbstractLoanContractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected Adjustment adjustment;
    @XmlElement(required = true)
    protected MoneyWithParticipantShare amount;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment }
     *     
     */
    public Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment }
     *     
     */
    public void setAdjustment(Adjustment value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setAmount(MoneyWithParticipantShare value) {
        this.amount = value;
    }

}
