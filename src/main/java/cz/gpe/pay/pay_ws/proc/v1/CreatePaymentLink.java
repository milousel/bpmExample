
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentLinkRequest;
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
 *         &lt;element name="paymentLinkRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentLinkRequest"/&gt;
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
    "paymentLinkRequest"
})
@XmlRootElement(name = "createPaymentLink")
public class CreatePaymentLink {

    @XmlElement(required = true)
    protected PaymentLinkRequest paymentLinkRequest;

    /**
     * Gets the value of the paymentLinkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentLinkRequest }
     *     
     */
    public PaymentLinkRequest getPaymentLinkRequest() {
        return paymentLinkRequest;
    }

    /**
     * Sets the value of the paymentLinkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLinkRequest }
     *     
     */
    public void setPaymentLinkRequest(PaymentLinkRequest value) {
        this.paymentLinkRequest = value;
    }

}
