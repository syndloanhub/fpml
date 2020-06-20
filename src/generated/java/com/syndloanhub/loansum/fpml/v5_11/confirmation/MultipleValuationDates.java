//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleValuationDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleValuationDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}SingleValuationDate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessDaysThereafter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberValuationDates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleValuationDates", propOrder = {
    "businessDaysThereafter",
    "numberValuationDates"
})
public class MultipleValuationDates
    extends SingleValuationDate
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger businessDaysThereafter;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberValuationDates;

    /**
     * Gets the value of the businessDaysThereafter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessDaysThereafter() {
        return businessDaysThereafter;
    }

    /**
     * Sets the value of the businessDaysThereafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessDaysThereafter(BigInteger value) {
        this.businessDaysThereafter = value;
    }

    /**
     * Gets the value of the numberValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberValuationDates() {
        return numberValuationDates;
    }

    /**
     * Sets the value of the numberValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberValuationDates(BigInteger value) {
        this.numberValuationDates = value;
    }

}