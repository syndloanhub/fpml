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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes a party profile record.
 * 
 * <p>Java class for PartyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractPartyProfile"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="communicationDetails" type="{http://www.fpml.org/FpML-5/confirmation}ApplicableCommunicationDetails"/&gt;
 *         &lt;element name="settlementInstructionDetails" type="{http://www.fpml.org/FpML-5/confirmation}ApplicableSettlementInstructionDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyProfile", propOrder = {
    "communicationDetailsOrSettlementInstructionDetails"
})
public class PartyProfile
    extends AbstractPartyProfile
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElements({
        @XmlElement(name = "communicationDetails", type = ApplicableCommunicationDetails.class),
        @XmlElement(name = "settlementInstructionDetails", type = ApplicableSettlementInstructionDetails.class)
    })
    protected List<AbstractApplicablePartyProfileObjects> communicationDetailsOrSettlementInstructionDetails;

    /**
     * Gets the value of the communicationDetailsOrSettlementInstructionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationDetailsOrSettlementInstructionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationDetailsOrSettlementInstructionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicableCommunicationDetails }
     * {@link ApplicableSettlementInstructionDetails }
     * 
     * 
     */
    public List<AbstractApplicablePartyProfileObjects> getCommunicationDetailsOrSettlementInstructionDetails() {
        if (communicationDetailsOrSettlementInstructionDetails == null) {
            communicationDetailsOrSettlementInstructionDetails = new ArrayList<AbstractApplicablePartyProfileObjects>();
        }
        return this.communicationDetailsOrSettlementInstructionDetails;
    }

}
