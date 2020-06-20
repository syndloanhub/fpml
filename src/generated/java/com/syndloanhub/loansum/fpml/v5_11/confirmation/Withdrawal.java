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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A structure describing the removal of a trade from a service, such as a reporting service.
 * 
 * <p>Java class for Withdrawal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Withdrawal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifier" maxOccurs="unbounded"/&gt;
 *             &lt;element name="partyTradeInformation" type="{http://www.fpml.org/FpML-5/confirmation}WithdrawalPartyTradeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="trade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="requestedAction" type="{http://www.fpml.org/FpML-5/confirmation}RequestedWithdrawalAction" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/confirmation}WithdrawalReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reportingRegime" type="{http://www.fpml.org/FpML-5/confirmation}ReportingRegimeIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Withdrawal", propOrder = {
    "partyTradeIdentifier",
    "partyTradeInformation",
    "trade",
    "effectiveDate",
    "requestedAction",
    "reason",
    "reportingRegime"
})
public class Withdrawal implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    protected List<WithdrawalPartyTradeInformation> partyTradeInformation;
    protected Trade trade;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate effectiveDate;
    protected RequestedWithdrawalAction requestedAction;
    protected List<WithdrawalReason> reason;
    protected List<ReportingRegimeIdentifier> reportingRegime;

    /**
     * Gets the value of the partyTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getPartyTradeIdentifier() {
        if (partyTradeIdentifier == null) {
            partyTradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.partyTradeIdentifier;
    }

    /**
     * Gets the value of the partyTradeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WithdrawalPartyTradeInformation }
     * 
     * 
     */
    public List<WithdrawalPartyTradeInformation> getPartyTradeInformation() {
        if (partyTradeInformation == null) {
            partyTradeInformation = new ArrayList<WithdrawalPartyTradeInformation>();
        }
        return this.partyTradeInformation;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
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
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedWithdrawalAction }
     *     
     */
    public RequestedWithdrawalAction getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedWithdrawalAction }
     *     
     */
    public void setRequestedAction(RequestedWithdrawalAction value) {
        this.requestedAction = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WithdrawalReason }
     * 
     * 
     */
    public List<WithdrawalReason> getReason() {
        if (reason == null) {
            reason = new ArrayList<WithdrawalReason>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the reportingRegime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingRegime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingRegime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingRegimeIdentifier }
     * 
     * 
     */
    public List<ReportingRegimeIdentifier> getReportingRegime() {
        if (reportingRegime == null) {
            reportingRegime = new ArrayList<ReportingRegimeIdentifier>();
        }
        return this.reportingRegime;
    }

}