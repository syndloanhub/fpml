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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reference a code defining the origin of the trade template terms
 * 
 * <p>Java class for FxTemplateTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTemplateTerms"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/confirmation&gt;Scheme"&gt;
 *       &lt;attribute name="fxTemplateTermsScheme" type="{http://www.fpml.org/FpML-5/confirmation}NonEmptyURI" default="http://www.fpml.org/coding-scheme/fx-template-terms" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTemplateTerms", propOrder = {
    "value"
})
public class FxTemplateTerms
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "fxTemplateTermsScheme")
    protected String fxTemplateTermsScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fxTemplateTermsScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxTemplateTermsScheme() {
        if (fxTemplateTermsScheme == null) {
            return "http://www.fpml.org/coding-scheme/fx-template-terms";
        } else {
            return fxTemplateTermsScheme;
        }
    }

    /**
     * Sets the value of the fxTemplateTermsScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxTemplateTermsScheme(String value) {
        this.fxTemplateTermsScheme = value;
    }

}
