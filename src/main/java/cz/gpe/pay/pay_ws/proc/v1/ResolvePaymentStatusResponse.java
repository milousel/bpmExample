
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentStatusResponse;
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
 *         &lt;element name="paymentStatusResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentStatusResponse"/&gt;
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
    "paymentStatusResponse"
})
@XmlRootElement(name = "resolvePaymentStatusResponse")
public class ResolvePaymentStatusResponse {

    @XmlElement(required = true)
    protected PaymentStatusResponse paymentStatusResponse;

    /**
     * Gets the value of the paymentStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusResponse }
     *     
     */
    public PaymentStatusResponse getPaymentStatusResponse() {
        return paymentStatusResponse;
    }

    /**
     * Sets the value of the paymentStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusResponse }
     *     
     */
    public void setPaymentStatusResponse(PaymentStatusResponse value) {
        this.paymentStatusResponse = value;
    }

}
