
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.RegularSubscriptionPaymentRequest;
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
 *         &lt;element name="regularSubscriptionPaymentRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RegularSubscriptionPaymentRequest"/&gt;
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
    "regularSubscriptionPaymentRequest"
})
@XmlRootElement(name = "processRegularSubscriptionPayment")
public class ProcessRegularSubscriptionPayment {

    @XmlElement(required = true)
    protected RegularSubscriptionPaymentRequest regularSubscriptionPaymentRequest;

    /**
     * Gets the value of the regularSubscriptionPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RegularSubscriptionPaymentRequest }
     *     
     */
    public RegularSubscriptionPaymentRequest getRegularSubscriptionPaymentRequest() {
        return regularSubscriptionPaymentRequest;
    }

    /**
     * Sets the value of the regularSubscriptionPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularSubscriptionPaymentRequest }
     *     
     */
    public void setRegularSubscriptionPaymentRequest(RegularSubscriptionPaymentRequest value) {
        this.regularSubscriptionPaymentRequest = value;
    }

}
