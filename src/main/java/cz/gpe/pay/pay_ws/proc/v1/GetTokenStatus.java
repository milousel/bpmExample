
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenStatusRequest;
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
 *         &lt;element name="tokenStatusRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenStatusRequest"/&gt;
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
    "tokenStatusRequest"
})
@XmlRootElement(name = "getTokenStatus")
public class GetTokenStatus {

    @XmlElement(required = true)
    protected TokenStatusRequest tokenStatusRequest;

    /**
     * Gets the value of the tokenStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TokenStatusRequest }
     *     
     */
    public TokenStatusRequest getTokenStatusRequest() {
        return tokenStatusRequest;
    }

    /**
     * Sets the value of the tokenStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenStatusRequest }
     *     
     */
    public void setTokenStatusRequest(TokenStatusRequest value) {
        this.tokenStatusRequest = value;
    }

}
