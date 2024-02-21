
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.RefundRequest;
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
 *         &lt;element name="refundRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RefundRequest"/&gt;
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
    "refundRequest"
})
@XmlRootElement(name = "processRefund")
public class ProcessRefund {

    @XmlElement(required = true)
    protected RefundRequest refundRequest;

    /**
     * Gets the value of the refundRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequest }
     *     
     */
    public RefundRequest getRefundRequest() {
        return refundRequest;
    }

    /**
     * Sets the value of the refundRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequest }
     *     
     */
    public void setRefundRequest(RefundRequest value) {
        this.refundRequest = value;
    }

}
