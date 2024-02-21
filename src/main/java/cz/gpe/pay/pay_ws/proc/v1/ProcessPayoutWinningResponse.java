
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PayoutWinningResponse;
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
 *         &lt;element name="payoutWinningResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PayoutWinningResponse"/&gt;
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
    "payoutWinningResponse"
})
@XmlRootElement(name = "processPayoutWinningResponse")
public class ProcessPayoutWinningResponse {

    @XmlElement(required = true)
    protected PayoutWinningResponse payoutWinningResponse;

    /**
     * Gets the value of the payoutWinningResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutWinningResponse }
     *     
     */
    public PayoutWinningResponse getPayoutWinningResponse() {
        return payoutWinningResponse;
    }

    /**
     * Sets the value of the payoutWinningResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutWinningResponse }
     *     
     */
    public void setPayoutWinningResponse(PayoutWinningResponse value) {
        this.payoutWinningResponse = value;
    }

}
