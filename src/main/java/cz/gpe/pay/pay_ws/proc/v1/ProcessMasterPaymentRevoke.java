
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.PaymentStatusRequest;
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
 *         &lt;element name="masterPaymentStatusRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentStatusRequest"/&gt;
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
    "masterPaymentStatusRequest"
})
@XmlRootElement(name = "processMasterPaymentRevoke")
public class ProcessMasterPaymentRevoke {

    @XmlElement(required = true)
    protected PaymentStatusRequest masterPaymentStatusRequest;

    /**
     * Gets the value of the masterPaymentStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusRequest }
     *     
     */
    public PaymentStatusRequest getMasterPaymentStatusRequest() {
        return masterPaymentStatusRequest;
    }

    /**
     * Sets the value of the masterPaymentStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusRequest }
     *     
     */
    public void setMasterPaymentStatusRequest(PaymentStatusRequest value) {
        this.masterPaymentStatusRequest = value;
    }

}
