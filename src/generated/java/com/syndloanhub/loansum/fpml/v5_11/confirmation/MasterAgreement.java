//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An entity for defining the agreement executed between the parties and intended to govern all OTC derivatives transactions between those parties.
 * 
 * <p>Java class for MasterAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masterAgreementId" type="{http://www.fpml.org/FpML-5/confirmation}MasterAgreementId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="masterAgreementType" type="{http://www.fpml.org/FpML-5/confirmation}MasterAgreementType"/&gt;
 *         &lt;element name="masterAgreementVersion" type="{http://www.fpml.org/FpML-5/confirmation}MasterAgreementVersion" minOccurs="0"/&gt;
 *         &lt;element name="masterAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAgreement", propOrder = {
    "masterAgreementId",
    "masterAgreementType",
    "masterAgreementVersion",
    "masterAgreementDate"
})
public class MasterAgreement
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<MasterAgreementId> masterAgreementId;
    @XmlElement(required = true)
    protected MasterAgreementType masterAgreementType;
    protected MasterAgreementVersion masterAgreementVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate masterAgreementDate;

    /**
     * Gets the value of the masterAgreementId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterAgreementId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterAgreementId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterAgreementId }
     * 
     * 
     */
    public List<MasterAgreementId> getMasterAgreementId() {
        if (masterAgreementId == null) {
            masterAgreementId = new ArrayList<MasterAgreementId>();
        }
        return this.masterAgreementId;
    }

    /**
     * Gets the value of the masterAgreementType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementType }
     *     
     */
    public MasterAgreementType getMasterAgreementType() {
        return masterAgreementType;
    }

    /**
     * Sets the value of the masterAgreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementType }
     *     
     */
    public void setMasterAgreementType(MasterAgreementType value) {
        this.masterAgreementType = value;
    }

    /**
     * Gets the value of the masterAgreementVersion property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public MasterAgreementVersion getMasterAgreementVersion() {
        return masterAgreementVersion;
    }

    /**
     * Sets the value of the masterAgreementVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public void setMasterAgreementVersion(MasterAgreementVersion value) {
        this.masterAgreementVersion = value;
    }

    /**
     * Gets the value of the masterAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMasterAgreementDate() {
        return masterAgreementDate;
    }

    /**
     * Sets the value of the masterAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterAgreementDate(LocalDate value) {
        this.masterAgreementDate = value;
    }

}
