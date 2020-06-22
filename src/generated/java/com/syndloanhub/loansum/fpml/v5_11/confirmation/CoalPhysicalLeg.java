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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Physically settled leg of a physically settled coal transaction.
 * 
 * <p>Java class for CoalPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalPhysicalLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PhysicalSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/confirmation}CommodityDeliveryPeriods"/&gt;
 *         &lt;element name="coal" type="{http://www.fpml.org/FpML-5/confirmation}CoalProduct"/&gt;
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/confirmation}CoalDelivery"/&gt;
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/FpML-5/confirmation}CommodityPhysicalQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalPhysicalLeg", propOrder = {
    "deliveryPeriods",
    "coal",
    "deliveryConditions",
    "deliveryQuantity"
})
public class CoalPhysicalLeg
    extends PhysicalSwapLeg
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected CommodityDeliveryPeriods deliveryPeriods;
    @XmlElement(required = true)
    protected CoalProduct coal;
    @XmlElement(required = true)
    protected CoalDelivery deliveryConditions;
    @XmlElement(required = true)
    protected CommodityPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public CommodityDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(CommodityDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link CoalProduct }
     *     
     */
    public CoalProduct getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalProduct }
     *     
     */
    public void setCoal(CoalProduct value) {
        this.coal = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link CoalDelivery }
     *     
     */
    public CoalDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalDelivery }
     *     
     */
    public void setDeliveryConditions(CoalDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public CommodityPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(CommodityPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}
