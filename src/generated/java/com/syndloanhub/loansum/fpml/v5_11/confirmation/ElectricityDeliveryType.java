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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="firm" type="{http://www.fpml.org/FpML-5/confirmation}ElectricityDeliveryFirm"/&gt;
 *         &lt;element name="nonFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="systemFirm" type="{http://www.fpml.org/FpML-5/confirmation}ElectricityDeliverySystemFirm"/&gt;
 *         &lt;element name="unitFirm" type="{http://www.fpml.org/FpML-5/confirmation}ElectricityDeliveryUnitFirm"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDeliveryType", propOrder = {
    "firm",
    "nonFirm",
    "systemFirm",
    "unitFirm"
})
public class ElectricityDeliveryType
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected ElectricityDeliveryFirm firm;
    protected Boolean nonFirm;
    protected ElectricityDeliverySystemFirm systemFirm;
    protected ElectricityDeliveryUnitFirm unitFirm;

    /**
     * Gets the value of the firm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryFirm }
     *     
     */
    public ElectricityDeliveryFirm getFirm() {
        return firm;
    }

    /**
     * Sets the value of the firm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryFirm }
     *     
     */
    public void setFirm(ElectricityDeliveryFirm value) {
        this.firm = value;
    }

    /**
     * Gets the value of the nonFirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonFirm() {
        return nonFirm;
    }

    /**
     * Sets the value of the nonFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonFirm(Boolean value) {
        this.nonFirm = value;
    }

    /**
     * Gets the value of the systemFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliverySystemFirm }
     *     
     */
    public ElectricityDeliverySystemFirm getSystemFirm() {
        return systemFirm;
    }

    /**
     * Sets the value of the systemFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliverySystemFirm }
     *     
     */
    public void setSystemFirm(ElectricityDeliverySystemFirm value) {
        this.systemFirm = value;
    }

    /**
     * Gets the value of the unitFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryUnitFirm }
     *     
     */
    public ElectricityDeliveryUnitFirm getUnitFirm() {
        return unitFirm;
    }

    /**
     * Sets the value of the unitFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryUnitFirm }
     *     
     */
    public void setUnitFirm(ElectricityDeliveryUnitFirm value) {
        this.unitFirm = value;
    }

}