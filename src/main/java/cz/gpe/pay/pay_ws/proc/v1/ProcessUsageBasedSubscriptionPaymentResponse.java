
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.UsageBasedSubscriptionPaymentResponse;
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
 *         &lt;element name="usageBasedSubscriptionPaymentResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UsageBasedSubscriptionPaymentResponse"/&gt;
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
    "usageBasedSubscriptionPaymentResponse"
})
@XmlRootElement(name = "processUsageBasedSubscriptionPaymentResponse")
public class ProcessUsageBasedSubscriptionPaymentResponse {

    @XmlElement(required = true)
    protected UsageBasedSubscriptionPaymentResponse usageBasedSubscriptionPaymentResponse;

    /**
     * Gets the value of the usageBasedSubscriptionPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UsageBasedSubscriptionPaymentResponse }
     *     
     */
    public UsageBasedSubscriptionPaymentResponse getUsageBasedSubscriptionPaymentResponse() {
        return usageBasedSubscriptionPaymentResponse;
    }

    /**
     * Sets the value of the usageBasedSubscriptionPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageBasedSubscriptionPaymentResponse }
     *     
     */
    public void setUsageBasedSubscriptionPaymentResponse(UsageBasedSubscriptionPaymentResponse value) {
        this.usageBasedSubscriptionPaymentResponse = value;
    }

}
