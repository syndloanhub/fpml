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
 * An abstract type describing changes in a facility-level rate.
 * 
 * <p>Java class for AbstractFacilityRateChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacilityRateChangeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractFacilityContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/confirmation}PeriodRate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFacilityRateChangeEvent", propOrder = {
    "rate"
})
@XmlSeeAlso({
    DefaultRateChange.class,
    MandatoryCostRateChange.class,
    PenaltyRateChange.class
})
public abstract class AbstractFacilityRateChangeEvent
    extends AbstractFacilityContractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PeriodRate rate;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRate }
     *     
     */
    public PeriodRate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRate }
     *     
     */
    public void setRate(PeriodRate value) {
        this.rate = value;
    }

}