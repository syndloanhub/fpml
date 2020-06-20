//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A message used to indicate a retraction of a loan notification.
 * 
 * <p>Java class for LoanNotificationRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanNotificationRetracted"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}NonCorrectableRequestMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}LoanIdentifiers.model"/&gt;
 *           &lt;element name="party" type="{http://www.fpml.org/FpML-5/confirmation}Party"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="originalMessage" type="{http://www.fpml.org/FpML-5/confirmation}UnprocessedElementWrapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanNotificationRetracted", propOrder = {
    "eventIdentifier",
    "taskIdentifier",
    "party",
    "originalMessage"
})
public class LoanNotificationRetracted
    extends NonCorrectableRequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BusinessEventIdentifier eventIdentifier;
    protected TaskIdentifier taskIdentifier;
    @XmlElement(required = true)
    protected Party party;
    protected UnprocessedElementWrapper originalMessage;

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public BusinessEventIdentifier getEventIdentifier() {
        return eventIdentifier;
    }

    /**
     * Sets the value of the eventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEventIdentifier }
     *     
     */
    public void setEventIdentifier(BusinessEventIdentifier value) {
        this.eventIdentifier = value;
    }

    /**
     * Gets the value of the taskIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TaskIdentifier }
     *     
     */
    public TaskIdentifier getTaskIdentifier() {
        return taskIdentifier;
    }

    /**
     * Sets the value of the taskIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskIdentifier }
     *     
     */
    public void setTaskIdentifier(TaskIdentifier value) {
        this.taskIdentifier = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the originalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link UnprocessedElementWrapper }
     *     
     */
    public UnprocessedElementWrapper getOriginalMessage() {
        return originalMessage;
    }

    /**
     * Sets the value of the originalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnprocessedElementWrapper }
     *     
     */
    public void setOriginalMessage(UnprocessedElementWrapper value) {
        this.originalMessage = value;
    }

}
