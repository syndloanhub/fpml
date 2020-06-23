//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A structure describing a non-negotiated trade resulting from a market event.
 * 
 * <p>Java class for TradeChangeContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeChangeContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="oldTradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifier"/&gt;
 *           &lt;element name="oldTrade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="trade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}changeEvent"/&gt;
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/confirmation}Payment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeChangeContent", propOrder = {
    "oldTradeIdentifier",
    "oldTrade",
    "trade",
    "effectiveDate",
    "changeEvent",
    "payment"
})
public class TradeChangeContent implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected PartyTradeIdentifier oldTradeIdentifier;
    protected Trade oldTrade;
    @XmlElement(required = true)
    protected Trade trade;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate effectiveDate;
    @XmlElementRef(name = "changeEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected JAXBElement<? extends ChangeEvent> changeEvent;
    protected Payment payment;

    /**
     * Gets the value of the oldTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getOldTradeIdentifier() {
        return oldTradeIdentifier;
    }

    /**
     * Sets the value of the oldTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setOldTradeIdentifier(PartyTradeIdentifier value) {
        this.oldTradeIdentifier = value;
    }

    /**
     * Gets the value of the oldTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOldTrade() {
        return oldTrade;
    }

    /**
     * Sets the value of the oldTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOldTrade(Trade value) {
        this.oldTrade = value;
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
     * Substitution point for types of change
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorporateActionEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasketChangeEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeEvent }{@code >}
     *     
     */
    public JAXBElement<? extends ChangeEvent> getChangeEvent() {
        return changeEvent;
    }

    /**
     * Sets the value of the changeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorporateActionEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasketChangeEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeEvent }{@code >}
     *     
     */
    public void setChangeEvent(JAXBElement<? extends ChangeEvent> value) {
        this.changeEvent = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
