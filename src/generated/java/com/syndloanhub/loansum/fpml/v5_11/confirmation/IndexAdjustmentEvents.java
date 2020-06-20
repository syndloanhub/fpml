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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the specification of the consequences of Index Events as defined by the 2002 ISDA Equity Derivatives Definitions.
 * 
 * <p>Java class for IndexAdjustmentEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexAdjustmentEvents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indexModification" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/&gt;
 *         &lt;element name="indexCancellation" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/&gt;
 *         &lt;element name="indexDisruption" type="{http://www.fpml.org/FpML-5/confirmation}IndexEventConsequenceEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexAdjustmentEvents", propOrder = {
    "indexModification",
    "indexCancellation",
    "indexDisruption"
})
public class IndexAdjustmentEvents
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexModification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexCancellation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexDisruption;

    /**
     * Gets the value of the indexModification property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexModification() {
        return indexModification;
    }

    /**
     * Sets the value of the indexModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexModification(IndexEventConsequenceEnum value) {
        this.indexModification = value;
    }

    /**
     * Gets the value of the indexCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexCancellation() {
        return indexCancellation;
    }

    /**
     * Sets the value of the indexCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexCancellation(IndexEventConsequenceEnum value) {
        this.indexCancellation = value;
    }

    /**
     * Gets the value of the indexDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexDisruption() {
        return indexDisruption;
    }

    /**
     * Sets the value of the indexDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexDisruption(IndexEventConsequenceEnum value) {
        this.indexDisruption = value;
    }

}
