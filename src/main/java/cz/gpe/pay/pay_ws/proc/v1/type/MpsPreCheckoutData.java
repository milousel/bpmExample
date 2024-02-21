
package cz.gpe.pay.pay_ws.proc.v1.type;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cards" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsPreCheckoutCard" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contact" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsContact" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddresses" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsPreCheckoutShippingAddress" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rewardPrograms" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsPreCheckoutRewardProgram" maxOccurs="unbounded"/&gt;
 *         &lt;element name="walletName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="simpleValueHolder" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}SimpleValueHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpsPreCheckoutData", propOrder = {
    "cards",
    "contact",
    "shippingAddresses",
    "rewardPrograms",
    "walletName",
    "simpleValueHolder"
})
public class MpsPreCheckoutData {

    @XmlElement(required = true)
    protected List<MpsPreCheckoutCard> cards;
    protected MpsContact contact;
    @XmlElement(required = true)
    protected List<MpsPreCheckoutShippingAddress> shippingAddresses;
    @XmlElement(required = true)
    protected List<MpsPreCheckoutRewardProgram> rewardPrograms;
    @XmlElement(required = true)
    protected String walletName;
    protected List<SimpleValueHolder> simpleValueHolder;

    /**
     * Gets the value of the cards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MpsPreCheckoutCard }
     * 
     * 
     */
    public List<MpsPreCheckoutCard> getCards() {
        if (cards == null) {
            cards = new ArrayList<MpsPreCheckoutCard>();
        }
        return this.cards;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link MpsContact }
     *     
     */
    public MpsContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpsContact }
     *     
     */
    public void setContact(MpsContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the shippingAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shippingAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MpsPreCheckoutShippingAddress }
     * 
     * 
     */
    public List<MpsPreCheckoutShippingAddress> getShippingAddresses() {
        if (shippingAddresses == null) {
            shippingAddresses = new ArrayList<MpsPreCheckoutShippingAddress>();
        }
        return this.shippingAddresses;
    }

    /**
     * Gets the value of the rewardPrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rewardPrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MpsPreCheckoutRewardProgram }
     * 
     * 
     */
    public List<MpsPreCheckoutRewardProgram> getRewardPrograms() {
        if (rewardPrograms == null) {
            rewardPrograms = new ArrayList<MpsPreCheckoutRewardProgram>();
        }
        return this.rewardPrograms;
    }

    /**
     * Gets the value of the walletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletName() {
        return walletName;
    }

    /**
     * Sets the value of the walletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletName(String value) {
        this.walletName = value;
    }

    /**
     * Gets the value of the simpleValueHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the simpleValueHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleValueHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleValueHolder }
     * 
     * 
     */
    public List<SimpleValueHolder> getSimpleValueHolder() {
        if (simpleValueHolder == null) {
            simpleValueHolder = new ArrayList<SimpleValueHolder>();
        }
        return this.simpleValueHolder;
    }

}
