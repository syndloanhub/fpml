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
 * Physically settled leg of a physically settled gas transaction.
 * 
 * <p>Java class for GasPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasPhysicalLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PhysicalSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/confirmation}GasDeliveryPeriods"/&gt;
 *         &lt;element name="gas" type="{http://www.fpml.org/FpML-5/confirmation}GasProduct"/&gt;
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/confirmation}GasDelivery"/&gt;
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/FpML-5/confirmation}GasPhysicalQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasPhysicalLeg", propOrder = {
    "deliveryPeriods",
    "gas",
    "deliveryConditions",
    "deliveryQuantity"
})
public class GasPhysicalLeg
    extends PhysicalSwapLeg
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected GasDeliveryPeriods deliveryPeriods;
    @XmlElement(required = true)
    protected GasProduct gas;
    @XmlElement(required = true)
    protected GasDelivery deliveryConditions;
    @XmlElement(required = true)
    protected GasPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link GasDeliveryPeriods }
     *     
     */
    public GasDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(GasDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the gas property.
     * 
     * @return
     *     possible object is
     *     {@link GasProduct }
     *     
     */
    public GasProduct getGas() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasProduct }
     *     
     */
    public void setGas(GasProduct value) {
        this.gas = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link GasDelivery }
     *     
     */
    public GasDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDelivery }
     *     
     */
    public void setDeliveryConditions(GasDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link GasPhysicalQuantity }
     *     
     */
    public GasPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(GasPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}
