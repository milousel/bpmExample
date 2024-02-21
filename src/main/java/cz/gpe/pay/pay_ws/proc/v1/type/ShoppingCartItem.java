
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ItemType" minOccurs="0"/&gt;
 *         &lt;element name="itemDescription"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;pattern value=".*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itemQuantity"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxInclusive value="999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itemUnitPrice" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount"/&gt;
 *         &lt;element name="itemClass" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ItemType" minOccurs="0"/&gt;
 *         &lt;element name="itemType" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ItemType" minOccurs="0"/&gt;
 *         &lt;element name="itemImageUrl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartItem", propOrder = {
    "itemCode",
    "itemDescription",
    "itemQuantity",
    "itemUnitPrice",
    "itemClass",
    "itemType",
    "itemImageUrl"
})
public class ShoppingCartItem {

    protected String itemCode;
    @XmlElement(required = true)
    protected String itemDescription;
    protected long itemQuantity;
    protected long itemUnitPrice;
    protected String itemClass;
    protected String itemType;
    protected String itemImageUrl;

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     */
    public long getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     */
    public void setItemQuantity(long value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the itemUnitPrice property.
     * 
     */
    public long getItemUnitPrice() {
        return itemUnitPrice;
    }

    /**
     * Sets the value of the itemUnitPrice property.
     * 
     */
    public void setItemUnitPrice(long value) {
        this.itemUnitPrice = value;
    }

    /**
     * Gets the value of the itemClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemClass() {
        return itemClass;
    }

    /**
     * Sets the value of the itemClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemClass(String value) {
        this.itemClass = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemImageUrl() {
        return itemImageUrl;
    }

    /**
     * Sets the value of the itemImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemImageUrl(String value) {
        this.itemImageUrl = value;
    }

}
