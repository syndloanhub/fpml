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
 * A type specifying the date from which the early termination clause can be exercised.
 * 
 * <p>Java class for CommodityStartingDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityStartingDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="dateRelativeTo" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference"/&gt;
 *         &lt;element name="adjustableDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableDate"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityStartingDate", propOrder = {
    "dateRelativeTo",
    "adjustableDate"
})
public class CommodityStartingDate
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected PartyReference dateRelativeTo;
    protected AdjustableDate adjustableDate;

    /**
     * Gets the value of the dateRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getDateRelativeTo() {
        return dateRelativeTo;
    }

    /**
     * Sets the value of the dateRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setDateRelativeTo(PartyReference value) {
        this.dateRelativeTo = value;
    }

    /**
     * Gets the value of the adjustableDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getAdjustableDate() {
        return adjustableDate;
    }

    /**
     * Sets the value of the adjustableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setAdjustableDate(AdjustableDate value) {
        this.adjustableDate = value;
    }

}
