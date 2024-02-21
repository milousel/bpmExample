
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PayoutWinningRequest;
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
 *         &lt;element name="payoutWinningRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayoutWinningRequest"/&gt;
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
    "payoutWinningRequest"
})
@XmlRootElement(name = "processPayoutWinning")
public class ProcessPayoutWinning {

    @XmlElement(required = true)
    protected PayoutWinningRequest payoutWinningRequest;

    /**
     * Gets the value of the payoutWinningRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutWinningRequest }
     *     
     */
    public PayoutWinningRequest getPayoutWinningRequest() {
        return payoutWinningRequest;
    }

    /**
     * Sets the value of the payoutWinningRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutWinningRequest }
     *     
     */
    public void setPayoutWinningRequest(PayoutWinningRequest value) {
        this.payoutWinningRequest = value;
    }

}
