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
 * <p>Java class for PhysicalSettlementTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlementTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}SettlementTerms"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalSettlementPeriod" type="{http://www.fpml.org/FpML-5/confirmation}PhysicalSettlementPeriod" minOccurs="0"/&gt;
 *         &lt;element name="deliverableObligations" type="{http://www.fpml.org/FpML-5/confirmation}DeliverableObligations" minOccurs="0"/&gt;
 *         &lt;element name="escrow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sixtyBusinessDaySettlementCap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlementTerms", propOrder = {
    "physicalSettlementPeriod",
    "deliverableObligations",
    "escrow",
    "sixtyBusinessDaySettlementCap"
})
public class PhysicalSettlementTerms
    extends SettlementTerms
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected PhysicalSettlementPeriod physicalSettlementPeriod;
    protected DeliverableObligations deliverableObligations;
    protected Boolean escrow;
    protected Boolean sixtyBusinessDaySettlementCap;

    /**
     * Gets the value of the physicalSettlementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalSettlementPeriod }
     *     
     */
    public PhysicalSettlementPeriod getPhysicalSettlementPeriod() {
        return physicalSettlementPeriod;
    }

    /**
     * Sets the value of the physicalSettlementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSettlementPeriod }
     *     
     */
    public void setPhysicalSettlementPeriod(PhysicalSettlementPeriod value) {
        this.physicalSettlementPeriod = value;
    }

    /**
     * Gets the value of the deliverableObligations property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverableObligations }
     *     
     */
    public DeliverableObligations getDeliverableObligations() {
        return deliverableObligations;
    }

    /**
     * Sets the value of the deliverableObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverableObligations }
     *     
     */
    public void setDeliverableObligations(DeliverableObligations value) {
        this.deliverableObligations = value;
    }

    /**
     * Gets the value of the escrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrow() {
        return escrow;
    }

    /**
     * Sets the value of the escrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscrow(Boolean value) {
        this.escrow = value;
    }

    /**
     * Gets the value of the sixtyBusinessDaySettlementCap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSixtyBusinessDaySettlementCap() {
        return sixtyBusinessDaySettlementCap;
    }

    /**
     * Sets the value of the sixtyBusinessDaySettlementCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSixtyBusinessDaySettlementCap(Boolean value) {
        this.sixtyBusinessDaySettlementCap = value;
    }

}
