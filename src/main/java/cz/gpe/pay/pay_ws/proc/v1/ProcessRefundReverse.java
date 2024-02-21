
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.RefundReverseRequest;
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
 *         &lt;element name="refundReverseRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RefundReverseRequest"/&gt;
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
    "refundReverseRequest"
})
@XmlRootElement(name = "processRefundReverse")
public class ProcessRefundReverse {

    @XmlElement(required = true)
    protected RefundReverseRequest refundReverseRequest;

    /**
     * Gets the value of the refundReverseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RefundReverseRequest }
     *     
     */
    public RefundReverseRequest getRefundReverseRequest() {
        return refundReverseRequest;
    }

    /**
     * Sets the value of the refundReverseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundReverseRequest }
     *     
     */
    public void setRefundReverseRequest(RefundReverseRequest value) {
        this.refundReverseRequest = value;
    }

}
