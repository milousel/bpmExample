
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.RegularSubscriptionPaymentResponse;
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
 *         &lt;element name="regularSubscriptionPaymentResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RegularSubscriptionPaymentResponse"/&gt;
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
    "regularSubscriptionPaymentResponse"
})
@XmlRootElement(name = "processRegularSubscriptionPaymentResponse")
public class ProcessRegularSubscriptionPaymentResponse {

    @XmlElement(required = true)
    protected RegularSubscriptionPaymentResponse regularSubscriptionPaymentResponse;

    /**
     * Gets the value of the regularSubscriptionPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RegularSubscriptionPaymentResponse }
     *     
     */
    public RegularSubscriptionPaymentResponse getRegularSubscriptionPaymentResponse() {
        return regularSubscriptionPaymentResponse;
    }

    /**
     * Sets the value of the regularSubscriptionPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularSubscriptionPaymentResponse }
     *     
     */
    public void setRegularSubscriptionPaymentResponse(RegularSubscriptionPaymentResponse value) {
        this.regularSubscriptionPaymentResponse = value;
    }

}
