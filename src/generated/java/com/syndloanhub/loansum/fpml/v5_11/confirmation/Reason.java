//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
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
 * A type defining a content model for describing the nature and possible location of a error within a previous message.
 * 
 * <p>Java class for Reason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reason"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.fpml.org/FpML-5/confirmation}ReasonCode"/&gt;
 *         &lt;element name="location" type="{http://www.fpml.org/FpML-5/confirmation}ProblemLocation" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validationRuleId" type="{http://www.fpml.org/FpML-5/confirmation}Validation" minOccurs="0"/&gt;
 *         &lt;element name="additionalData" type="{http://www.fpml.org/FpML-5/confirmation}AdditionalData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason", propOrder = {
    "reasonCode",
    "location",
    "description",
    "validationRuleId",
    "additionalData"
})
public class Reason
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected ReasonCode reasonCode;
    protected ProblemLocation location;
    protected String description;
    protected Validation validationRuleId;
    protected List<AdditionalData> additionalData;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCode }
     *     
     */
    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCode }
     *     
     */
    public void setReasonCode(ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemLocation }
     *     
     */
    public ProblemLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemLocation }
     *     
     */
    public void setLocation(ProblemLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the validationRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Validation }
     *     
     */
    public Validation getValidationRuleId() {
        return validationRuleId;
    }

    /**
     * Sets the value of the validationRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validation }
     *     
     */
    public void setValidationRuleId(Validation value) {
        this.validationRuleId = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData }
     * 
     * 
     */
    public List<AdditionalData> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<AdditionalData>();
        }
        return this.additionalData;
    }

}
