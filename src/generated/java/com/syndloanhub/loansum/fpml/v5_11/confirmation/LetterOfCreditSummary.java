//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A short form definition of a letter of credit.
 * 
 * <p>Java class for LetterOfCreditSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCreditSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}FacilityContractIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/confirmation}LcType"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LetterOfCreditRoles.model"/&gt;
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
@XmlType(name = "LetterOfCreditSummary", propOrder = {
    "type",
    "effectiveDate",
    "borrowerPartyReference",
    "issuingBankPartyReference",
    "beneficiaryPartyReference",
    "amount"
})
@XmlSeeAlso({
    LetterOfCredit.class
})
public class LetterOfCreditSummary
    extends FacilityContractIdentifier
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected LcType type;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate effectiveDate;
    @XmlElement(required = true)
    protected PartyReference borrowerPartyReference;
    @XmlElement(required = true)
    protected PartyReference issuingBankPartyReference;
    protected PartyReference beneficiaryPartyReference;
    @XmlElement(required = true)
    protected MoneyWithParticipantShare amount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LcType }
     *     
     */
    public LcType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcType }
     *     
     */
    public void setType(LcType value) {
        this.type = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(LocalDate value) {
        this.effectiveDate = value;
    }

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
     * Gets the value of the issuingBankPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getIssuingBankPartyReference() {
        return issuingBankPartyReference;
    }

    /**
     * Sets the value of the issuingBankPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setIssuingBankPartyReference(PartyReference value) {
        this.issuingBankPartyReference = value;
    }

    /**
     * Gets the value of the beneficiaryPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBeneficiaryPartyReference() {
        return beneficiaryPartyReference;
    }

    /**
     * Sets the value of the beneficiaryPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBeneficiaryPartyReference(PartyReference value) {
        this.beneficiaryPartyReference = value;
    }

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