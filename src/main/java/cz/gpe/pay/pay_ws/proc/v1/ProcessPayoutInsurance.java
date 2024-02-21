
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PayoutInsuranceRequest;
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
 *         &lt;element name="payoutInsuranceRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayoutInsuranceRequest"/&gt;
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
    "payoutInsuranceRequest"
})
@XmlRootElement(name = "processPayoutInsurance")
public class ProcessPayoutInsurance {

    @XmlElement(required = true)
    protected PayoutInsuranceRequest payoutInsuranceRequest;

    /**
     * Gets the value of the payoutInsuranceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutInsuranceRequest }
     *     
     */
    public PayoutInsuranceRequest getPayoutInsuranceRequest() {
        return payoutInsuranceRequest;
    }

    /**
     * Sets the value of the payoutInsuranceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutInsuranceRequest }
     *     
     */
    public void setPayoutInsuranceRequest(PayoutInsuranceRequest value) {
        this.payoutInsuranceRequest = value;
    }

}
