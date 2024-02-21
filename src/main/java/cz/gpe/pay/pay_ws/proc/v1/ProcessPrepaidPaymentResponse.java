
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PrepaidPaymentResponse;
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
 *         &lt;element name="prepaidPaymentResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PrepaidPaymentResponse"/&gt;
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
    "prepaidPaymentResponse"
})
@XmlRootElement(name = "processPrepaidPaymentResponse")
public class ProcessPrepaidPaymentResponse {

    @XmlElement(required = true)
    protected PrepaidPaymentResponse prepaidPaymentResponse;

    /**
     * Gets the value of the prepaidPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentResponse }
     *     
     */
    public PrepaidPaymentResponse getPrepaidPaymentResponse() {
        return prepaidPaymentResponse;
    }

    /**
     * Sets the value of the prepaidPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentResponse }
     *     
     */
    public void setPrepaidPaymentResponse(PrepaidPaymentResponse value) {
        this.prepaidPaymentResponse = value;
    }

}
