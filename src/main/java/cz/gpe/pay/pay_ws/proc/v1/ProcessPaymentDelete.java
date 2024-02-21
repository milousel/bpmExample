
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentDeleteRequest;
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
 *         &lt;element name="paymentDeleteRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentDeleteRequest"/&gt;
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
    "paymentDeleteRequest"
})
@XmlRootElement(name = "processPaymentDelete")
public class ProcessPaymentDelete {

    @XmlElement(required = true)
    protected PaymentDeleteRequest paymentDeleteRequest;

    /**
     * Gets the value of the paymentDeleteRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDeleteRequest }
     *     
     */
    public PaymentDeleteRequest getPaymentDeleteRequest() {
        return paymentDeleteRequest;
    }

    /**
     * Sets the value of the paymentDeleteRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDeleteRequest }
     *     
     */
    public void setPaymentDeleteRequest(PaymentDeleteRequest value) {
        this.paymentDeleteRequest = value;
    }

}
