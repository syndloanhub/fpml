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
 * The observation source can be composed of an curve and/or and information source.
 * 
 * <p>Java class for ObservationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/confirmation}InformationSource"/&gt;
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/confirmation}TradeUnderlyer2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationSource", propOrder = {
    "informationSource",
    "underlyer"
})
public class ObservationSource
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected InformationSource informationSource;
    protected TradeUnderlyer2 underlyer;

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setInformationSource(InformationSource value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link TradeUnderlyer2 }
     *     
     */
    public TradeUnderlyer2 getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeUnderlyer2 }
     *     
     */
    public void setUnderlyer(TradeUnderlyer2 value) {
        this.underlyer = value;
    }

}
