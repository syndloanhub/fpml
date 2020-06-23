//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
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
 * A collection of outstanding loan contract and/or letter of credit structures belonging to a single facility.
 * 
 * <p>Java class for OutstandingContractsStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutstandingContractsStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanStatement"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}DealDetails.model" minOccurs="0"/&gt;
 *         &lt;element name="facilityIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}FacilityIdentifier"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="loanContract" type="{http://www.fpml.org/FpML-5/confirmation}LoanContract"/&gt;
 *           &lt;element name="letterOfCredit" type="{http://www.fpml.org/FpML-5/confirmation}LetterOfCredit"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "OutstandingContractsStatement", propOrder = {
    "dealIdentifier",
    "dealSummary",
    "facilityIdentifier",
    "loanContractOrLetterOfCredit",
    "party"
})
public class OutstandingContractsStatement
    extends AbstractLoanStatement
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected DealIdentifier dealIdentifier;
    protected DealSummary dealSummary;
    @XmlElement(required = true)
    protected FacilityIdentifier facilityIdentifier;
    @XmlElements({
        @XmlElement(name = "loanContract", type = LoanContract.class),
        @XmlElement(name = "letterOfCredit", type = LetterOfCredit.class)
    })
    protected List<FacilityContractIdentifier> loanContractOrLetterOfCredit;
    protected List<Party> party;

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
     * Gets the value of the loanContractOrLetterOfCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanContractOrLetterOfCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanContractOrLetterOfCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContract }
     * {@link LetterOfCredit }
     * 
     * 
     */
    public List<FacilityContractIdentifier> getLoanContractOrLetterOfCredit() {
        if (loanContractOrLetterOfCredit == null) {
            loanContractOrLetterOfCredit = new ArrayList<FacilityContractIdentifier>();
        }
        return this.loanContractOrLetterOfCredit;
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
