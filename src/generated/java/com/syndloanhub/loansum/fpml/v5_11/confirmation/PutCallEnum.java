//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutCallEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PutCallEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Put"/&gt;
 *     &lt;enumeration value="Call"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PutCallEnum")
@XmlEnum
public enum PutCallEnum {


    /**
     * A put option gives the holder the right to sell the underlying asset by a certain date for a certain price.
     * 
     */
    @XmlEnumValue("Put")
    PUT("Put"),

    /**
     * A call option gives the holder the right to buy the underlying asset by a certain date for a certain price.
     * 
     */
    @XmlEnumValue("Call")
    CALL("Call");
    private final String value;

    PutCallEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PutCallEnum fromValue(String v) {
        for (PutCallEnum c: PutCallEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
