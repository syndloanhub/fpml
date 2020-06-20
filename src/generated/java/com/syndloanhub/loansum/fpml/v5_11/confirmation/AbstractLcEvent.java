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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type for all LC-level business events.
 * 
 * <p>Java class for AbstractLcEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLcEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanServicingEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="letterOfCreditReference" type="{http://www.fpml.org/FpML-5/confirmation}LetterOfCreditReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLcEvent", propOrder = {
    "letterOfCreditReference"
})
@XmlSeeAlso({
    LcAdjustment.class,
    LcFxRevaluation.class,
    LcIssuance.class,
    LcIssuanceFeePayment.class,
    LcRateChange.class,
    LcRenewal.class,
    LcTermination.class
})
public abstract class AbstractLcEvent
    extends AbstractLoanServicingEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LetterOfCreditReference letterOfCreditReference;

    /**
     * Gets the value of the letterOfCreditReference property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditReference }
     *     
     */
    public LetterOfCreditReference getLetterOfCreditReference() {
        return letterOfCreditReference;
    }

    /**
     * Sets the value of the letterOfCreditReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditReference }
     *     
     */
    public void setLetterOfCreditReference(LetterOfCreditReference value) {
        this.letterOfCreditReference = value;
    }

}