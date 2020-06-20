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
 * A structure that defines the assets (or type of assets) that a particular payment profile may be associated with.
 * 
 * <p>Java class for ApplicableAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicableAssets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="dealIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}DealIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element name="facilityIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}FacilityIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element name="facilityType" type="{http://www.fpml.org/FpML-5/confirmation}FacilityType" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="allAssets" type="{http://www.fpml.org/FpML-5/confirmation}LoanAllAssetsEnum"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicableAssets", propOrder = {
    "dealIdentifier",
    "facilityIdentifier",
    "facilityType",
    "allAssets"
})
public class ApplicableAssets
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<DealIdentifier> dealIdentifier;
    protected List<FacilityIdentifier> facilityIdentifier;
    protected List<FacilityType> facilityType;
    @XmlSchemaType(name = "token")
    protected LoanAllAssetsEnum allAssets;

    /**
     * Gets the value of the dealIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealIdentifier }
     * 
     * 
     */
    public List<DealIdentifier> getDealIdentifier() {
        if (dealIdentifier == null) {
            dealIdentifier = new ArrayList<DealIdentifier>();
        }
        return this.dealIdentifier;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityIdentifier }
     * 
     * 
     */
    public List<FacilityIdentifier> getFacilityIdentifier() {
        if (facilityIdentifier == null) {
            facilityIdentifier = new ArrayList<FacilityIdentifier>();
        }
        return this.facilityIdentifier;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityType }
     * 
     * 
     */
    public List<FacilityType> getFacilityType() {
        if (facilityType == null) {
            facilityType = new ArrayList<FacilityType>();
        }
        return this.facilityType;
    }

    /**
     * Gets the value of the allAssets property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAllAssetsEnum }
     *     
     */
    public LoanAllAssetsEnum getAllAssets() {
        return allAssets;
    }

    /**
     * Sets the value of the allAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAllAssetsEnum }
     *     
     */
    public void setAllAssets(LoanAllAssetsEnum value) {
        this.allAssets = value;
    }

}