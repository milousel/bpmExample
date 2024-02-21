
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentCloseRequest;
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
 *         &lt;element name="paymentCloseRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentCloseRequest"/&gt;
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
    "paymentCloseRequest"
})
@XmlRootElement(name = "processPaymentClose")
public class ProcessPaymentClose {

    @XmlElement(required = true)
    protected PaymentCloseRequest paymentCloseRequest;

    /**
     * Gets the value of the paymentCloseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCloseRequest }
     *     
     */
    public PaymentCloseRequest getPaymentCloseRequest() {
        return paymentCloseRequest;
    }

    /**
     * Sets the value of the paymentCloseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCloseRequest }
     *     
     */
    public void setPaymentCloseRequest(PaymentCloseRequest value) {
        this.paymentCloseRequest = value;
    }

}
