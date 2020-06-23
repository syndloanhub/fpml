//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProtectionTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectionTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculationAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/&gt;
 *         &lt;element name="creditEvents" type="{http://www.fpml.org/FpML-5/confirmation}CreditEvents" minOccurs="0"/&gt;
 *         &lt;element name="obligations" type="{http://www.fpml.org/FpML-5/confirmation}Obligations" minOccurs="0"/&gt;
 *         &lt;element name="floatingAmountEvents" type="{http://www.fpml.org/FpML-5/confirmation}FloatingAmountEvents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionTerms", propOrder = {
    "calculationAmount",
    "creditEvents",
    "obligations",
    "floatingAmountEvents"
})
public class ProtectionTerms
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected Money calculationAmount;
    protected CreditEvents creditEvents;
    protected Obligations obligations;
    protected FloatingAmountEvents floatingAmountEvents;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the calculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculationAmount() {
        return calculationAmount;
    }

    /**
     * Sets the value of the calculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculationAmount(Money value) {
        this.calculationAmount = value;
    }

    /**
     * Gets the value of the creditEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEvents }
     *     
     */
    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    /**
     * Sets the value of the creditEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEvents }
     *     
     */
    public void setCreditEvents(CreditEvents value) {
        this.creditEvents = value;
    }

    /**
     * Gets the value of the obligations property.
     * 
     * @return
     *     possible object is
     *     {@link Obligations }
     *     
     */
    public Obligations getObligations() {
        return obligations;
    }

    /**
     * Sets the value of the obligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligations }
     *     
     */
    public void setObligations(Obligations value) {
        this.obligations = value;
    }

    /**
     * Gets the value of the floatingAmountEvents property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingAmountEvents }
     *     
     */
    public FloatingAmountEvents getFloatingAmountEvents() {
        return floatingAmountEvents;
    }

    /**
     * Sets the value of the floatingAmountEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingAmountEvents }
     *     
     */
    public void setFloatingAmountEvents(FloatingAmountEvents value) {
        this.floatingAmountEvents = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
