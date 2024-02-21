
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CardOnFilePaymentRequest;
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
 *         &lt;element name="cardOnFilePaymentRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CardOnFilePaymentRequest"/&gt;
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
    "cardOnFilePaymentRequest"
})
@XmlRootElement(name = "processCardOnFilePayment")
public class ProcessCardOnFilePayment {

    @XmlElement(required = true)
    protected CardOnFilePaymentRequest cardOnFilePaymentRequest;

    /**
     * Gets the value of the cardOnFilePaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CardOnFilePaymentRequest }
     *     
     */
    public CardOnFilePaymentRequest getCardOnFilePaymentRequest() {
        return cardOnFilePaymentRequest;
    }

    /**
     * Sets the value of the cardOnFilePaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOnFilePaymentRequest }
     *     
     */
    public void setCardOnFilePaymentRequest(CardOnFilePaymentRequest value) {
        this.cardOnFilePaymentRequest = value;
    }

}