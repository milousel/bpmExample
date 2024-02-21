
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenPaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;group ref="{http://gpe.cz/pay/pay-ws/proc/v1/type}paymentKey"/&gt;
 *         &lt;element name="orderNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}OrderNumber" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount"/&gt;
 *         &lt;element name="currencyCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CurrencyCode"/&gt;
 *         &lt;element name="captureFlag" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureFlag"/&gt;
 *         &lt;element name="subMerchantData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}SubMerchantData" minOccurs="0"/&gt;
 *         &lt;element name="tokenData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenData"/&gt;
 *         &lt;element name="cardHolderData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CardHolderData" minOccurs="0"/&gt;
 *         &lt;element name="altTerminalData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AltTerminalData" minOccurs="0"/&gt;
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
@XmlType(name = "TokenPaymentRequest", propOrder = {
    "messageId",
    "provider",
    "merchantNumber",
    "paymentNumber",
    "orderNumber",
    "referenceNumber",
    "amount",
    "currencyCode",
    "captureFlag",
    "subMerchantData",
    "tokenData",
    "cardHolderData",
    "altTerminalData",
    "signature"
})
public class TokenPaymentRequest {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String provider;
    @XmlElement(required = true)
    protected String merchantNumber;
    @XmlElement(required = true)
    protected String paymentNumber;
    protected String orderNumber;
    protected String referenceNumber;
    protected long amount;
    @XmlElement(required = true)
    protected String currencyCode;
    protected int captureFlag;
    protected SubMerchantData subMerchantData;
    @XmlElement(required = true)
    protected String tokenData;
    protected CardHolderData cardHolderData;
    protected AltTerminalData altTerminalData;
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
     * Gets the value of the paymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Sets the value of the paymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNumber(String value) {
        this.paymentNumber = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the captureFlag property.
     * 
     */
    public int getCaptureFlag() {
        return captureFlag;
    }

    /**
     * Sets the value of the captureFlag property.
     * 
     */
    public void setCaptureFlag(int value) {
        this.captureFlag = value;
    }

    /**
     * Gets the value of the subMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantData }
     *     
     */
    public SubMerchantData getSubMerchantData() {
        return subMerchantData;
    }

    /**
     * Sets the value of the subMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantData }
     *     
     */
    public void setSubMerchantData(SubMerchantData value) {
        this.subMerchantData = value;
    }

    /**
     * Gets the value of the tokenData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenData() {
        return tokenData;
    }

    /**
     * Sets the value of the tokenData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenData(String value) {
        this.tokenData = value;
    }

    /**
     * Gets the value of the cardHolderData property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderData }
     *     
     */
    public CardHolderData getCardHolderData() {
        return cardHolderData;
    }

    /**
     * Sets the value of the cardHolderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderData }
     *     
     */
    public void setCardHolderData(CardHolderData value) {
        this.cardHolderData = value;
    }

    /**
     * Gets the value of the altTerminalData property.
     * 
     * @return
     *     possible object is
     *     {@link AltTerminalData }
     *     
     */
    public AltTerminalData getAltTerminalData() {
        return altTerminalData;
    }

    /**
     * Sets the value of the altTerminalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltTerminalData }
     *     
     */
    public void setAltTerminalData(AltTerminalData value) {
        this.altTerminalData = value;
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
