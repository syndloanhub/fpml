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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type for defining a series of dates that shall be subject to adjustment if they would otherwise fall on a day that is not a business day in the specified business centers, together with the convention for adjusting the dates.
 * 
 * <p>Java class for AdjustableDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unadjustedDate" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedDate" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dateAdjustments" type="{http://www.fpml.org/FpML-5/confirmation}BusinessDayAdjustments"/&gt;
 *         &lt;element name="adjustedDate" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustableDates", propOrder = {
    "unadjustedDate",
    "dateAdjustments",
    "adjustedDate"
})
public class AdjustableDates implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected List<IdentifiedDate> unadjustedDate;
    @XmlElement(required = true)
    protected BusinessDayAdjustments dateAdjustments;
    protected List<IdentifiedDate> adjustedDate;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unadjustedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unadjustedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnadjustedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedDate }
     * 
     * 
     */
    public List<IdentifiedDate> getUnadjustedDate() {
        if (unadjustedDate == null) {
            unadjustedDate = new ArrayList<IdentifiedDate>();
        }
        return this.unadjustedDate;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setDateAdjustments(BusinessDayAdjustments value) {
        this.dateAdjustments = value;
    }

    /**
     * Gets the value of the adjustedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedDate }
     * 
     * 
     */
    public List<IdentifiedDate> getAdjustedDate() {
        if (adjustedDate == null) {
            adjustedDate = new ArrayList<IdentifiedDate>();
        }
        return this.adjustedDate;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
