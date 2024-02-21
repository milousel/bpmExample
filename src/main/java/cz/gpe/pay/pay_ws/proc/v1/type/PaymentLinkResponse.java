
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentLinkResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;element name="paymentNumber" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentNumber"/&gt;
 *         &lt;element name="paymentLink" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "PaymentLinkResponse", propOrder = {
    "messageId",
    "paymentNumber",
    "paymentLink",
    "signature"
})
public class PaymentLinkResponse {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String paymentNumber;
    @XmlElement(required = true)
    protected String paymentLink;
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
     * Gets the value of the paymentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentLink() {
        return paymentLink;
    }

    /**
     * Sets the value of the paymentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentLink(String value) {
        this.paymentLink = value;
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
