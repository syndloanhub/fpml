//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
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
 * An underlying abstract structure for all syndicated loan trade allocation notifications; the wrapper for events which occur through the life-cycle of a loan allocation.
 * 
 * <p>Java class for AbstractLoanAllocationNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLoanAllocationNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}CorrectableRequestMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noticeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference"/&gt;
 *           &lt;element name="role" type="{http://www.fpml.org/FpML-5/confirmation}LoanTradingPartyRole"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/confirmation}LoanAllocationPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLoanAllocationNotification", propOrder = {
    "noticeDate",
    "partyReference",
    "role",
    "payment"
})
@XmlSeeAlso({
    LoanAllocationNotification.class
})
public abstract class AbstractLoanAllocationNotification
    extends CorrectableRequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate noticeDate;
    @XmlElement(required = true)
    protected PartyReference partyReference;
    @XmlElement(required = true)
    protected LoanTradingPartyRole role;
    protected List<LoanAllocationPayment> payment;

    /**
     * Gets the value of the noticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    /**
     * Sets the value of the noticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeDate(LocalDate value) {
        this.noticeDate = value;
    }

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link LoanTradingPartyRole }
     *     
     */
    public LoanTradingPartyRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanTradingPartyRole }
     *     
     */
    public void setRole(LoanTradingPartyRole value) {
        this.role = value;
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
     * {@link LoanAllocationPayment }
     * 
     * 
     */
    public List<LoanAllocationPayment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<LoanAllocationPayment>();
        }
        return this.payment;
    }

}
