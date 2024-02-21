
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.UsageBasedPaymentResponse;
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
 *         &lt;element name="usageBasedPaymentResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UsageBasedPaymentResponse"/&gt;
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
    "usageBasedPaymentResponse"
})
@XmlRootElement(name = "processUsageBasedPaymentResponse")
public class ProcessUsageBasedPaymentResponse {

    @XmlElement(required = true)
    protected UsageBasedPaymentResponse usageBasedPaymentResponse;

    /**
     * Gets the value of the usageBasedPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UsageBasedPaymentResponse }
     *     
     */
    public UsageBasedPaymentResponse getUsageBasedPaymentResponse() {
        return usageBasedPaymentResponse;
    }

    /**
     * Sets the value of the usageBasedPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageBasedPaymentResponse }
     *     
     */
    public void setUsageBasedPaymentResponse(UsageBasedPaymentResponse value) {
        this.usageBasedPaymentResponse = value;
    }

}
