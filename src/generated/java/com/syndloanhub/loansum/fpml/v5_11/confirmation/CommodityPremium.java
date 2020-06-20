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
 * The commodity option premium payable by the buyer to the seller.
 * 
 * <p>Java class for CommodityPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPremium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}NonNegativePayment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="premiumPerUnit" type="{http://www.fpml.org/FpML-5/confirmation}NonNegativeMoney" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPremium", propOrder = {
    "premiumPerUnit"
})
public class CommodityPremium
    extends NonNegativePayment
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected NonNegativeMoney premiumPerUnit;

    /**
     * Gets the value of the premiumPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPremiumPerUnit() {
        return premiumPerUnit;
    }

    /**
     * Sets the value of the premiumPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPremiumPerUnit(NonNegativeMoney value) {
        this.premiumPerUnit = value;
    }

}
