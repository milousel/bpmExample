
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutShippingAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutShippingAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsAddress"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recipientPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="selectedAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="shippingAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpsPreCheckoutShippingAddress", propOrder = {
    "recipientName",
    "recipientPhoneNumber",
    "addressId",
    "selectedAsDefault",
    "shippingAlias"
})
public class MpsPreCheckoutShippingAddress
    extends MpsAddress
{

    @XmlElement(required = true)
    protected String recipientName;
    @XmlElement(required = true)
    protected String recipientPhoneNumber;
    @XmlElement(required = true)
    protected String addressId;
    protected boolean selectedAsDefault;
    protected String shippingAlias;

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    /**
     * Sets the value of the recipientPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPhoneNumber(String value) {
        this.recipientPhoneNumber = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the selectedAsDefault property.
     * 
     */
    public boolean isSelectedAsDefault() {
        return selectedAsDefault;
    }

    /**
     * Sets the value of the selectedAsDefault property.
     * 
     */
    public void setSelectedAsDefault(boolean value) {
        this.selectedAsDefault = value;
    }

    /**
     * Gets the value of the shippingAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAlias() {
        return shippingAlias;
    }

    /**
     * Sets the value of the shippingAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAlias(String value) {
        this.shippingAlias = value;
    }

}
