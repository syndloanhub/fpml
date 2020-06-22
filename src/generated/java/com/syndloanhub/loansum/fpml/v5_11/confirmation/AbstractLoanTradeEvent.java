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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract structure defining fundamental master loan trade event information.
 * 
 * <p>Java class for AbstractLoanTradeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLoanTradeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanEvent"&gt;
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
@XmlType(name = "AbstractLoanTradeEvent", propOrder = {
    "loanTradeReference"
})
@XmlSeeAlso({
    LoanTradeEvent.class,
    LoanTradeTransferFeeDueEvent.class,
    LoanTradeTransferFeeOwedEvent.class
})
public abstract class AbstractLoanTradeEvent
    extends AbstractLoanEvent
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
