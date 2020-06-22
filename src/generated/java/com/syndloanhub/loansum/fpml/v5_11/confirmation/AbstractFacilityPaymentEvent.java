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
 * An event describing a fee being paid at facility level.
 * 
 * <p>Java class for AbstractFacilityPaymentEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacilityPaymentEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractFacilityEvent"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "AbstractFacilityPaymentEvent", propOrder = {
    "amount"
})
@XmlSeeAlso({
    AmendmentFeePayment.class,
    FacilityExtensionFeePayment.class,
    FundingFeePayment.class,
    MiscFeePayment.class,
    UpfrontFeePayment.class,
    WaiverFeePayment.class
})
public abstract class AbstractFacilityPaymentEvent
    extends AbstractFacilityEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected MoneyWithParticipantShare amount;

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
