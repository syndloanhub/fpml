//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type describing a loan underlying asset.
 * 
 * <p>Java class for Loan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}UnderlyingAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="borrower" type="{http://www.fpml.org/FpML-5/confirmation}LegalEntity"/&gt;
 *           &lt;element name="borrowerReference" type="{http://www.fpml.org/FpML-5/confirmation}LegalEntityReference"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="lien" type="{http://www.fpml.org/FpML-5/confirmation}Lien" minOccurs="0"/&gt;
 *         &lt;element name="facilityType" type="{http://www.fpml.org/FpML-5/confirmation}FacilityType" minOccurs="0"/&gt;
 *         &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="creditAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tranche" type="{http://www.fpml.org/FpML-5/confirmation}UnderlyingAssetTranche" minOccurs="0"/&gt;
 *         &lt;element name="seniority" type="{http://www.fpml.org/FpML-5/confirmation}CreditSeniority" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loan", propOrder = {
    "borrowerOrBorrowerReference",
    "lien",
    "facilityType",
    "maturity",
    "creditAgreementDate",
    "tranche",
    "seniority"
})
public class Loan
    extends UnderlyingAsset
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElements({
        @XmlElement(name = "borrower", type = LegalEntity.class),
        @XmlElement(name = "borrowerReference", type = LegalEntityReference.class)
    })
    protected List<Serializable> borrowerOrBorrowerReference;
    protected Lien lien;
    protected FacilityType facilityType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate maturity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate creditAgreementDate;
    protected UnderlyingAssetTranche tranche;
    protected CreditSeniority seniority;

    /**
     * Gets the value of the borrowerOrBorrowerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borrowerOrBorrowerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowerOrBorrowerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntity }
     * {@link LegalEntityReference }
     * 
     * 
     */
    public List<Serializable> getBorrowerOrBorrowerReference() {
        if (borrowerOrBorrowerReference == null) {
            borrowerOrBorrowerReference = new ArrayList<Serializable>();
        }
        return this.borrowerOrBorrowerReference;
    }

    /**
     * Gets the value of the lien property.
     * 
     * @return
     *     possible object is
     *     {@link Lien }
     *     
     */
    public Lien getLien() {
        return lien;
    }

    /**
     * Sets the value of the lien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lien }
     *     
     */
    public void setLien(Lien value) {
        this.lien = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType }
     *     
     */
    public FacilityType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType }
     *     
     */
    public void setFacilityType(FacilityType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturity(LocalDate value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the creditAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCreditAgreementDate() {
        return creditAgreementDate;
    }

    /**
     * Sets the value of the creditAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAgreementDate(LocalDate value) {
        this.creditAgreementDate = value;
    }

    /**
     * Gets the value of the tranche property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingAssetTranche }
     *     
     */
    public UnderlyingAssetTranche getTranche() {
        return tranche;
    }

    /**
     * Sets the value of the tranche property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingAssetTranche }
     *     
     */
    public void setTranche(UnderlyingAssetTranche value) {
        this.tranche = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSeniority }
     *     
     */
    public CreditSeniority getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSeniority }
     *     
     */
    public void setSeniority(CreditSeniority value) {
        this.seniority = value;
    }

}