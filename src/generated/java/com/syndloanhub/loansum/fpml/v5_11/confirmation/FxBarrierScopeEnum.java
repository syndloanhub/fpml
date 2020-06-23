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
 * <p>Java class for FxBarrierScopeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierScopeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Global"/&gt;
 *     &lt;enumeration value="PerExpiry"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierScopeEnum")
@XmlEnum
public enum FxBarrierScopeEnum {


    /**
     * The barrier has effect for the expiry period in which it is triggered, and all subsequent periods.
     * 
     */
    @XmlEnumValue("Global")
    GLOBAL("Global"),

    /**
     * The barrier has effect only for the expiry period in which it is triggered.
     * 
     */
    @XmlEnumValue("PerExpiry")
    PER_EXPIRY("PerExpiry");
    private final String value;

    FxBarrierScopeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierScopeEnum fromValue(String v) {
        for (FxBarrierScopeEnum c: FxBarrierScopeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
