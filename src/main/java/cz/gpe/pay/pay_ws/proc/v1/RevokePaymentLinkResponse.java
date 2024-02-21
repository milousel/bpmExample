
package cz.gpe.pay.pay_ws.proc.v1;

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
 *         &lt;element name="revokePaymentLinkResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RevokePaymentLinkResponse"/&gt;
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
    "revokePaymentLinkResponse"
})
@XmlRootElement(name = "revokePaymentLinkResponse")
public class RevokePaymentLinkResponse {

    @XmlElement(required = true)
    protected cz.gpe.pay.pay_ws.proc.v1.type.RevokePaymentLinkResponse revokePaymentLinkResponse;

    /**
     * Gets the value of the revokePaymentLinkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link cz.gpe.pay.pay_ws.proc.v1.type.RevokePaymentLinkResponse }
     *     
     */
    public cz.gpe.pay.pay_ws.proc.v1.type.RevokePaymentLinkResponse getRevokePaymentLinkResponse() {
        return revokePaymentLinkResponse;
    }

    /**
     * Sets the value of the revokePaymentLinkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link cz.gpe.pay.pay_ws.proc.v1.type.RevokePaymentLinkResponse }
     *     
     */
    public void setRevokePaymentLinkResponse(cz.gpe.pay.pay_ws.proc.v1.type.RevokePaymentLinkResponse value) {
        this.revokePaymentLinkResponse = value;
    }

}
