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
 * A type defining the physical quantity of the commodity to be delivered.
 * 
 * <p>Java class for CommodityPhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPhysicalQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}CommodityPhysicalQuantityBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityFixedPhysicalQuantity.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPhysicalQuantity", propOrder = {
    "physicalQuantity",
    "physicalQuantitySchedule",
    "totalPhysicalQuantity"
})
public class CommodityPhysicalQuantity
    extends CommodityPhysicalQuantityBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected CommodityNotionalQuantity physicalQuantity;
    protected CommodityPhysicalQuantitySchedule physicalQuantitySchedule;
    protected UnitQuantity totalPhysicalQuantity;

    /**
     * Gets the value of the physicalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getPhysicalQuantity() {
        return physicalQuantity;
    }

    /**
     * Sets the value of the physicalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setPhysicalQuantity(CommodityNotionalQuantity value) {
        this.physicalQuantity = value;
    }

    /**
     * Gets the value of the physicalQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalQuantitySchedule }
     *     
     */
    public CommodityPhysicalQuantitySchedule getPhysicalQuantitySchedule() {
        return physicalQuantitySchedule;
    }

    /**
     * Sets the value of the physicalQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalQuantitySchedule }
     *     
     */
    public void setPhysicalQuantitySchedule(CommodityPhysicalQuantitySchedule value) {
        this.physicalQuantitySchedule = value;
    }

    /**
     * Gets the value of the totalPhysicalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link UnitQuantity }
     *     
     */
    public UnitQuantity getTotalPhysicalQuantity() {
        return totalPhysicalQuantity;
    }

    /**
     * Sets the value of the totalPhysicalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitQuantity }
     *     
     */
    public void setTotalPhysicalQuantity(UnitQuantity value) {
        this.totalPhysicalQuantity = value;
    }

}
