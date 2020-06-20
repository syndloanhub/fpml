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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing an option expiring (i.e. passing its last exercise time and becoming worthless.)
 * 
 * <p>Java class for OptionExpiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExpiry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/confirmation}Trade"/&gt;
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifier" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/confirmation}ExerciseProcedureOption" minOccurs="0"/&gt;
 *         &lt;element name="actionOnExpiration" type="{http://www.fpml.org/FpML-5/confirmation}ActionOnExpiration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExpiry", propOrder = {
    "originalTrade",
    "tradeIdentifier",
    "date",
    "time",
    "exerciseProcedure",
    "actionOnExpiration"
})
public class OptionExpiry
    extends AbstractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected Trade originalTrade;
    protected List<PartyTradeIdentifier> tradeIdentifier;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    protected ExerciseProcedureOption exerciseProcedure;
    protected ActionOnExpiration actionOnExpiration;

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the exerciseProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseProcedureOption }
     *     
     */
    public ExerciseProcedureOption getExerciseProcedure() {
        return exerciseProcedure;
    }

    /**
     * Sets the value of the exerciseProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseProcedureOption }
     *     
     */
    public void setExerciseProcedure(ExerciseProcedureOption value) {
        this.exerciseProcedure = value;
    }

    /**
     * Gets the value of the actionOnExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link ActionOnExpiration }
     *     
     */
    public ActionOnExpiration getActionOnExpiration() {
        return actionOnExpiration;
    }

    /**
     * Sets the value of the actionOnExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionOnExpiration }
     *     
     */
    public void setActionOnExpiration(ActionOnExpiration value) {
        this.actionOnExpiration = value;
    }

}
