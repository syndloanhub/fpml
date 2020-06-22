//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An event representing a change of maturity date on a one or more outstanding loan contracts.
 * 
 * <p>Java class for LoanContractMaturityChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractMaturityChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanContractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="priorMaturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractMaturityChange", propOrder = {
    "currentMaturityDate",
    "priorMaturityDate"
})
public class LoanContractMaturityChange
    extends AbstractLoanContractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate currentMaturityDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate priorMaturityDate;

    /**
     * Gets the value of the currentMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCurrentMaturityDate() {
        return currentMaturityDate;
    }

    /**
     * Sets the value of the currentMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentMaturityDate(LocalDate value) {
        this.currentMaturityDate = value;
    }

    /**
     * Gets the value of the priorMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPriorMaturityDate() {
        return priorMaturityDate;
    }

    /**
     * Sets the value of the priorMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorMaturityDate(LocalDate value) {
        this.priorMaturityDate = value;
    }

}
