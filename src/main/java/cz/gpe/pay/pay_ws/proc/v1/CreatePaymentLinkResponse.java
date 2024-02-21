
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentLinkResponse;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentLinkResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentLinkResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentLinkResponse"
})
@XmlRootElement(name = "createPaymentLinkResponse")
public class CreatePaymentLinkResponse {

    @XmlElement(required = true)
    protected PaymentLinkResponse paymentLinkResponse;

    /**
     * Gets the value of the paymentLinkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentLinkResponse }
     *     
     */
    public PaymentLinkResponse getPaymentLinkResponse() {
        return paymentLinkResponse;
    }

    /**
     * Sets the value of the paymentLinkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLinkResponse }
     *     
     */
    public void setPaymentLinkResponse(PaymentLinkResponse value) {
        this.paymentLinkResponse = value;
    }

}
