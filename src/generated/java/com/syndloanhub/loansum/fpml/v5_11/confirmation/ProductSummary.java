//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Summary information about the product that was traded. This is intended primarily for trade reporting by TRs.
 * 
 * <p>Java class for ProductSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finalSettlementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/confirmation}SettlementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="seniority" type="{http://www.fpml.org/FpML-5/confirmation}CreditSeniority" minOccurs="0"/&gt;
 *         &lt;element name="indexFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="admissionToTrading" type="{http://www.fpml.org/FpML-5/confirmation}AdmissionToTrading" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSummary", propOrder = {
    "finalSettlementDate",
    "settlementType",
    "seniority",
    "indexFactor",
    "admissionToTrading"
})
public class ProductSummary implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate finalSettlementDate;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    protected CreditSeniority seniority;
    protected BigDecimal indexFactor;
    protected AdmissionToTrading admissionToTrading;

    /**
     * Gets the value of the finalSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFinalSettlementDate() {
        return finalSettlementDate;
    }

    /**
     * Sets the value of the finalSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalSettlementDate(LocalDate value) {
        this.finalSettlementDate = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
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

    /**
     * Gets the value of the indexFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexFactor() {
        return indexFactor;
    }

    /**
     * Sets the value of the indexFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexFactor(BigDecimal value) {
        this.indexFactor = value;
    }

    /**
     * Gets the value of the admissionToTrading property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionToTrading }
     *     
     */
    public AdmissionToTrading getAdmissionToTrading() {
        return admissionToTrading;
    }

    /**
     * Sets the value of the admissionToTrading property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionToTrading }
     *     
     */
    public void setAdmissionToTrading(AdmissionToTrading value) {
        this.admissionToTrading = value;
    }

}
