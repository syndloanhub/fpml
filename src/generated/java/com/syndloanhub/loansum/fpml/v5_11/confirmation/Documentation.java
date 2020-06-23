//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An entity for defining the definitions that govern the document and should include the year and type of definitions referenced, along with any relevant documentation (such as master agreement) and the date it was signed.
 * 
 * <p>Java class for Documentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Documentation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masterAgreement" type="{http://www.fpml.org/FpML-5/confirmation}MasterAgreement" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="masterConfirmation" type="{http://www.fpml.org/FpML-5/confirmation}MasterConfirmation"/&gt;
 *           &lt;element name="brokerConfirmation" type="{http://www.fpml.org/FpML-5/confirmation}BrokerConfirmation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="contractualDefinitions" type="{http://www.fpml.org/FpML-5/confirmation}ContractualDefinitions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractualTermsSupplement" type="{http://www.fpml.org/FpML-5/confirmation}ContractualTermsSupplement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractualMatrix" type="{http://www.fpml.org/FpML-5/confirmation}ContractualMatrix" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditSupportAgreement" type="{http://www.fpml.org/FpML-5/confirmation}CreditSupportAgreement" minOccurs="0"/&gt;
 *         &lt;element name="otherAgreement" type="{http://www.fpml.org/FpML-5/confirmation}OtherAgreement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attachment" type="{http://www.fpml.org/FpML-5/confirmation}Resource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentation", propOrder = {
    "masterAgreement",
    "masterConfirmation",
    "brokerConfirmation",
    "contractualDefinitions",
    "contractualTermsSupplement",
    "contractualMatrix",
    "creditSupportAgreement",
    "otherAgreement",
    "attachment"
})
public class Documentation
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected MasterAgreement masterAgreement;
    protected MasterConfirmation masterConfirmation;
    protected BrokerConfirmation brokerConfirmation;
    protected List<ContractualDefinitions> contractualDefinitions;
    protected List<ContractualTermsSupplement> contractualTermsSupplement;
    protected List<ContractualMatrix> contractualMatrix;
    protected CreditSupportAgreement creditSupportAgreement;
    protected List<OtherAgreement> otherAgreement;
    protected List<Resource> attachment;

    /**
     * Gets the value of the masterAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement }
     *     
     */
    public MasterAgreement getMasterAgreement() {
        return masterAgreement;
    }

    /**
     * Sets the value of the masterAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement }
     *     
     */
    public void setMasterAgreement(MasterAgreement value) {
        this.masterAgreement = value;
    }

    /**
     * Gets the value of the masterConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmation }
     *     
     */
    public MasterConfirmation getMasterConfirmation() {
        return masterConfirmation;
    }

    /**
     * Sets the value of the masterConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmation }
     *     
     */
    public void setMasterConfirmation(MasterConfirmation value) {
        this.masterConfirmation = value;
    }

    /**
     * Gets the value of the brokerConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmation }
     *     
     */
    public BrokerConfirmation getBrokerConfirmation() {
        return brokerConfirmation;
    }

    /**
     * Sets the value of the brokerConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmation }
     *     
     */
    public void setBrokerConfirmation(BrokerConfirmation value) {
        this.brokerConfirmation = value;
    }

    /**
     * Gets the value of the contractualDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualDefinitions }
     * 
     * 
     */
    public List<ContractualDefinitions> getContractualDefinitions() {
        if (contractualDefinitions == null) {
            contractualDefinitions = new ArrayList<ContractualDefinitions>();
        }
        return this.contractualDefinitions;
    }

    /**
     * Gets the value of the contractualTermsSupplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualTermsSupplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualTermsSupplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualTermsSupplement }
     * 
     * 
     */
    public List<ContractualTermsSupplement> getContractualTermsSupplement() {
        if (contractualTermsSupplement == null) {
            contractualTermsSupplement = new ArrayList<ContractualTermsSupplement>();
        }
        return this.contractualTermsSupplement;
    }

    /**
     * Gets the value of the contractualMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualMatrix }
     * 
     * 
     */
    public List<ContractualMatrix> getContractualMatrix() {
        if (contractualMatrix == null) {
            contractualMatrix = new ArrayList<ContractualMatrix>();
        }
        return this.contractualMatrix;
    }

    /**
     * Gets the value of the creditSupportAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public CreditSupportAgreement getCreditSupportAgreement() {
        return creditSupportAgreement;
    }

    /**
     * Sets the value of the creditSupportAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public void setCreditSupportAgreement(CreditSupportAgreement value) {
        this.creditSupportAgreement = value;
    }

    /**
     * Gets the value of the otherAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAgreement }
     * 
     * 
     */
    public List<OtherAgreement> getOtherAgreement() {
        if (otherAgreement == null) {
            otherAgreement = new ArrayList<OtherAgreement>();
        }
        return this.otherAgreement;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Resource>();
        }
        return this.attachment;
    }

}
