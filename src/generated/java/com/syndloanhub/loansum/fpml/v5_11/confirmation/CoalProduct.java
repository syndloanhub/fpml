//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the characteristics of the coal being traded in a physically settled gas transaction.
 * 
 * <p>Java class for CoalProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="type" type="{http://www.fpml.org/FpML-5/confirmation}CoalProductType"/&gt;
 *           &lt;element name="coalProductSpecifications" type="{http://www.fpml.org/FpML-5/confirmation}CoalProductSpecifications"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="source" type="{http://www.fpml.org/FpML-5/confirmation}CoalProductSource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sCoTASpecifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityUSCoalProduct.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalProduct", propOrder = {
    "type",
    "coalProductSpecifications",
    "source",
    "sCoTASpecifications",
    "btuQualityAdjustment",
    "so2QualityAdjustment"
})
public class CoalProduct
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected CoalProductType type;
    protected CoalProductSpecifications coalProductSpecifications;
    @XmlElement(required = true)
    protected List<CoalProductSource> source;
    protected Boolean sCoTASpecifications;
    protected CoalQualityAdjustments btuQualityAdjustment;
    protected CoalQualityAdjustments so2QualityAdjustment;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CoalProductType }
     *     
     */
    public CoalProductType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalProductType }
     *     
     */
    public void setType(CoalProductType value) {
        this.type = value;
    }

    /**
     * Gets the value of the coalProductSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link CoalProductSpecifications }
     *     
     */
    public CoalProductSpecifications getCoalProductSpecifications() {
        return coalProductSpecifications;
    }

    /**
     * Sets the value of the coalProductSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalProductSpecifications }
     *     
     */
    public void setCoalProductSpecifications(CoalProductSpecifications value) {
        this.coalProductSpecifications = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoalProductSource }
     * 
     * 
     */
    public List<CoalProductSource> getSource() {
        if (source == null) {
            source = new ArrayList<CoalProductSource>();
        }
        return this.source;
    }

    /**
     * Gets the value of the sCoTASpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSCoTASpecifications() {
        return sCoTASpecifications;
    }

    /**
     * Sets the value of the sCoTASpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSCoTASpecifications(Boolean value) {
        this.sCoTASpecifications = value;
    }

    /**
     * Gets the value of the btuQualityAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link CoalQualityAdjustments }
     *     
     */
    public CoalQualityAdjustments getBtuQualityAdjustment() {
        return btuQualityAdjustment;
    }

    /**
     * Sets the value of the btuQualityAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalQualityAdjustments }
     *     
     */
    public void setBtuQualityAdjustment(CoalQualityAdjustments value) {
        this.btuQualityAdjustment = value;
    }

    /**
     * Gets the value of the so2QualityAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link CoalQualityAdjustments }
     *     
     */
    public CoalQualityAdjustments getSo2QualityAdjustment() {
        return so2QualityAdjustment;
    }

    /**
     * Sets the value of the so2QualityAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalQualityAdjustments }
     *     
     */
    public void setSo2QualityAdjustment(CoalQualityAdjustments value) {
        this.so2QualityAdjustment = value;
    }

}
