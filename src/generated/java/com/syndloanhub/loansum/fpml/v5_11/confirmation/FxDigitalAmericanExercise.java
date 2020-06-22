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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Descrines the characteristics for American exercise in FX digital options.
 * 
 * <p>Java class for FxDigitalAmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDigitalAmericanExercise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Exercise"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commencementDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="expiryTime" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenterTime" minOccurs="0"/&gt;
 *         &lt;element name="cutName" type="{http://www.fpml.org/FpML-5/confirmation}CutName" minOccurs="0"/&gt;
 *         &lt;element name="latestValueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDigitalAmericanExercise", propOrder = {
    "commencementDate",
    "expiryDate",
    "expiryTime",
    "cutName",
    "latestValueDate"
})
@XmlSeeAlso({
    FxAmericanExercise.class
})
public class FxDigitalAmericanExercise
    extends Exercise
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate commencementDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate expiryDate;
    protected BusinessCenterTime expiryTime;
    protected CutName cutName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate latestValueDate;

    /**
     * Gets the value of the commencementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCommencementDate() {
        return commencementDate;
    }

    /**
     * Sets the value of the commencementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCommencementDate(AdjustableOrRelativeDate value) {
        this.commencementDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(LocalDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setExpiryTime(BusinessCenterTime value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the cutName property.
     * 
     * @return
     *     possible object is
     *     {@link CutName }
     *     
     */
    public CutName getCutName() {
        return cutName;
    }

    /**
     * Sets the value of the cutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutName }
     *     
     */
    public void setCutName(CutName value) {
        this.cutName = value;
    }

    /**
     * Gets the value of the latestValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLatestValueDate() {
        return latestValueDate;
    }

    /**
     * Sets the value of the latestValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestValueDate(LocalDate value) {
        this.latestValueDate = value;
    }

}
