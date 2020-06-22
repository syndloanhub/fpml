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
 * A structure that incorporates sub-periods of an accrual calculation for a traded outstanding contract.
 * 
 * <p>Java class for LoanTradingLoanContractAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTradingLoanContractAccrual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractTradingAccrual"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanContractReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanTradingLoanContractAccrual", propOrder = {
    "loanContractReference"
})
public class LoanTradingLoanContractAccrual
    extends AbstractTradingAccrual
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LoanContractReference loanContractReference;

    /**
     * Gets the value of the loanContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContractReference }
     *     
     */
    public LoanContractReference getLoanContractReference() {
        return loanContractReference;
    }

    /**
     * Sets the value of the loanContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContractReference }
     *     
     */
    public void setLoanContractReference(LoanContractReference value) {
        this.loanContractReference = value;
    }

}
