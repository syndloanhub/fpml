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
 * <p>Java class for LoanTransferFeePaidByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanTransferFeePaidByEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BuyerSplitOneHalf"/&gt;
 *     &lt;enumeration value="OneFeePaidByBuyer"/&gt;
 *     &lt;enumeration value="OneFeePaidBySeller"/&gt;
 *     &lt;enumeration value="PaidByBuyer"/&gt;
 *     &lt;enumeration value="PaidBySeller"/&gt;
 *     &lt;enumeration value="SellerSplitOneHalf"/&gt;
 *     &lt;enumeration value="SplitFull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanTransferFeePaidByEnum")
@XmlEnum
public enum LoanTransferFeePaidByEnum {


    /**
     * Buyer is responsible for one half of one allocation's assignment fee (regardless of the number of allocations).
     * 
     */
    @XmlEnumValue("BuyerSplitOneHalf")
    BUYER_SPLIT_ONE_HALF("BuyerSplitOneHalf"),

    /**
     * Buyer is responsible for one allocation's assignment fee (regardless of the number of allocations).
     * 
     */
    @XmlEnumValue("OneFeePaidByBuyer")
    ONE_FEE_PAID_BY_BUYER("OneFeePaidByBuyer"),

    /**
     * Seller is responsible for one allocation's assignment fee (regardless of the number of allocations).
     * 
     */
    @XmlEnumValue("OneFeePaidBySeller")
    ONE_FEE_PAID_BY_SELLER("OneFeePaidBySeller"),

    /**
     * Fee is paid by buyer.
     * 
     */
    @XmlEnumValue("PaidByBuyer")
    PAID_BY_BUYER("PaidByBuyer"),

    /**
     * Fee is paid by seller.
     * 
     */
    @XmlEnumValue("PaidBySeller")
    PAID_BY_SELLER("PaidBySeller"),

    /**
     * Seller is responsible for one half of one allocation's assignment fee (regardless of the number of allocations).
     * 
     */
    @XmlEnumValue("SellerSplitOneHalf")
    SELLER_SPLIT_ONE_HALF("SellerSplitOneHalf"),

    /**
     * Ticket owner is responsible for one allocation's assignment fee (regardless of the number of allocations).
     * 
     */
    @XmlEnumValue("SplitFull")
    SPLIT_FULL("SplitFull");
    private final String value;

    LoanTransferFeePaidByEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanTransferFeePaidByEnum fromValue(String v) {
        for (LoanTransferFeePaidByEnum c: LoanTransferFeePaidByEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
