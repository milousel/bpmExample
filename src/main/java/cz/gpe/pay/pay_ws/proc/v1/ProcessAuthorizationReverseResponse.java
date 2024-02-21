
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.AuthorizationReverseResponse;
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
 *         &lt;element name="authorizationReverseResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthorizationReverseResponse"/&gt;
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
    "authorizationReverseResponse"
})
@XmlRootElement(name = "processAuthorizationReverseResponse")
public class ProcessAuthorizationReverseResponse {

    @XmlElement(required = true)
    protected AuthorizationReverseResponse authorizationReverseResponse;

    /**
     * Gets the value of the authorizationReverseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationReverseResponse }
     *     
     */
    public AuthorizationReverseResponse getAuthorizationReverseResponse() {
        return authorizationReverseResponse;
    }

    /**
     * Sets the value of the authorizationReverseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationReverseResponse }
     *     
     */
    public void setAuthorizationReverseResponse(AuthorizationReverseResponse value) {
        this.authorizationReverseResponse = value;
    }

}
