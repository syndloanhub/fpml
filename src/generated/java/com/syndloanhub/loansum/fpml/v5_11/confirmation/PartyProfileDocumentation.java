//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that defines documentation related to a party profile.
 * 
 * <p>Java class for PartyProfileDocumentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyProfileDocumentation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxForm" type="{http://www.fpml.org/FpML-5/confirmation}TaxForm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyProfileDocumentation", propOrder = {
    "taxForm"
})
public class PartyProfileDocumentation
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected TaxForm taxForm;

    /**
     * Gets the value of the taxForm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxForm }
     *     
     */
    public TaxForm getTaxForm() {
        return taxForm;
    }

    /**
     * Sets the value of the taxForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxForm }
     *     
     */
    public void setTaxForm(TaxForm value) {
        this.taxForm = value;
    }

}
