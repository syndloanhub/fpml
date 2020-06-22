//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A single facility definition stated as of a certain date.
 * 
 * <p>Java class for FacilityStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractLoanStatement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}facilityGroup"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}DealDetails.model" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/confirmation}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityStatement", propOrder = {
    "facilityGroup",
    "dealIdentifier",
    "dealSummary",
    "party"
})
public class FacilityStatement
    extends AbstractLoanStatement
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRef(name = "facilityGroup", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractFacility> facilityGroup;
    protected DealIdentifier dealIdentifier;
    protected DealSummary dealSummary;
    protected List<Party> party;

    /**
     * Gets the value of the facilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LetterOfCreditFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link Revolver }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermLoan }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelayedDraw }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFacility }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFacility> getFacilityGroup() {
        return facilityGroup;
    }

    /**
     * Sets the value of the facilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LetterOfCreditFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link Revolver }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermLoan }{@code >}
     *     {@link JAXBElement }{@code <}{@link DelayedDraw }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFacility }{@code >}
     *     
     */
    public void setFacilityGroup(JAXBElement<? extends AbstractFacility> value) {
        this.facilityGroup = value;
    }

    /**
     * Gets the value of the dealIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DealIdentifier }
     *     
     */
    public DealIdentifier getDealIdentifier() {
        return dealIdentifier;
    }

    /**
     * Sets the value of the dealIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealIdentifier }
     *     
     */
    public void setDealIdentifier(DealIdentifier value) {
        this.dealIdentifier = value;
    }

    /**
     * Gets the value of the dealSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DealSummary }
     *     
     */
    public DealSummary getDealSummary() {
        return dealSummary;
    }

    /**
     * Sets the value of the dealSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealSummary }
     *     
     */
    public void setDealSummary(DealSummary value) {
        this.dealSummary = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
