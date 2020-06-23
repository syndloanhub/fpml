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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An entity for defining the master confirmation agreement executed between the parties.
 * 
 * <p>Java class for MasterConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masterConfirmationType" type="{http://www.fpml.org/FpML-5/confirmation}MasterConfirmationType"/&gt;
 *         &lt;element name="masterConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="masterConfirmationAnnexDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="masterConfirmationAnnexType" type="{http://www.fpml.org/FpML-5/confirmation}MasterConfirmationAnnexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConfirmation", propOrder = {
    "masterConfirmationType",
    "masterConfirmationDate",
    "masterConfirmationAnnexDate",
    "masterConfirmationAnnexType"
})
public class MasterConfirmation
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected MasterConfirmationType masterConfirmationType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate masterConfirmationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate masterConfirmationAnnexDate;
    protected MasterConfirmationAnnexType masterConfirmationAnnexType;

    /**
     * Gets the value of the masterConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationType }
     *     
     */
    public MasterConfirmationType getMasterConfirmationType() {
        return masterConfirmationType;
    }

    /**
     * Sets the value of the masterConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationType }
     *     
     */
    public void setMasterConfirmationType(MasterConfirmationType value) {
        this.masterConfirmationType = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationDate(LocalDate value) {
        this.masterConfirmationDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMasterConfirmationAnnexDate() {
        return masterConfirmationAnnexDate;
    }

    /**
     * Sets the value of the masterConfirmationAnnexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationAnnexDate(LocalDate value) {
        this.masterConfirmationAnnexDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public MasterConfirmationAnnexType getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    /**
     * Sets the value of the masterConfirmationAnnexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public void setMasterConfirmationAnnexType(MasterConfirmationAnnexType value) {
        this.masterConfirmationAnnexType = value;
    }

}
