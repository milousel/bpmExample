
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CardDataRequest;
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
 *         &lt;element name="cardDataRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CardDataRequest"/&gt;
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
    "cardDataRequest"
})
@XmlRootElement(name = "getCardData")
public class GetCardData {

    @XmlElement(required = true)
    protected CardDataRequest cardDataRequest;

    /**
     * Gets the value of the cardDataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataRequest }
     *     
     */
    public CardDataRequest getCardDataRequest() {
        return cardDataRequest;
    }

    /**
     * Sets the value of the cardDataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataRequest }
     *     
     */
    public void setCardDataRequest(CardDataRequest value) {
        this.cardDataRequest = value;
    }

}
