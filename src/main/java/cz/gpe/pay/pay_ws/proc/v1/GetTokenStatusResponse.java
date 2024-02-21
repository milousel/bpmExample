
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenStatusResponse;
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
 *         &lt;element name="tokenStatusResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenStatusResponse"/&gt;
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
    "tokenStatusResponse"
})
@XmlRootElement(name = "getTokenStatusResponse")
public class GetTokenStatusResponse {

    @XmlElement(required = true)
    protected TokenStatusResponse tokenStatusResponse;

    /**
     * Gets the value of the tokenStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenStatusResponse }
     *     
     */
    public TokenStatusResponse getTokenStatusResponse() {
        return tokenStatusResponse;
    }

    /**
     * Sets the value of the tokenStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenStatusResponse }
     *     
     */
    public void setTokenStatusResponse(TokenStatusResponse value) {
        this.tokenStatusResponse = value;
    }

}
