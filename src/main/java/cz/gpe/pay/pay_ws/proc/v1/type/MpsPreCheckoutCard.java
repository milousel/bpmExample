
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billingAddress" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsAddress" minOccurs="0"/&gt;
 *         &lt;element name="cardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastFour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selectedAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpsPreCheckoutCard", propOrder = {
    "brandId",
    "brandName",
    "billingAddress",
    "cardHolderName",
    "expiryMonth",
    "expiryYear",
    "cardId",
    "lastFour",
    "cardAlias",
    "selectedAsDefault"
})
public class MpsPreCheckoutCard {

    @XmlElement(required = true)
    protected String brandId;
    @XmlElement(required = true)
    protected String brandName;
    protected MpsAddress billingAddress;
    @XmlElement(required = true)
    protected String cardHolderName;
    protected Integer expiryMonth;
    protected Integer expiryYear;
    @XmlElement(required = true)
    protected String cardId;
    @XmlElement(required = true)
    protected String lastFour;
    protected String cardAlias;
    protected boolean selectedAsDefault;

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MpsAddress }
     *     
     */
    public MpsAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpsAddress }
     *     
     */
    public void setBillingAddress(MpsAddress value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryMonth(Integer value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryYear(Integer value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the lastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Sets the value of the lastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFour(String value) {
        this.lastFour = value;
    }

    /**
     * Gets the value of the cardAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAlias() {
        return cardAlias;
    }

    /**
     * Sets the value of the cardAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAlias(String value) {
        this.cardAlias = value;
    }

    /**
     * Gets the value of the selectedAsDefault property.
     * 
     */
    public boolean isSelectedAsDefault() {
        return selectedAsDefault;
    }

    /**
     * Sets the value of the selectedAsDefault property.
     * 
     */
    public void setSelectedAsDefault(boolean value) {
        this.selectedAsDefault = value;
    }

}
