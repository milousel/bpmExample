
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.TokenPaymentRequest;
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
 *         &lt;element name="tokenPaymentRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TokenPaymentRequest"/&gt;
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
    "tokenPaymentRequest"
})
@XmlRootElement(name = "processTokenPayment")
public class ProcessTokenPayment {

    @XmlElement(required = true)
    protected TokenPaymentRequest tokenPaymentRequest;

    /**
     * Gets the value of the tokenPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TokenPaymentRequest }
     *     
     */
    public TokenPaymentRequest getTokenPaymentRequest() {
        return tokenPaymentRequest;
    }

    /**
     * Sets the value of the tokenPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenPaymentRequest }
     *     
     */
    public void setTokenPaymentRequest(TokenPaymentRequest value) {
        this.tokenPaymentRequest = value;
    }

}
