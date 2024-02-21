
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentLinkStatusRequest;
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
 *         &lt;element name="paymentLinkStatusRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentLinkStatusRequest"/&gt;
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
    "paymentLinkStatusRequest"
})
@XmlRootElement(name = "getPaymentLinkStatus")
public class GetPaymentLinkStatus {

    @XmlElement(required = true)
    protected PaymentLinkStatusRequest paymentLinkStatusRequest;

    /**
     * Gets the value of the paymentLinkStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentLinkStatusRequest }
     *     
     */
    public PaymentLinkStatusRequest getPaymentLinkStatusRequest() {
        return paymentLinkStatusRequest;
    }

    /**
     * Sets the value of the paymentLinkStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLinkStatusRequest }
     *     
     */
    public void setPaymentLinkStatusRequest(PaymentLinkStatusRequest value) {
        this.paymentLinkStatusRequest = value;
    }

}
