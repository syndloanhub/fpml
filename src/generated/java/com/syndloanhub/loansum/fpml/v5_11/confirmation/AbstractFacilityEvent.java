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
 * An abstract base type for all facility-level business events.
 * 
 * <p>Java class for AbstractFacilityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacilityEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanServicingEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityReference" type="{http://www.fpml.org/FpML-5/confirmation}FacilityReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFacilityEvent", propOrder = {
    "facilityReference"
})
@XmlSeeAlso({
    AccrualOptionChangeEvent.class,
    AccruingFeeChange.class,
    AccruingFeeExpiry.class,
    AccruingFeePayment.class,
    AccruingPikPayment.class,
    CommitmentAdjustment.class,
    FacilityPrepayment.class,
    FacilityPrepaymentFeePayment.class,
    FacilityTermination.class,
    AbstractFacilityPaymentEvent.class,
    AbstractFacilityContractEvent.class
})
public abstract class AbstractFacilityEvent
    extends AbstractLoanServicingEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected FacilityReference facilityReference;

    /**
     * Gets the value of the facilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityReference }
     *     
     */
    public FacilityReference getFacilityReference() {
        return facilityReference;
    }

    /**
     * Sets the value of the facilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityReference }
     *     
     */
    public void setFacilityReference(FacilityReference value) {
        this.facilityReference = value;
    }

}