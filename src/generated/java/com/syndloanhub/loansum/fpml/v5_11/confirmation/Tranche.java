//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents a CDS Tranche.
 * 
 * <p>Java class for Tranche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tranche"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentPoint" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="exhaustionPoint" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="incurredRecoveryApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tranche", propOrder = {
    "attachmentPoint",
    "exhaustionPoint",
    "incurredRecoveryApplicable"
})
public class Tranche implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected BigDecimal attachmentPoint;
    @XmlElement(required = true)
    protected BigDecimal exhaustionPoint;
    protected Boolean incurredRecoveryApplicable;

    /**
     * Gets the value of the attachmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttachmentPoint() {
        return attachmentPoint;
    }

    /**
     * Sets the value of the attachmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttachmentPoint(BigDecimal value) {
        this.attachmentPoint = value;
    }

    /**
     * Gets the value of the exhaustionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExhaustionPoint() {
        return exhaustionPoint;
    }

    /**
     * Sets the value of the exhaustionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExhaustionPoint(BigDecimal value) {
        this.exhaustionPoint = value;
    }

    /**
     * Gets the value of the incurredRecoveryApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncurredRecoveryApplicable() {
        return incurredRecoveryApplicable;
    }

    /**
     * Sets the value of the incurredRecoveryApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncurredRecoveryApplicable(Boolean value) {
        this.incurredRecoveryApplicable = value;
    }

}
