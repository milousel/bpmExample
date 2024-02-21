
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PrepaidPaymentRequest;
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
 *         &lt;element name="prepaidPaymentRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PrepaidPaymentRequest"/&gt;
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
    "prepaidPaymentRequest"
})
@XmlRootElement(name = "processPrepaidPayment")
public class ProcessPrepaidPayment {

    @XmlElement(required = true)
    protected PrepaidPaymentRequest prepaidPaymentRequest;

    /**
     * Gets the value of the prepaidPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentRequest }
     *     
     */
    public PrepaidPaymentRequest getPrepaidPaymentRequest() {
        return prepaidPaymentRequest;
    }

    /**
     * Sets the value of the prepaidPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentRequest }
     *     
     */
    public void setPrepaidPaymentRequest(PrepaidPaymentRequest value) {
        this.prepaidPaymentRequest = value;
    }

}
