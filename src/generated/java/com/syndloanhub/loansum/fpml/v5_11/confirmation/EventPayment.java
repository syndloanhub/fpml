//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that represents the prepayment structure associated within a facility.
 * 
 * <p>Java class for EventPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}LoanSimplePayment"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}BusinessEventIdentifier"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="settlementInstruction" type="{http://www.fpml.org/FpML-5/confirmation}SettlementInstruction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventPayment", propOrder = {
    "eventIdentifier",
    "settlementInstruction"
})
public class EventPayment
    extends LoanSimplePayment
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected List<BusinessEventIdentifier> eventIdentifier;
    protected SettlementInstruction settlementInstruction;

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
     * Gets the value of the settlementInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction }
     *     
     */
    public SettlementInstruction getSettlementInstruction() {
        return settlementInstruction;
    }

    /**
     * Sets the value of the settlementInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction }
     *     
     */
    public void setSettlementInstruction(SettlementInstruction value) {
        this.settlementInstruction = value;
    }

}
