
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.UsageBasedSubscriptionPaymentRequest;
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
 *         &lt;element name="usageBasedSubscriptionPaymentRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UsageBasedSubscriptionPaymentRequest"/&gt;
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
    "usageBasedSubscriptionPaymentRequest"
})
@XmlRootElement(name = "processUsageBasedSubscriptionPayment")
public class ProcessUsageBasedSubscriptionPayment {

    @XmlElement(required = true)
    protected UsageBasedSubscriptionPaymentRequest usageBasedSubscriptionPaymentRequest;

    /**
     * Gets the value of the usageBasedSubscriptionPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UsageBasedSubscriptionPaymentRequest }
     *     
     */
    public UsageBasedSubscriptionPaymentRequest getUsageBasedSubscriptionPaymentRequest() {
        return usageBasedSubscriptionPaymentRequest;
    }

    /**
     * Sets the value of the usageBasedSubscriptionPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageBasedSubscriptionPaymentRequest }
     *     
     */
    public void setUsageBasedSubscriptionPaymentRequest(UsageBasedSubscriptionPaymentRequest value) {
        this.usageBasedSubscriptionPaymentRequest = value;
    }

}
