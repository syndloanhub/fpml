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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that contains sender-specific and optional shared loan allocation identifiers.
 * 
 * <p>Java class for LoanAllocationIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAllocationIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanTradeReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanTradeReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAllocationIdentifier", propOrder = {
    "loanTradeReference"
})
@XmlSeeAlso({
    LoanAllocationSummary.class
})
public class LoanAllocationIdentifier
    extends TradeIdentifier
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LoanTradeReference loanTradeReference;

    /**
     * Gets the value of the loanTradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LoanTradeReference }
     *     
     */
    public LoanTradeReference getLoanTradeReference() {
        return loanTradeReference;
    }

    /**
     * Sets the value of the loanTradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanTradeReference }
     *     
     */
    public void setLoanTradeReference(LoanTradeReference value) {
        this.loanTradeReference = value;
    }

}
