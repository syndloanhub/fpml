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
 * A structure that defines details related to the admin agent's determination of transfer fee(s) owed on an allocation.
 * 
 * <p>Java class for LoanAllocationTransferFeeOwedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAllocationTransferFeeOwedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanAllocationEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LoanTradingTransferFeeDetermination.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAllocationTransferFeeOwedEvent", propOrder = {
    "waivedFlag",
    "creditAgreementAmount",
    "agentAmount"
})
public class LoanAllocationTransferFeeOwedEvent
    extends AbstractLoanAllocationEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected boolean waivedFlag;
    @XmlElement(required = true)
    protected NonNegativeMoney creditAgreementAmount;
    @XmlElement(required = true)
    protected NonNegativeMoney agentAmount;

    /**
     * Gets the value of the waivedFlag property.
     * 
     */
    public boolean isWaivedFlag() {
        return waivedFlag;
    }

    /**
     * Sets the value of the waivedFlag property.
     * 
     */
    public void setWaivedFlag(boolean value) {
        this.waivedFlag = value;
    }

    /**
     * Gets the value of the creditAgreementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getCreditAgreementAmount() {
        return creditAgreementAmount;
    }

    /**
     * Sets the value of the creditAgreementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setCreditAgreementAmount(NonNegativeMoney value) {
        this.creditAgreementAmount = value;
    }

    /**
     * Gets the value of the agentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getAgentAmount() {
        return agentAmount;
    }

    /**
     * Sets the value of the agentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setAgentAmount(NonNegativeMoney value) {
        this.agentAmount = value;
    }

}
