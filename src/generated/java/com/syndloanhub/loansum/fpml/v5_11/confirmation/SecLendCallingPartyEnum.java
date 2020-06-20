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
 * <p>Java class for SecLendCallingPartyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecLendCallingPartyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Borrower"/&gt;
 *     &lt;enumeration value="Lender"/&gt;
 *     &lt;enumeration value="Either"/&gt;
 *     &lt;enumeration value="AsDefinedInMasterAgreement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecLendCallingPartyEnum")
@XmlEnum
public enum SecLendCallingPartyEnum {


    /**
     * Initial borrower to the SBL transaction.
     * 
     */
    @XmlEnumValue("Borrower")
    BORROWER("Borrower"),

    /**
     * Initial lender to SBL transaction.
     * 
     */
    @XmlEnumValue("Lender")
    LENDER("Lender"),

    /**
     * Either Lender or Borrower to the SBL transaction.
     * 
     */
    @XmlEnumValue("Either")
    EITHER("Either"),

    /**
     * As defined in Master Agreement.
     * 
     */
    @XmlEnumValue("AsDefinedInMasterAgreement")
    AS_DEFINED_IN_MASTER_AGREEMENT("AsDefinedInMasterAgreement");
    private final String value;

    SecLendCallingPartyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecLendCallingPartyEnum fromValue(String v) {
        for (SecLendCallingPartyEnum c: SecLendCallingPartyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}