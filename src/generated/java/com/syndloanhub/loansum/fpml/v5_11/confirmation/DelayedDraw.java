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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A facility which can be drawn at any point during a pre-defined period after the initial deal closing date,
 * 
 * <p>Java class for DelayedDraw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayedDraw"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractFacility"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delayedDraw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mustDrawByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayedDraw", propOrder = {
    "delayedDraw",
    "mustDrawByDate"
})
public class DelayedDraw
    extends AbstractFacility
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected boolean delayedDraw;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate mustDrawByDate;

    /**
     * Gets the value of the delayedDraw property.
     * 
     */
    public boolean isDelayedDraw() {
        return delayedDraw;
    }

    /**
     * Sets the value of the delayedDraw property.
     * 
     */
    public void setDelayedDraw(boolean value) {
        this.delayedDraw = value;
    }

    /**
     * Gets the value of the mustDrawByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMustDrawByDate() {
        return mustDrawByDate;
    }

    /**
     * Sets the value of the mustDrawByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMustDrawByDate(LocalDate value) {
        this.mustDrawByDate = value;
    }

}
