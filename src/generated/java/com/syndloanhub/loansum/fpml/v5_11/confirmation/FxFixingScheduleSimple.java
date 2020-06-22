//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the FX fixing schedule, a single continuous observation period which follows the applicable business day schedule for the quoted rate source.
 * 
 * <p>Java class for FxFixingScheduleSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFixingScheduleSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;sequence&gt;
 *               &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *               &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *             &lt;/sequence&gt;
 *             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="dayType" type="{http://www.fpml.org/FpML-5/confirmation}DayTypeEnum" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BusinessCentersOrReference.model" minOccurs="0"/&gt;
 *         &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFixingScheduleSimple", propOrder = {
    "content"
})
public class FxFixingScheduleSimple
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "startDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "endDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dayType", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "businessCentersReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "businessCenters", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixingDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "EndDate" is used by two different parts of a schema. See: 
     * line 563 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-fx-5-11.xsd
     * line 557 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-fx-5-11.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * {@link JAXBElement }{@code <}{@link DayTypeEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link BusinessCentersReference }{@code >}
     * {@link JAXBElement }{@code <}{@link BusinessCenters }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
