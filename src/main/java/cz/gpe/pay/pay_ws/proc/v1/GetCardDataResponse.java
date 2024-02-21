
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CardDataResponse;
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
 *         &lt;element name="cardDataResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CardDataResponse"/&gt;
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
    "cardDataResponse"
})
@XmlRootElement(name = "getCardDataResponse")
public class GetCardDataResponse {

    @XmlElement(required = true)
    protected CardDataResponse cardDataResponse;

    /**
     * Gets the value of the cardDataResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataResponse }
     *     
     */
    public CardDataResponse getCardDataResponse() {
        return cardDataResponse;
    }

    /**
     * Sets the value of the cardDataResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataResponse }
     *     
     */
    public void setCardDataResponse(CardDataResponse value) {
        this.cardDataResponse = value;
    }

}
