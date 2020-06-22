//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSettlementTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashSettlementTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}SettlementTerms"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valuationDate" type="{http://www.fpml.org/FpML-5/confirmation}ValuationDate" minOccurs="0"/&gt;
 *         &lt;element name="valuationTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="quotationMethod" type="{http://www.fpml.org/FpML-5/confirmation}QuotationRateTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="quotationAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/&gt;
 *         &lt;element name="minimumQuotationAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/&gt;
 *         &lt;element name="dealer" type="{http://www.fpml.org/FpML-5/confirmation}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cashSettlementBusinessDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FixedRecovery.model" minOccurs="0"/&gt;
 *         &lt;element name="fixedSettlement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accruedInterest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="valuationMethod" type="{http://www.fpml.org/FpML-5/confirmation}ValuationMethodEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlementTerms", propOrder = {
    "valuationDate",
    "valuationTime",
    "quotationMethod",
    "quotationAmount",
    "minimumQuotationAmount",
    "dealer",
    "cashSettlementBusinessDays",
    "cashSettlementAmount",
    "recoveryFactor",
    "fixedSettlement",
    "accruedInterest",
    "valuationMethod"
})
public class CashSettlementTerms
    extends SettlementTerms
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected ValuationDate valuationDate;
    protected BusinessCenterTime valuationTime;
    @XmlSchemaType(name = "token")
    protected QuotationRateTypeEnum quotationMethod;
    protected Money quotationAmount;
    protected Money minimumQuotationAmount;
    protected List<String> dealer;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cashSettlementBusinessDays;
    protected Money cashSettlementAmount;
    protected BigDecimal recoveryFactor;
    protected Boolean fixedSettlement;
    protected Boolean accruedInterest;
    @XmlSchemaType(name = "token")
    protected ValuationMethodEnum valuationMethod;

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDate }
     *     
     */
    public ValuationDate getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDate }
     *     
     */
    public void setValuationDate(ValuationDate value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the valuationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    /**
     * Sets the value of the valuationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setValuationTime(BusinessCenterTime value) {
        this.valuationTime = value;
    }

    /**
     * Gets the value of the quotationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationRateTypeEnum }
     *     
     */
    public QuotationRateTypeEnum getQuotationMethod() {
        return quotationMethod;
    }

    /**
     * Sets the value of the quotationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationRateTypeEnum }
     *     
     */
    public void setQuotationMethod(QuotationRateTypeEnum value) {
        this.quotationMethod = value;
    }

    /**
     * Gets the value of the quotationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getQuotationAmount() {
        return quotationAmount;
    }

    /**
     * Sets the value of the quotationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setQuotationAmount(Money value) {
        this.quotationAmount = value;
    }

    /**
     * Gets the value of the minimumQuotationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinimumQuotationAmount() {
        return minimumQuotationAmount;
    }

    /**
     * Sets the value of the minimumQuotationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinimumQuotationAmount(Money value) {
        this.minimumQuotationAmount = value;
    }

    /**
     * Gets the value of the dealer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDealer() {
        if (dealer == null) {
            dealer = new ArrayList<String>();
        }
        return this.dealer;
    }

    /**
     * Gets the value of the cashSettlementBusinessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCashSettlementBusinessDays() {
        return cashSettlementBusinessDays;
    }

    /**
     * Sets the value of the cashSettlementBusinessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCashSettlementBusinessDays(BigInteger value) {
        this.cashSettlementBusinessDays = value;
    }

    /**
     * Gets the value of the cashSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCashSettlementAmount() {
        return cashSettlementAmount;
    }

    /**
     * Sets the value of the cashSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCashSettlementAmount(Money value) {
        this.cashSettlementAmount = value;
    }

    /**
     * Gets the value of the recoveryFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveryFactor() {
        return recoveryFactor;
    }

    /**
     * Sets the value of the recoveryFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveryFactor(BigDecimal value) {
        this.recoveryFactor = value;
    }

    /**
     * Gets the value of the fixedSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedSettlement() {
        return fixedSettlement;
    }

    /**
     * Sets the value of the fixedSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedSettlement(Boolean value) {
        this.fixedSettlement = value;
    }

    /**
     * Gets the value of the accruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccruedInterest() {
        return accruedInterest;
    }

    /**
     * Sets the value of the accruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccruedInterest(Boolean value) {
        this.accruedInterest = value;
    }

    /**
     * Gets the value of the valuationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethodEnum }
     *     
     */
    public ValuationMethodEnum getValuationMethod() {
        return valuationMethod;
    }

    /**
     * Sets the value of the valuationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethodEnum }
     *     
     */
    public void setValuationMethod(ValuationMethodEnum value) {
        this.valuationMethod = value;
    }

}
