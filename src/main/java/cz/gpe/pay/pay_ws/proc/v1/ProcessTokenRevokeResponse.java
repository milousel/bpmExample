
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenRevokeResponse;
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
 *         &lt;element name="tokenRevokeResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenRevokeResponse"/&gt;
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
    "tokenRevokeResponse"
})
@XmlRootElement(name = "processTokenRevokeResponse")
public class ProcessTokenRevokeResponse {

    @XmlElement(required = true)
    protected TokenRevokeResponse tokenRevokeResponse;

    /**
     * Gets the value of the tokenRevokeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRevokeResponse }
     *     
     */
    public TokenRevokeResponse getTokenRevokeResponse() {
        return tokenRevokeResponse;
    }

    /**
     * Sets the value of the tokenRevokeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRevokeResponse }
     *     
     */
    public void setTokenRevokeResponse(TokenRevokeResponse value) {
        this.tokenRevokeResponse = value;
    }

}
