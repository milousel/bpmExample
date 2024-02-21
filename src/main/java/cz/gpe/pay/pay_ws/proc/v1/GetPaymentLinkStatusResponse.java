
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentLinkStatusResponse;
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
 *         &lt;element name="paymentLinkStatusResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentLinkStatusResponse"/&gt;
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
    "paymentLinkStatusResponse"
})
@XmlRootElement(name = "getPaymentLinkStatusResponse")
public class GetPaymentLinkStatusResponse {

    @XmlElement(required = true)
    protected PaymentLinkStatusResponse paymentLinkStatusResponse;

    /**
     * Gets the value of the paymentLinkStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentLinkStatusResponse }
     *     
     */
    public PaymentLinkStatusResponse getPaymentLinkStatusResponse() {
        return paymentLinkStatusResponse;
    }

    /**
     * Sets the value of the paymentLinkStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLinkStatusResponse }
     *     
     */
    public void setPaymentLinkStatusResponse(PaymentLinkStatusResponse value) {
        this.paymentLinkStatusResponse = value;
    }

}
