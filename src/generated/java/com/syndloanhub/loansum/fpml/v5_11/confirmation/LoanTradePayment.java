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
 * A structure that represents a payment related to a loan trade (loan trade level).
 * 
 * <p>Java class for LoanTradePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTradePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}LoanSimplePayment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanTradeReference"/&gt;
 *         &lt;element name="receiverSettlementInstruction" type="{http://www.fpml.org/FpML-5/confirmation}SettlementInstruction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanTradePayment", propOrder = {
    "tradeReference",
    "receiverSettlementInstruction"
})
public class LoanTradePayment
    extends LoanSimplePayment
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LoanTradeReference tradeReference;
    protected SettlementInstruction receiverSettlementInstruction;

    /**
     * Gets the value of the tradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LoanTradeReference }
     *     
     */
    public LoanTradeReference getTradeReference() {
        return tradeReference;
    }

    /**
     * Sets the value of the tradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanTradeReference }
     *     
     */
    public void setTradeReference(LoanTradeReference value) {
        this.tradeReference = value;
    }

    /**
     * Gets the value of the receiverSettlementInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction }
     *     
     */
    public SettlementInstruction getReceiverSettlementInstruction() {
        return receiverSettlementInstruction;
    }

    /**
     * Sets the value of the receiverSettlementInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction }
     *     
     */
    public void setReceiverSettlementInstruction(SettlementInstruction value) {
        this.receiverSettlementInstruction = value;
    }

}
