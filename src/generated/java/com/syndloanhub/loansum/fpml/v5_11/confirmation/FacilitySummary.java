//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A short form of a facility.
 * 
 * <p>Java class for FacilitySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilitySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}FacilityIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityRoles.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FacilityCommitment.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitySummary", propOrder = {
    "borrowerPartyReference",
    "coBorrowerPartyReference",
    "agentPartyReference",
    "lcIssuingBankPartyReference",
    "guarantorPartyReference",
    "startDate",
    "expiryDate",
    "maturityDate",
    "currentCommitment",
    "originalCommitment",
    "commitmentSchedule",
    "dealFxRate"
})
@XmlSeeAlso({
    AbstractFacility.class
})
public class FacilitySummary
    extends FacilityIdentifier
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PartyReference borrowerPartyReference;
    protected List<PartyReference> coBorrowerPartyReference;
    protected PartyReference agentPartyReference;
    protected List<PartyReference> lcIssuingBankPartyReference;
    protected List<PartyReference> guarantorPartyReference;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate expiryDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate maturityDate;
    @XmlElement(required = true)
    protected FacilityCommitment currentCommitment;
    protected MoneyWithParticipantShare originalCommitment;
    protected CommitmentSchedule commitmentSchedule;
    protected FxTerms dealFxRate;

    /**
     * Gets the value of the borrowerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBorrowerPartyReference() {
        return borrowerPartyReference;
    }

    /**
     * Sets the value of the borrowerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBorrowerPartyReference(PartyReference value) {
        this.borrowerPartyReference = value;
    }

    /**
     * Gets the value of the coBorrowerPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coBorrowerPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoBorrowerPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getCoBorrowerPartyReference() {
        if (coBorrowerPartyReference == null) {
            coBorrowerPartyReference = new ArrayList<PartyReference>();
        }
        return this.coBorrowerPartyReference;
    }

    /**
     * Gets the value of the agentPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAgentPartyReference() {
        return agentPartyReference;
    }

    /**
     * Sets the value of the agentPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAgentPartyReference(PartyReference value) {
        this.agentPartyReference = value;
    }

    /**
     * Gets the value of the lcIssuingBankPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcIssuingBankPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcIssuingBankPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getLcIssuingBankPartyReference() {
        if (lcIssuingBankPartyReference == null) {
            lcIssuingBankPartyReference = new ArrayList<PartyReference>();
        }
        return this.lcIssuingBankPartyReference;
    }

    /**
     * Gets the value of the guarantorPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getGuarantorPartyReference() {
        if (guarantorPartyReference == null) {
            guarantorPartyReference = new ArrayList<PartyReference>();
        }
        return this.guarantorPartyReference;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(LocalDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(LocalDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDate(LocalDate value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the currentCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCommitment }
     *     
     */
    public FacilityCommitment getCurrentCommitment() {
        return currentCommitment;
    }

    /**
     * Sets the value of the currentCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCommitment }
     *     
     */
    public void setCurrentCommitment(FacilityCommitment value) {
        this.currentCommitment = value;
    }

    /**
     * Gets the value of the originalCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public MoneyWithParticipantShare getOriginalCommitment() {
        return originalCommitment;
    }

    /**
     * Sets the value of the originalCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithParticipantShare }
     *     
     */
    public void setOriginalCommitment(MoneyWithParticipantShare value) {
        this.originalCommitment = value;
    }

    /**
     * Gets the value of the commitmentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentSchedule }
     *     
     */
    public CommitmentSchedule getCommitmentSchedule() {
        return commitmentSchedule;
    }

    /**
     * Sets the value of the commitmentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentSchedule }
     *     
     */
    public void setCommitmentSchedule(CommitmentSchedule value) {
        this.commitmentSchedule = value;
    }

    /**
     * Gets the value of the dealFxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTerms }
     *     
     */
    public FxTerms getDealFxRate() {
        return dealFxRate;
    }

    /**
     * Sets the value of the dealFxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTerms }
     *     
     */
    public void setDealFxRate(FxTerms value) {
        this.dealFxRate = value;
    }

}
