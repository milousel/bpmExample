
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PayoutInsuranceResponse;
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
 *         &lt;element name="payoutInsuranceResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayoutInsuranceResponse"/&gt;
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
    "payoutInsuranceResponse"
})
@XmlRootElement(name = "processPayoutInsuranceResponse")
public class ProcessPayoutInsuranceResponse {

    @XmlElement(required = true)
    protected PayoutInsuranceResponse payoutInsuranceResponse;

    /**
     * Gets the value of the payoutInsuranceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutInsuranceResponse }
     *     
     */
    public PayoutInsuranceResponse getPayoutInsuranceResponse() {
        return payoutInsuranceResponse;
    }

    /**
     * Sets the value of the payoutInsuranceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutInsuranceResponse }
     *     
     */
    public void setPayoutInsuranceResponse(PayoutInsuranceResponse value) {
        this.payoutInsuranceResponse = value;
    }

}
