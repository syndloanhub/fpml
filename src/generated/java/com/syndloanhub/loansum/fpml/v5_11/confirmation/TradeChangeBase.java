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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A structure describing a trade change.
 * 
 * <p>Java class for TradeChangeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeChangeBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="resultingTrade" type="{http://www.fpml.org/FpML-5/confirmation}Trade" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}AgreementAndEffectiveDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}TradeAlterationPayment.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeChangeBase", propOrder = {
    "tradeIdentifier",
    "originalTrade",
    "resultingTrade",
    "agreementDate",
    "executionDateTime",
    "effectiveDate",
    "payment"
})
@XmlSeeAlso({
    TradeNotionalChange.class
})
public class TradeChangeBase
    extends AbstractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<PartyTradeIdentifier> tradeIdentifier;
    protected Trade originalTrade;
    protected Trade resultingTrade;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate agreementDate;
    protected ExecutionDateTime executionDateTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate effectiveDate;
    protected List<Payment> payment;

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the resultingTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getResultingTrade() {
        return resultingTrade;
    }

    /**
     * Sets the value of the resultingTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setResultingTrade(Trade value) {
        this.resultingTrade = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDate(LocalDate value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the executionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionDateTime }
     *     
     */
    public ExecutionDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * Sets the value of the executionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionDateTime }
     *     
     */
    public void setExecutionDateTime(ExecutionDateTime value) {
        this.executionDateTime = value;
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
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

}