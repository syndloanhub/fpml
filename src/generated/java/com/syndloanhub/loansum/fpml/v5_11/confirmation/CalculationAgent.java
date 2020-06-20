//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the ISDA calculation agent responsible for performing duties as defined in the applicable product definitions.
 * 
 * <p>Java class for CalculationAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationAgent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="calculationAgentPartyReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="calculationAgentParty" type="{http://www.fpml.org/FpML-5/confirmation}CalculationAgentPartyEnum"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationAgent", propOrder = {
    "calculationAgentPartyReference",
    "calculationAgentParty"
})
public class CalculationAgent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<PartyReference> calculationAgentPartyReference;
    @XmlSchemaType(name = "token")
    protected CalculationAgentPartyEnum calculationAgentParty;

    /**
     * Gets the value of the calculationAgentPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculationAgentPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculationAgentPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getCalculationAgentPartyReference() {
        if (calculationAgentPartyReference == null) {
            calculationAgentPartyReference = new ArrayList<PartyReference>();
        }
        return this.calculationAgentPartyReference;
    }

    /**
     * Gets the value of the calculationAgentParty property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationAgentPartyEnum }
     *     
     */
    public CalculationAgentPartyEnum getCalculationAgentParty() {
        return calculationAgentParty;
    }

    /**
     * Sets the value of the calculationAgentParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationAgentPartyEnum }
     *     
     */
    public void setCalculationAgentParty(CalculationAgentPartyEnum value) {
        this.calculationAgentParty = value;
    }

}