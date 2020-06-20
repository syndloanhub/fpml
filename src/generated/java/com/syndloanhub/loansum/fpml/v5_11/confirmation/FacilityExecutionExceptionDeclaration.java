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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides supporting evidence when a party invoked exception to not execute the trade on facility such as SEF and DCM even though the particular product is mandated to execute on a SEF.
 * 
 * <p>Java class for FacilityExecutionExceptionDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityExecutionExceptionDeclaration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/confirmation}Token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organizationCharacteristic" type="{http://www.fpml.org/FpML-5/confirmation}OrganizationCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transactionCharacteristic" type="{http://www.fpml.org/FpML-5/confirmation}TransactionCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supervisorRegistration" type="{http://www.fpml.org/FpML-5/confirmation}SupervisorRegistration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityExecutionExceptionDeclaration", propOrder = {
    "reason",
    "organizationCharacteristic",
    "transactionCharacteristic",
    "supervisorRegistration"
})
public class FacilityExecutionExceptionDeclaration implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> reason;
    protected List<OrganizationCharacteristic> organizationCharacteristic;
    protected List<TransactionCharacteristic> transactionCharacteristic;
    protected List<SupervisorRegistration> supervisorRegistration;

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReason() {
        if (reason == null) {
            reason = new ArrayList<String>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the organizationCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationCharacteristic }
     * 
     * 
     */
    public List<OrganizationCharacteristic> getOrganizationCharacteristic() {
        if (organizationCharacteristic == null) {
            organizationCharacteristic = new ArrayList<OrganizationCharacteristic>();
        }
        return this.organizationCharacteristic;
    }

    /**
     * Gets the value of the transactionCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCharacteristic }
     * 
     * 
     */
    public List<TransactionCharacteristic> getTransactionCharacteristic() {
        if (transactionCharacteristic == null) {
            transactionCharacteristic = new ArrayList<TransactionCharacteristic>();
        }
        return this.transactionCharacteristic;
    }

    /**
     * Gets the value of the supervisorRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisorRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisorRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisorRegistration }
     * 
     * 
     */
    public List<SupervisorRegistration> getSupervisorRegistration() {
        if (supervisorRegistration == null) {
            supervisorRegistration = new ArrayList<SupervisorRegistration>();
        }
        return this.supervisorRegistration;
    }

}
