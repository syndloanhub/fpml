//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An abstract base type for all syndicated loan statement notifications; the wrapper for deal/facility/contract definitions and facility/contract positions at a particular point in time (snapshot).
 * 
 * <p>Java class for AbstractLoanStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLoanStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}CorrectableRequestMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statementDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="comments" type="{http://www.fpml.org/FpML-5/confirmation}String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractLoanStatement", propOrder = {
    "statementDate",
    "comments"
})
@XmlSeeAlso({
    DealStatement.class,
    FacilityStatement.class,
    OutstandingContractsStatement.class,
    FacilityPositionStatement.class
})
public abstract class AbstractLoanStatement
    extends CorrectableRequestMessage
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate statementDate;
    protected String comments;

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementDate(LocalDate value) {
        this.statementDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
