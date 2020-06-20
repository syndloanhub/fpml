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
import javax.xml.bind.annotation.XmlType;


/**
 * A cashflow component with optional calculation details that explain how the reset value was computed.
 * 
 * <p>Java class for ResetCalculationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetCalculationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="observation" type="{http://www.fpml.org/FpML-5/confirmation}Observation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="calculationElements" type="{http://www.fpml.org/FpML-5/confirmation}ResetCalculationElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetCalculationDetails", propOrder = {
    "observation",
    "calculationElements"
})
public class ResetCalculationDetails
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<Observation> observation;
    protected ResetCalculationElements calculationElements;

    /**
     * Gets the value of the observation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Observation }
     * 
     * 
     */
    public List<Observation> getObservation() {
        if (observation == null) {
            observation = new ArrayList<Observation>();
        }
        return this.observation;
    }

    /**
     * Gets the value of the calculationElements property.
     * 
     * @return
     *     possible object is
     *     {@link ResetCalculationElements }
     *     
     */
    public ResetCalculationElements getCalculationElements() {
        return calculationElements;
    }

    /**
     * Sets the value of the calculationElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetCalculationElements }
     *     
     */
    public void setCalculationElements(ResetCalculationElements value) {
        this.calculationElements = value;
    }

}
