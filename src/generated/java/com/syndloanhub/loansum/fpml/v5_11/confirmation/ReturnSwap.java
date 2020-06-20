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
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing return swaps including return swaps (long form), total return swaps, and variance swaps.
 * 
 * <p>Java class for ReturnSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ReturnSwapBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="earlyTermination" type="{http://www.fpml.org/FpML-5/confirmation}ReturnSwapEarlyTermination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extraordinaryEvents" type="{http://www.fpml.org/FpML-5/confirmation}ExtraordinaryEvents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwap", propOrder = {
    "earlyTermination",
    "extraordinaryEvents"
})
public class ReturnSwap
    extends ReturnSwapBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected List<ReturnSwapEarlyTermination> earlyTermination;
    protected ExtraordinaryEvents extraordinaryEvents;

    /**
     * Gets the value of the earlyTermination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyTermination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyTermination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnSwapEarlyTermination }
     * 
     * 
     */
    public List<ReturnSwapEarlyTermination> getEarlyTermination() {
        if (earlyTermination == null) {
            earlyTermination = new ArrayList<ReturnSwapEarlyTermination>();
        }
        return this.earlyTermination;
    }

    /**
     * Gets the value of the extraordinaryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraordinaryEvents }
     *     
     */
    public ExtraordinaryEvents getExtraordinaryEvents() {
        return extraordinaryEvents;
    }

    /**
     * Sets the value of the extraordinaryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraordinaryEvents }
     *     
     */
    public void setExtraordinaryEvents(ExtraordinaryEvents value) {
        this.extraordinaryEvents = value;
    }

}