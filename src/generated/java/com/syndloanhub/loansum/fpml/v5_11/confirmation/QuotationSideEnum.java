//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationSideEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationSideEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Bid"/&gt;
 *     &lt;enumeration value="Ask"/&gt;
 *     &lt;enumeration value="Mid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuotationSideEnum")
@XmlEnum
public enum QuotationSideEnum {


    /**
     * A value "bid" by a buyer for an asset, i.e. the value a buyer is willing to pay.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * A value "asked" by a seller for an asset, i.e. the value at which a seller is willing to sell.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * A value midway between the bid and the ask value.
     * 
     */
    @XmlEnumValue("Mid")
    MID("Mid");
    private final String value;

    QuotationSideEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationSideEnum fromValue(String v) {
        for (QuotationSideEnum c: QuotationSideEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
