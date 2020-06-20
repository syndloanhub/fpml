//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type for all facility and optionally contract-level business events.
 * 
 * <p>Java class for AbstractFacilityContractEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacilityContractEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractFacilityEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanContractReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFacilityContractEvent", propOrder = {
    "loanContractReference"
})
@XmlSeeAlso({
    DefaultRateExpiry.class,
    MandatoryCostRateExpiry.class,
    PenaltyRateExpiry.class,
    AbstractFacilityRateChangeEvent.class
})
public abstract class AbstractFacilityContractEvent
    extends AbstractFacilityEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<LoanContractReference> loanContractReference;

    /**
     * Gets the value of the loanContractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContractReference }
     * 
     * 
     */
    public List<LoanContractReference> getLoanContractReference() {
        if (loanContractReference == null) {
            loanContractReference = new ArrayList<LoanContractReference>();
        }
        return this.loanContractReference;
    }

}