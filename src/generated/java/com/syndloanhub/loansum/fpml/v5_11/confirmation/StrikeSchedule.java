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
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a schedule of cap or floor rates.
 * 
 * <p>Java class for StrikeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrikeSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Schedule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buyer" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedPayerReceiver" minOccurs="0"/&gt;
 *         &lt;element name="seller" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedPayerReceiver" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeSchedule", propOrder = {
    "buyer",
    "seller"
})
public class StrikeSchedule
    extends Schedule
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected IdentifiedPayerReceiver buyer;
    protected IdentifiedPayerReceiver seller;

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public IdentifiedPayerReceiver getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public void setBuyer(IdentifiedPayerReceiver value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public IdentifiedPayerReceiver getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public void setSeller(IdentifiedPayerReceiver value) {
        this.seller = value;
    }

}
