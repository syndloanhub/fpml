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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A unique identifier to a facility.
 * 
 * <p>Java class for FacilityIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}IdentifiedAssetWithParty"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dealReference" type="{http://www.fpml.org/FpML-5/confirmation}DealReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityIdentifier", propOrder = {
    "dealReference"
})
@XmlSeeAlso({
    FacilitySummary.class
})
public class FacilityIdentifier
    extends IdentifiedAssetWithParty
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected DealReference dealReference;

    /**
     * Gets the value of the dealReference property.
     * 
     * @return
     *     possible object is
     *     {@link DealReference }
     *     
     */
    public DealReference getDealReference() {
        return dealReference;
    }

    /**
     * Sets the value of the dealReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealReference }
     *     
     */
    public void setDealReference(DealReference value) {
        this.dealReference = value;
    }

}
