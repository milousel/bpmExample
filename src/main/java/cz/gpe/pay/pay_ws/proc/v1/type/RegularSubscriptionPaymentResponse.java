
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegularSubscriptionPaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularSubscriptionPaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;element name="authCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthCode"/&gt;
 *         &lt;element name="traceId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TraceId" minOccurs="0"/&gt;
 *         &lt;element name="authResponseCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthResponseCode" minOccurs="0"/&gt;
 *         &lt;element name="authRRN" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthRRN" minOccurs="0"/&gt;
 *         &lt;element name="paymentAccountReference" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentAccountReference" minOccurs="0"/&gt;
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
@XmlType(name = "RegularSubscriptionPaymentResponse", propOrder = {
    "messageId",
    "authCode",
    "traceId",
    "authResponseCode",
    "authRRN",
    "paymentAccountReference",
    "signature"
})
public class RegularSubscriptionPaymentResponse {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String authCode;
    protected String traceId;
    protected String authResponseCode;
    protected String authRRN;
    protected String paymentAccountReference;
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
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the authResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthResponseCode() {
        return authResponseCode;
    }

    /**
     * Sets the value of the authResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthResponseCode(String value) {
        this.authResponseCode = value;
    }

    /**
     * Gets the value of the authRRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRRN() {
        return authRRN;
    }

    /**
     * Sets the value of the authRRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRRN(String value) {
        this.authRRN = value;
    }

    /**
     * Gets the value of the paymentAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Sets the value of the paymentAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
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
