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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A component of a clearing status report. This provides the clearing status for a single trade.
 * 
 * <p>Java class for ClearingStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingStatusItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}TradeReferenceInformation.model"/&gt;
 *           &lt;element name="trade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *           &lt;element name="tradePackage" type="{http://www.fpml.org/FpML-5/confirmation}TradePackage"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="clearingStatusValue" type="{http://www.fpml.org/FpML-5/confirmation}ClearingStatusValue"/&gt;
 *         &lt;element name="updatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/confirmation}Reason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusAppliesTo" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingStatusItem", propOrder = {
    "tradeIdentifier",
    "tradeReferenceInformation",
    "trade",
    "tradePackage",
    "clearingStatusValue",
    "updatedDateTime",
    "reason",
    "statusAppliesTo"
})
public class ClearingStatusItem
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<TradeIdentifier> tradeIdentifier;
    protected TradeReferenceInformation tradeReferenceInformation;
    protected Trade trade;
    protected TradePackage tradePackage;
    @XmlElement(required = true)
    protected ClearingStatusValue clearingStatusValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDateTime;
    protected List<Reason> reason;
    protected List<PartyReference> statusAppliesTo;

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
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<TradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the tradeReferenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReferenceInformation }
     *     
     */
    public TradeReferenceInformation getTradeReferenceInformation() {
        return tradeReferenceInformation;
    }

    /**
     * Sets the value of the tradeReferenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReferenceInformation }
     *     
     */
    public void setTradeReferenceInformation(TradeReferenceInformation value) {
        this.tradeReferenceInformation = value;
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
     * Gets the value of the tradePackage property.
     * 
     * @return
     *     possible object is
     *     {@link TradePackage }
     *     
     */
    public TradePackage getTradePackage() {
        return tradePackage;
    }

    /**
     * Sets the value of the tradePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePackage }
     *     
     */
    public void setTradePackage(TradePackage value) {
        this.tradePackage = value;
    }

    /**
     * Gets the value of the clearingStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusValue }
     *     
     */
    public ClearingStatusValue getClearingStatusValue() {
        return clearingStatusValue;
    }

    /**
     * Sets the value of the clearingStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusValue }
     *     
     */
    public void setClearingStatusValue(ClearingStatusValue value) {
        this.clearingStatusValue = value;
    }

    /**
     * Gets the value of the updatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDateTime() {
        return updatedDateTime;
    }

    /**
     * Sets the value of the updatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDateTime(XMLGregorianCalendar value) {
        this.updatedDateTime = value;
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
     * {@link Reason }
     * 
     * 
     */
    public List<Reason> getReason() {
        if (reason == null) {
            reason = new ArrayList<Reason>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the statusAppliesTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusAppliesTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusAppliesTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getStatusAppliesTo() {
        if (statusAppliesTo == null) {
            statusAppliesTo = new ArrayList<PartyReference>();
        }
        return this.statusAppliesTo;
    }

}
