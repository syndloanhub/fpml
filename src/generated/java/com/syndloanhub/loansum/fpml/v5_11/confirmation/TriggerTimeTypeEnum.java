//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerTimeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerTimeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Closing"/&gt;
 *     &lt;enumeration value="Anytime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggerTimeTypeEnum")
@XmlEnum
public enum TriggerTimeTypeEnum {


    /**
     * The close of trading on a day would be considered for valuation.
     * 
     */
    @XmlEnumValue("Closing")
    CLOSING("Closing"),

    /**
     * At any time during the Knock Determination period (continuous barrier).
     * 
     */
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime");
    private final String value;

    TriggerTimeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerTimeTypeEnum fromValue(String v) {
        for (TriggerTimeTypeEnum c: TriggerTimeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
