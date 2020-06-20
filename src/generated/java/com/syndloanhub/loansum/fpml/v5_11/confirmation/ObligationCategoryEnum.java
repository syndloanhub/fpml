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
 * <p>Java class for ObligationCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObligationCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="BorrowedMoney"/&gt;
 *     &lt;enumeration value="ReferenceObligationsOnly"/&gt;
 *     &lt;enumeration value="Bond"/&gt;
 *     &lt;enumeration value="Loan"/&gt;
 *     &lt;enumeration value="BondOrLoan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObligationCategoryEnum")
@XmlEnum
public enum ObligationCategoryEnum {


    /**
     * ISDA term "Payment".
     * 
     */
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),

    /**
     * ISDA term "Borrowed Money".
     * 
     */
    @XmlEnumValue("BorrowedMoney")
    BORROWED_MONEY("BorrowedMoney"),

    /**
     * ISDA term "Reference Obligations Only".
     * 
     */
    @XmlEnumValue("ReferenceObligationsOnly")
    REFERENCE_OBLIGATIONS_ONLY("ReferenceObligationsOnly"),

    /**
     * ISDA term "Bond".
     * 
     */
    @XmlEnumValue("Bond")
    BOND("Bond"),

    /**
     * ISDA term "Loan".
     * 
     */
    @XmlEnumValue("Loan")
    LOAN("Loan"),

    /**
     * ISDA term "Bond or Loan".
     * 
     */
    @XmlEnumValue("BondOrLoan")
    BOND_OR_LOAN("BondOrLoan");
    private final String value;

    ObligationCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObligationCategoryEnum fromValue(String v) {
        for (ObligationCategoryEnum c: ObligationCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
