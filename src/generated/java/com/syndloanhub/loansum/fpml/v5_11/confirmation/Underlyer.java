//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the whole set of possible underlyers: single underlyers or multiple underlyers, each of these having either security or index components.
 * 
 * <p>Java class for Underlyer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Underlyer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="singleUnderlyer" type="{http://www.fpml.org/FpML-5/confirmation}SingleUnderlyer"/&gt;
 *         &lt;element name="basket" type="{http://www.fpml.org/FpML-5/confirmation}Basket"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Underlyer", propOrder = {
    "singleUnderlyer",
    "basket"
})
public class Underlyer
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected SingleUnderlyer singleUnderlyer;
    protected Basket basket;

    /**
     * Gets the value of the singleUnderlyer property.
     * 
     * @return
     *     possible object is
     *     {@link SingleUnderlyer }
     *     
     */
    public SingleUnderlyer getSingleUnderlyer() {
        return singleUnderlyer;
    }

    /**
     * Sets the value of the singleUnderlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleUnderlyer }
     *     
     */
    public void setSingleUnderlyer(SingleUnderlyer value) {
        this.singleUnderlyer = value;
    }

    /**
     * Gets the value of the basket property.
     * 
     * @return
     *     possible object is
     *     {@link Basket }
     *     
     */
    public Basket getBasket() {
        return basket;
    }

    /**
     * Sets the value of the basket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Basket }
     *     
     */
    public void setBasket(Basket value) {
        this.basket = value;
    }

}
