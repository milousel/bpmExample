
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.MpsPreCheckoutRequest;
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
 *         &lt;element name="mpsPreCheckoutRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsPreCheckoutRequest"/&gt;
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
    "mpsPreCheckoutRequest"
})
@XmlRootElement(name = "mpsPreCheckout")
public class MpsPreCheckout {

    @XmlElement(required = true)
    protected MpsPreCheckoutRequest mpsPreCheckoutRequest;

    /**
     * Gets the value of the mpsPreCheckoutRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MpsPreCheckoutRequest }
     *     
     */
    public MpsPreCheckoutRequest getMpsPreCheckoutRequest() {
        return mpsPreCheckoutRequest;
    }

    /**
     * Sets the value of the mpsPreCheckoutRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpsPreCheckoutRequest }
     *     
     */
    public void setMpsPreCheckoutRequest(MpsPreCheckoutRequest value) {
        this.mpsPreCheckoutRequest = value;
    }

}