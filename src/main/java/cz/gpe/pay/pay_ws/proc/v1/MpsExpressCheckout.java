
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.MpsExpressCheckoutRequest;
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
 *         &lt;element name="mpsExpressCheckoutRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsExpressCheckoutRequest"/&gt;
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
    "mpsExpressCheckoutRequest"
})
@XmlRootElement(name = "mpsExpressCheckout")
public class MpsExpressCheckout {

    @XmlElement(required = true)
    protected MpsExpressCheckoutRequest mpsExpressCheckoutRequest;

    /**
     * Gets the value of the mpsExpressCheckoutRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MpsExpressCheckoutRequest }
     *     
     */
    public MpsExpressCheckoutRequest getMpsExpressCheckoutRequest() {
        return mpsExpressCheckoutRequest;
    }

    /**
     * Sets the value of the mpsExpressCheckoutRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpsExpressCheckoutRequest }
     *     
     */
    public void setMpsExpressCheckoutRequest(MpsExpressCheckoutRequest value) {
        this.mpsExpressCheckoutRequest = value;
    }

}
