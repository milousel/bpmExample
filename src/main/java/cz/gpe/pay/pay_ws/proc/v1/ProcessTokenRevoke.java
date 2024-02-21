
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenRevokeRequest;
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
 *         &lt;element name="tokenRevokeRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenRevokeRequest"/&gt;
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
    "tokenRevokeRequest"
})
@XmlRootElement(name = "processTokenRevoke")
public class ProcessTokenRevoke {

    @XmlElement(required = true)
    protected TokenRevokeRequest tokenRevokeRequest;

    /**
     * Gets the value of the tokenRevokeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRevokeRequest }
     *     
     */
    public TokenRevokeRequest getTokenRevokeRequest() {
        return tokenRevokeRequest;
    }

    /**
     * Sets the value of the tokenRevokeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRevokeRequest }
     *     
     */
    public void setTokenRevokeRequest(TokenRevokeRequest value) {
        this.tokenRevokeRequest = value;
    }

}
