
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenPaymentResponse;
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
 *         &lt;element name="tokenPaymentResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenPaymentResponse"/&gt;
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
    "tokenPaymentResponse"
})
@XmlRootElement(name = "processTokenPaymentResponse")
public class ProcessTokenPaymentResponse {

    @XmlElement(required = true)
    protected TokenPaymentResponse tokenPaymentResponse;

    /**
     * Gets the value of the tokenPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenPaymentResponse }
     *     
     */
    public TokenPaymentResponse getTokenPaymentResponse() {
        return tokenPaymentResponse;
    }

    /**
     * Sets the value of the tokenPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenPaymentResponse }
     *     
     */
    public void setTokenPaymentResponse(TokenPaymentResponse value) {
        this.tokenPaymentResponse = value;
    }

}
