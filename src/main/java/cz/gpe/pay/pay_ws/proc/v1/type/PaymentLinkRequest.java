
package cz.gpe.pay.pay_ws.proc.v1.type;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentLinkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentLinkRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;group ref="{http://gpe.cz/pay/pay-ws/proc/v1/type}paymentKey"/&gt;
 *         &lt;element name="amount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount"/&gt;
 *         &lt;element name="currencyCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CurrencyCode"/&gt;
 *         &lt;element name="captureFlag" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureFlag"/&gt;
 *         &lt;element name="orderNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}OrderNumber" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Url" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Description" minOccurs="0"/&gt;
 *         &lt;element name="merchantData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MerchantData" minOccurs="0"/&gt;
 *         &lt;element name="fastPayId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentNumber" minOccurs="0"/&gt;
 *         &lt;element name="defaultPayMethod" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayMethod" minOccurs="0"/&gt;
 *         &lt;element name="disabledPayMethods" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayMethod" minOccurs="0"/&gt;
 *         &lt;element name="payMethods" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
 *         &lt;element name="merchantEmail" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
 *         &lt;element name="paymentExpiry" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="language" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Language" minOccurs="0"/&gt;
 *         &lt;element name="registerRecurring" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="registerToken" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="cardHolderData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CardHolderData" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentLinkRequest", propOrder = {
    "messageId",
    "provider",
    "merchantNumber",
    "paymentNumber",
    "amount",
    "currencyCode",
    "captureFlag",
    "orderNumber",
    "referenceNumber",
    "url",
    "description",
    "merchantData",
    "fastPayId",
    "defaultPayMethod",
    "disabledPayMethods",
    "payMethods",
    "email",
    "merchantEmail",
    "paymentExpiry",
    "language",
    "registerRecurring",
    "registerToken",
    "cardHolderData",
    "signature"
})
public class PaymentLinkRequest {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String provider;
    @XmlElement(required = true)
    protected String merchantNumber;
    @XmlElement(required = true)
    protected String paymentNumber;
    protected long amount;
    @XmlElement(required = true)
    protected String currencyCode;
    protected int captureFlag;
    protected String orderNumber;
    protected String referenceNumber;
    protected String url;
    protected String description;
    protected String merchantData;
    protected String fastPayId;
    protected String defaultPayMethod;
    protected String disabledPayMethods;
    protected String payMethods;
    protected String email;
    protected String merchantEmail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentExpiry;
    protected String language;
    @XmlSchemaType(name = "string")
    protected BooleanType registerRecurring;
    @XmlSchemaType(name = "string")
    protected BooleanType registerToken;
    protected CardHolderData cardHolderData;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantData(String value) {
        this.merchantData = value;
    }

    /**
     * Gets the value of the fastPayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastPayId() {
        return fastPayId;
    }

    /**
     * Sets the value of the fastPayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastPayId(String value) {
        this.fastPayId = value;
    }

    /**
     * Gets the value of the defaultPayMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPayMethod() {
        return defaultPayMethod;
    }

    /**
     * Sets the value of the defaultPayMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPayMethod(String value) {
        this.defaultPayMethod = value;
    }

    /**
     * Gets the value of the disabledPayMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabledPayMethods() {
        return disabledPayMethods;
    }

    /**
     * Sets the value of the disabledPayMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabledPayMethods(String value) {
        this.disabledPayMethods = value;
    }

    /**
     * Gets the value of the payMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMethods() {
        return payMethods;
    }

    /**
     * Sets the value of the payMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMethods(String value) {
        this.payMethods = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the merchantEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantEmail() {
        return merchantEmail;
    }

    /**
     * Sets the value of the merchantEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantEmail(String value) {
        this.merchantEmail = value;
    }

    /**
     * Gets the value of the paymentExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentExpiry() {
        return paymentExpiry;
    }

    /**
     * Sets the value of the paymentExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentExpiry(XMLGregorianCalendar value) {
        this.paymentExpiry = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the registerRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getRegisterRecurring() {
        return registerRecurring;
    }

    /**
     * Sets the value of the registerRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setRegisterRecurring(BooleanType value) {
        this.registerRecurring = value;
    }

    /**
     * Gets the value of the registerToken property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getRegisterToken() {
        return registerToken;
    }

    /**
     * Sets the value of the registerToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setRegisterToken(BooleanType value) {
        this.registerToken = value;
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
