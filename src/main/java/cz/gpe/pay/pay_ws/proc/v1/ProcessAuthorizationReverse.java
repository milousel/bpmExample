
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.AuthorizationReverseRequest;
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
 *         &lt;element name="authorizationReverseRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthorizationReverseRequest"/&gt;
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
    "authorizationReverseRequest"
})
@XmlRootElement(name = "processAuthorizationReverse")
public class ProcessAuthorizationReverse {

    @XmlElement(required = true)
    protected AuthorizationReverseRequest authorizationReverseRequest;

    /**
     * Gets the value of the authorizationReverseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationReverseRequest }
     *     
     */
    public AuthorizationReverseRequest getAuthorizationReverseRequest() {
        return authorizationReverseRequest;
    }

    /**
     * Sets the value of the authorizationReverseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationReverseRequest }
     *     
     */
    public void setAuthorizationReverseRequest(AuthorizationReverseRequest value) {
        this.authorizationReverseRequest = value;
    }

}
