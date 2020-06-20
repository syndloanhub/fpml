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
 * <p>Java class for FeeElectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeElectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FlatFee"/&gt;
 *     &lt;enumeration value="AmortizedFee"/&gt;
 *     &lt;enumeration value="FundingFee"/&gt;
 *     &lt;enumeration value="FlatFeeAndFundingFee"/&gt;
 *     &lt;enumeration value="AmortizedFeeAndFundingFee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeElectionEnum")
@XmlEnum
public enum FeeElectionEnum {


    /**
     * The product of (i) the Break Fee Rate multiplied by (ii) the Equity Notional Amount corresponding to the Early Termination Portion.
     * 
     */
    @XmlEnumValue("FlatFee")
    FLAT_FEE("FlatFee"),

    /**
     * The product of (i) the Break Fee Rate multiplied by (ii) the Equity Notional Amount corresponding to the Early Termination Portion multiplied by (iii) the number of days from the Early Termination Date to the later of the Termination Date or the Cash Settlement Payment Date corresponding to the latest Valuation Date.
     * 
     */
    @XmlEnumValue("AmortizedFee")
    AMORTIZED_FEE("AmortizedFee"),

    /**
     * The product of (i) the Equity Notional Amount corresponding to the Early Termination Portion multiplied by (ii) the Break Funding Rate multiplied by (iii) the number of days from the Early Termination Date to the next scheduled Reset Date divided by (iv) a number equivalent to the denominator of the Day Count Fraction applicable to the Floating Rate Option.
     * 
     */
    @XmlEnumValue("FundingFee")
    FUNDING_FEE("FundingFee"),

    /**
     * Both Flat Fee and Funding Fee are applicable.
     * 
     */
    @XmlEnumValue("FlatFeeAndFundingFee")
    FLAT_FEE_AND_FUNDING_FEE("FlatFeeAndFundingFee"),

    /**
     * Amortized Fee and Funding Fee are applicable.
     * 
     */
    @XmlEnumValue("AmortizedFeeAndFundingFee")
    AMORTIZED_FEE_AND_FUNDING_FEE("AmortizedFeeAndFundingFee");
    private final String value;

    FeeElectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeElectionEnum fromValue(String v) {
        for (FeeElectionEnum c: FeeElectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
