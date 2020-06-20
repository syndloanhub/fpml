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
 * The different options for specifying the Delivery Periods for a physically settled gas trade.
 * 
 * <p>Java class for GasDeliveryPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasDeliveryPeriods"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}CommodityDeliveryPeriods"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="supplyStartTime" type="{http://www.fpml.org/FpML-5/confirmation}PrevailingTime"/&gt;
 *         &lt;element name="supplyEndTime" type="{http://www.fpml.org/FpML-5/confirmation}PrevailingTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasDeliveryPeriods", propOrder = {
    "supplyStartTime",
    "supplyEndTime"
})
public class GasDeliveryPeriods
    extends CommodityDeliveryPeriods
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected PrevailingTime supplyStartTime;
    protected PrevailingTime supplyEndTime;

    /**
     * Gets the value of the supplyStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyStartTime() {
        return supplyStartTime;
    }

    /**
     * Sets the value of the supplyStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyStartTime(PrevailingTime value) {
        this.supplyStartTime = value;
    }

    /**
     * Gets the value of the supplyEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyEndTime() {
        return supplyEndTime;
    }

    /**
     * Sets the value of the supplyEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyEndTime(PrevailingTime value) {
        this.supplyEndTime = value;
    }

}