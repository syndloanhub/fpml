//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConvertibleBond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertibleBond"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Bond"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="underlyingEquity" type="{http://www.fpml.org/FpML-5/confirmation}EquityAsset" minOccurs="0"/&gt;
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertibleBond", propOrder = {
    "underlyingEquity",
    "redemptionDate"
})
public class ConvertibleBond
    extends Bond
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected EquityAsset underlyingEquity;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate redemptionDate;

    /**
     * Gets the value of the underlyingEquity property.
     * 
     * @return
     *     possible object is
     *     {@link EquityAsset }
     *     
     */
    public EquityAsset getUnderlyingEquity() {
        return underlyingEquity;
    }

    /**
     * Sets the value of the underlyingEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityAsset }
     *     
     */
    public void setUnderlyingEquity(EquityAsset value) {
        this.underlyingEquity = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDate(LocalDate value) {
        this.redemptionDate = value;
    }

}