
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;element name="primaryReturnCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReturnCode"/&gt;
 *         &lt;element name="secondaryReturnCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReturnCode"/&gt;
 *         &lt;element name="buyerAccountIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FaultDetail", propOrder = {
    "messageId",
    "primaryReturnCode",
    "secondaryReturnCode",
    "buyerAccountIban",
    "signature"
})
@XmlSeeAlso({
    PaymentFaultDetail.class,
    CardOnFilePaymentFaultDetail.class
})
public class FaultDetail {

    @XmlElement(required = true)
    protected String messageId;
    protected int primaryReturnCode;
    protected int secondaryReturnCode;
    protected String buyerAccountIban;
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
     * Gets the value of the primaryReturnCode property.
     * 
     */
    public int getPrimaryReturnCode() {
        return primaryReturnCode;
    }

    /**
     * Sets the value of the primaryReturnCode property.
     * 
     */
    public void setPrimaryReturnCode(int value) {
        this.primaryReturnCode = value;
    }

    /**
     * Gets the value of the secondaryReturnCode property.
     * 
     */
    public int getSecondaryReturnCode() {
        return secondaryReturnCode;
    }

    /**
     * Sets the value of the secondaryReturnCode property.
     * 
     */
    public void setSecondaryReturnCode(int value) {
        this.secondaryReturnCode = value;
    }

    /**
     * Gets the value of the buyerAccountIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerAccountIban() {
        return buyerAccountIban;
    }

    /**
     * Sets the value of the buyerAccountIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerAccountIban(String value) {
        this.buyerAccountIban = value;
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
