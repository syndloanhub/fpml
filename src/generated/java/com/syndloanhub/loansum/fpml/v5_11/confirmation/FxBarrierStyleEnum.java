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
 * <p>Java class for FxBarrierStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierStyleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="American"/&gt;
 *     &lt;enumeration value="European"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierStyleEnum")
@XmlEnum
public enum FxBarrierStyleEnum {


    /**
     * The barrier is observed continuously through the observation period.
     * 
     */
    @XmlEnumValue("American")
    AMERICAN("American"),

    /**
     * The barrier is observed on a discrete expiry date, or (in the case of a multi-phase product) series of expiry dates.
     * 
     */
    @XmlEnumValue("European")
    EUROPEAN("European");
    private final String value;

    FxBarrierStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierStyleEnum fromValue(String v) {
        for (FxBarrierStyleEnum c: FxBarrierStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
