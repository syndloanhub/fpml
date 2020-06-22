//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure to specify the tranmission contingency and the party that bears the obligation.
 * 
 * <p>Java class for ElectricityTransmissionContingency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityTransmissionContingency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contingency" type="{http://www.fpml.org/FpML-5/confirmation}ElectricityTransmissionContingencyType"/&gt;
 *         &lt;element name="contingentParty" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityTransmissionContingency", propOrder = {
    "contingency",
    "contingentParty"
})
public class ElectricityTransmissionContingency
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected ElectricityTransmissionContingencyType contingency;
    @XmlElement(required = true)
    protected List<PartyReference> contingentParty;

    /**
     * Gets the value of the contingency property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityTransmissionContingencyType }
     *     
     */
    public ElectricityTransmissionContingencyType getContingency() {
        return contingency;
    }

    /**
     * Sets the value of the contingency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityTransmissionContingencyType }
     *     
     */
    public void setContingency(ElectricityTransmissionContingencyType value) {
        this.contingency = value;
    }

    /**
     * Gets the value of the contingentParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contingentParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContingentParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getContingentParty() {
        if (contingentParty == null) {
            contingentParty = new ArrayList<PartyReference>();
        }
        return this.contingentParty;
    }

}
