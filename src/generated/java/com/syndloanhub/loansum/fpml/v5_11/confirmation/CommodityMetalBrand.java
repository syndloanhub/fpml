//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityMetalBrand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityMetalBrand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/confirmation}CommodityMetalBrandName"/&gt;
 *         &lt;element name="brandManager" type="{http://www.fpml.org/FpML-5/confirmation}CommodityMetalBrandManager" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.fpml.org/FpML-5/confirmation}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="producer" type="{http://www.fpml.org/FpML-5/confirmation}CommodityMetalProducer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityMetalBrand", propOrder = {
    "name",
    "brandManager",
    "country",
    "producer"
})
public class CommodityMetalBrand
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected CommodityMetalBrandName name;
    protected CommodityMetalBrandManager brandManager;
    protected CountryCode country;
    protected CommodityMetalProducer producer;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalBrandName }
     *     
     */
    public CommodityMetalBrandName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalBrandName }
     *     
     */
    public void setName(CommodityMetalBrandName value) {
        this.name = value;
    }

    /**
     * Gets the value of the brandManager property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalBrandManager }
     *     
     */
    public CommodityMetalBrandManager getBrandManager() {
        return brandManager;
    }

    /**
     * Sets the value of the brandManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalBrandManager }
     *     
     */
    public void setBrandManager(CommodityMetalBrandManager value) {
        this.brandManager = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalProducer }
     *     
     */
    public CommodityMetalProducer getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalProducer }
     *     
     */
    public void setProducer(CommodityMetalProducer value) {
        this.producer = value;
    }

}
