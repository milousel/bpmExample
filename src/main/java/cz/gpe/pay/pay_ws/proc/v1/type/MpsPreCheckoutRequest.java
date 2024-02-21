
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;group ref="{http://gpe.cz/pay/pay-ws/proc/v1/type}merchantKey"/&gt;
 *         &lt;element name="pairingNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentNumber"/&gt;
 *         &lt;element name="requestCardDetails" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="requestShippingDetails" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="requestRewardPrograms" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpsPreCheckoutRequest", propOrder = {
    "messageId",
    "provider",
    "merchantNumber",
    "pairingNumber",
    "requestCardDetails",
    "requestShippingDetails",
    "requestRewardPrograms",
    "signature"
})
public class MpsPreCheckoutRequest {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String provider;
    @XmlElement(required = true)
    protected String merchantNumber;
    @XmlElement(required = true)
    protected String pairingNumber;
    @XmlSchemaType(name = "string")
    protected BooleanType requestCardDetails;
    @XmlSchemaType(name = "string")
    protected BooleanType requestShippingDetails;
    @XmlSchemaType(name = "string")
    protected BooleanType requestRewardPrograms;
    @XmlElement(required = true)
    protected byte[] signature;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the merchantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantNumber() {
        return merchantNumber;
    }

    /**
     * Sets the value of the merchantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantNumber(String value) {
        this.merchantNumber = value;
    }

    /**
     * Gets the value of the pairingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairingNumber() {
        return pairingNumber;
    }

    /**
     * Sets the value of the pairingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairingNumber(String value) {
        this.pairingNumber = value;
    }

    /**
     * Gets the value of the requestCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getRequestCardDetails() {
        return requestCardDetails;
    }

    /**
     * Sets the value of the requestCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setRequestCardDetails(BooleanType value) {
        this.requestCardDetails = value;
    }

    /**
     * Gets the value of the requestShippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getRequestShippingDetails() {
        return requestShippingDetails;
    }

    /**
     * Sets the value of the requestShippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setRequestShippingDetails(BooleanType value) {
        this.requestShippingDetails = value;
    }

    /**
     * Gets the value of the requestRewardPrograms property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getRequestRewardPrograms() {
        return requestRewardPrograms;
    }

    /**
     * Sets the value of the requestRewardPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setRequestRewardPrograms(BooleanType value) {
        this.requestRewardPrograms = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

}
