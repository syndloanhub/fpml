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
 * <p>Java class for EarlyTerminationDateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EarlyTerminationDateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AnyDay"/&gt;
 *     &lt;enumeration value="ValuationDate"/&gt;
 *     &lt;enumeration value="ResetDate"/&gt;
 *     &lt;enumeration value="AfterFirstResetDate"/&gt;
 *     &lt;enumeration value="AsSpecifiedInMCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EarlyTerminationDateEnum")
@XmlEnum
public enum EarlyTerminationDateEnum {

    @XmlEnumValue("AnyDay")
    ANY_DAY("AnyDay"),
    @XmlEnumValue("ValuationDate")
    VALUATION_DATE("ValuationDate"),
    @XmlEnumValue("ResetDate")
    RESET_DATE("ResetDate"),
    @XmlEnumValue("AfterFirstResetDate")
    AFTER_FIRST_RESET_DATE("AfterFirstResetDate"),
    @XmlEnumValue("AsSpecifiedInMCA")
    AS_SPECIFIED_IN_MCA("AsSpecifiedInMCA");
    private final String value;

    EarlyTerminationDateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarlyTerminationDateEnum fromValue(String v) {
        for (EarlyTerminationDateEnum c: EarlyTerminationDateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
