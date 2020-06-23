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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Physically settled leg of a physically settled oil product transaction.
 * 
 * <p>Java class for OilPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilPhysicalLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PhysicalSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/confirmation}CommodityDeliveryPeriods"/&gt;
 *         &lt;element name="oil" type="{http://www.fpml.org/FpML-5/confirmation}OilProduct"/&gt;
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/confirmation}OilDelivery"/&gt;
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
@XmlType(name = "OilPhysicalLeg", propOrder = {
    "deliveryPeriods",
    "oil",
    "deliveryConditions",
    "deliveryQuantity"
})
public class OilPhysicalLeg
    extends PhysicalSwapLeg
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected CommodityDeliveryPeriods deliveryPeriods;
    @XmlElement(required = true)
    protected OilProduct oil;
    @XmlElement(required = true)
    protected OilDelivery deliveryConditions;
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
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link OilProduct }
     *     
     */
    public OilProduct getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilProduct }
     *     
     */
    public void setOil(OilProduct value) {
        this.oil = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link OilDelivery }
     *     
     */
    public OilDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilDelivery }
     *     
     */
    public void setDeliveryConditions(OilDelivery value) {
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
