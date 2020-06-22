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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type defining common features of a syndicated loan business event.
 * 
 * <p>Java class for AbstractLoanEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLoanEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}BusinessEventIdentifier" maxOccurs="unbounded"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="parentEventIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}ParentEventIdentifier" minOccurs="0"/&gt;
 *           &lt;element name="previousEventIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}BusinessEventIdentifier" minOccurs="0"/&gt;
 *           &lt;element name="correctedEventIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}BusinessEventIdentifier" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LenderAndCashDetails.model" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.fpml.org/FpML-5/confirmation}String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLoanEvent", propOrder = {
    "eventIdentifier",
    "parentEventIdentifier",
    "previousEventIdentifier",
    "correctedEventIdentifier",
    "lenderPartyReference",
    "cashPayable",
    "comment"
})
@XmlSeeAlso({
    AbstractLoanTradeEvent.class,
    AbstractLoanAllocationEvent.class,
    AbstractLoanServicingEvent.class
})
public abstract class AbstractLoanEvent implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected List<BusinessEventIdentifier> eventIdentifier;
    protected ParentEventIdentifier parentEventIdentifier;
    protected BusinessEventIdentifier previousEventIdentifier;
    protected BusinessEventIdentifier correctedEventIdentifier;
    protected PartyReference lenderPartyReference;
    protected CashPayable cashPayable;
    protected String comment;

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEventIdentifier }
     * 
     * 
     */
    public List<BusinessEventIdentifier> getEventIdentifier() {
        if (eventIdentifier == null) {
            eventIdentifier = new ArrayList<BusinessEventIdentifier>();
        }
        return this.eventIdentifier;
    }

    /**
     * Gets the value of the parentEventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ParentEventIdentifier }
     *     
     */
    public ParentEventIdentifier getParentEventIdentifier() {
        return parentEventIdentifier;
    }

    /**
     * Sets the value of the parentEventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentEventIdentifier }
     *     
     */
    public void setParentEventIdentifier(ParentEventIdentifier value) {
        this.parentEventIdentifier = value;
    }

    /**
     * Gets the value of the previousEventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public BusinessEventIdentifier getPreviousEventIdentifier() {
        return previousEventIdentifier;
    }

    /**
     * Sets the value of the previousEventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public void setPreviousEventIdentifier(BusinessEventIdentifier value) {
        this.previousEventIdentifier = value;
    }

    /**
     * Gets the value of the correctedEventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public BusinessEventIdentifier getCorrectedEventIdentifier() {
        return correctedEventIdentifier;
    }

    /**
     * Sets the value of the correctedEventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public void setCorrectedEventIdentifier(BusinessEventIdentifier value) {
        this.correctedEventIdentifier = value;
    }

    /**
     * Gets the value of the lenderPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getLenderPartyReference() {
        return lenderPartyReference;
    }

    /**
     * Sets the value of the lenderPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setLenderPartyReference(PartyReference value) {
        this.lenderPartyReference = value;
    }

    /**
     * Gets the value of the cashPayable property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayable }
     *     
     */
    public CashPayable getCashPayable() {
        return cashPayable;
    }

    /**
     * Sets the value of the cashPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayable }
     *     
     */
    public void setCashPayable(CashPayable value) {
        this.cashPayable = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
