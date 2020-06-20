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
 * <p>Java class for ConditionsPrecedentMetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionsPrecedentMetEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="Waived"/&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionsPrecedentMetEnum")
@XmlEnum
public enum ConditionsPrecedentMetEnum {


    /**
     * Conditions precedent have not been met.
     * 
     */
    @XmlEnumValue("No")
    NO("No"),

    /**
     * The requirement for conditions precedent were waived.
     * 
     */
    @XmlEnumValue("Waived")
    WAIVED("Waived"),

    /**
     * Conditions precedent have been met.
     * 
     */
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    ConditionsPrecedentMetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionsPrecedentMetEnum fromValue(String v) {
        for (ConditionsPrecedentMetEnum c: ConditionsPrecedentMetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}