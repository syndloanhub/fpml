//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
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
 * A statement containing the commitment amounts for a single facility at the global and (optionally) the lender postion levels, on a specific date.
 * 
 * <p>Java class for FacilityPositionStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityPositionStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanStatement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityPosition" type="{http://www.fpml.org/FpML-5/confirmation}FacilityPosition"/&gt;
 *         &lt;element name="positionPartyReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}DealDetails.model" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityDetails.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LoanContractDetails.model" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/confirmation}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityPositionStatement", propOrder = {
    "facilityPosition",
    "positionPartyReference",
    "dealIdentifier",
    "dealSummary",
    "facilityIdentifier",
    "facilitySummary",
    "loanContractDetailsModel",
    "party"
})
public class FacilityPositionStatement
    extends AbstractLoanStatement
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected FacilityPosition facilityPosition;
    @XmlElement(required = true)
    protected PartyReference positionPartyReference;
    protected DealIdentifier dealIdentifier;
    protected DealSummary dealSummary;
    protected FacilityIdentifier facilityIdentifier;
    protected FacilitySummary facilitySummary;
    @XmlElements({
        @XmlElement(name = "contractIdentifier"),
        @XmlElement(name = "contractSummary", type = LoanContractSummary.class),
        @XmlElement(name = "contract", type = LoanContract.class)
    })
    protected List<FacilityContractIdentifier> loanContractDetailsModel;
    protected List<Party> party;

    /**
     * Gets the value of the facilityPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityPosition }
     *     
     */
    public FacilityPosition getFacilityPosition() {
        return facilityPosition;
    }

    /**
     * Sets the value of the facilityPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityPosition }
     *     
     */
    public void setFacilityPosition(FacilityPosition value) {
        this.facilityPosition = value;
    }

    /**
     * Gets the value of the positionPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPositionPartyReference() {
        return positionPartyReference;
    }

    /**
     * Sets the value of the positionPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPositionPartyReference(PartyReference value) {
        this.positionPartyReference = value;
    }

    /**
     * Gets the value of the dealIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DealIdentifier }
     *     
     */
    public DealIdentifier getDealIdentifier() {
        return dealIdentifier;
    }

    /**
     * Sets the value of the dealIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealIdentifier }
     *     
     */
    public void setDealIdentifier(DealIdentifier value) {
        this.dealIdentifier = value;
    }

    /**
     * Gets the value of the dealSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DealSummary }
     *     
     */
    public DealSummary getDealSummary() {
        return dealSummary;
    }

    /**
     * Sets the value of the dealSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealSummary }
     *     
     */
    public void setDealSummary(DealSummary value) {
        this.dealSummary = value;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdentifier }
     *     
     */
    public FacilityIdentifier getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdentifier }
     *     
     */
    public void setFacilityIdentifier(FacilityIdentifier value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the facilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySummary }
     *     
     */
    public FacilitySummary getFacilitySummary() {
        return facilitySummary;
    }

    /**
     * Sets the value of the facilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySummary }
     *     
     */
    public void setFacilitySummary(FacilitySummary value) {
        this.facilitySummary = value;
    }

    /**
     * Gets the value of the loanContractDetailsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractDetailsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractDetailsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityContractIdentifier }
     * {@link LoanContractSummary }
     * {@link LoanContract }
     * 
     * 
     */
    public List<FacilityContractIdentifier> getLoanContractDetailsModel() {
        if (loanContractDetailsModel == null) {
            loanContractDetailsModel = new ArrayList<FacilityContractIdentifier>();
        }
        return this.loanContractDetailsModel;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
