
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PayoutResponse;
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
 *         &lt;element name="payoutResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayoutResponse"/&gt;
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
    "payoutResponse"
})
@XmlRootElement(name = "processPayoutResponse")
public class ProcessPayoutResponse {

    @XmlElement(required = true)
    protected PayoutResponse payoutResponse;

    /**
     * Gets the value of the payoutResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutResponse }
     *     
     */
    public PayoutResponse getPayoutResponse() {
        return payoutResponse;
    }

    /**
     * Sets the value of the payoutResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutResponse }
     *     
     */
    public void setPayoutResponse(PayoutResponse value) {
        this.payoutResponse = value;
    }

}
