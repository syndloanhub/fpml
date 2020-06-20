//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the basic content for a message sent to inform another system that some 'business event' has occured. Notifications are not expected to be replied to.
 * 
 * <p>Java class for NotificationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Message"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.fpml.org/FpML-5/confirmation}NotificationMessageHeader"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}Validation.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CorrelationAndOptionalSequence.model" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}OnBehalfOf.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessage", propOrder = {
    "header",
    "validation",
    "parentCorrelationId",
    "correlationId",
    "sequenceNumber",
    "onBehalfOf"
})
@XmlSeeAlso({
    ServiceNotification.class
})
public abstract class NotificationMessage
    extends Message
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected NotificationMessageHeader header;
    protected List<Validation> validation;
    protected CorrelationId parentCorrelationId;
    protected CorrelationId correlationId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    protected OnBehalfOf onBehalfOf;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationMessageHeader }
     *     
     */
    public NotificationMessageHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMessageHeader }
     *     
     */
    public void setHeader(NotificationMessageHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validation }
     * 
     * 
     */
    public List<Validation> getValidation() {
        if (validation == null) {
            validation = new ArrayList<Validation>();
        }
        return this.validation;
    }

    /**
     * Gets the value of the parentCorrelationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getParentCorrelationId() {
        return parentCorrelationId;
    }

    /**
     * Sets the value of the parentCorrelationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setParentCorrelationId(CorrelationId value) {
        this.parentCorrelationId = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setCorrelationId(CorrelationId value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the onBehalfOf property.
     * 
     * @return
     *     possible object is
     *     {@link OnBehalfOf }
     *     
     */
    public OnBehalfOf getOnBehalfOf() {
        return onBehalfOf;
    }

    /**
     * Sets the value of the onBehalfOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBehalfOf }
     *     
     */
    public void setOnBehalfOf(OnBehalfOf value) {
        this.onBehalfOf = value;
    }

}
