
package cz.gpe.pay.pay_ws.proc.v1.type;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxAmount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount" minOccurs="0"/&gt;
 *         &lt;element name="shippingAmount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount12" minOccurs="0"/&gt;
 *         &lt;element name="handlingAmount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount12" minOccurs="0"/&gt;
 *         &lt;element name="cartAmount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Amount12" minOccurs="0"/&gt;
 *         &lt;element name="shoppingCartItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="shoppingCartItem" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ShoppingCartItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "ShoppingCartInfo", propOrder = {
    "taxAmount",
    "shippingAmount",
    "handlingAmount",
    "cartAmount",
    "shoppingCartItems"
})
public class ShoppingCartInfo {

    protected Long taxAmount;
    protected Long shippingAmount;
    protected Long handlingAmount;
    protected Long cartAmount;
    protected ShoppingCartInfo.ShoppingCartItems shoppingCartItems;

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShippingAmount(Long value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the handlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandlingAmount() {
        return handlingAmount;
    }

    /**
     * Sets the value of the handlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandlingAmount(Long value) {
        this.handlingAmount = value;
    }

    /**
     * Gets the value of the cartAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCartAmount() {
        return cartAmount;
    }

    /**
     * Sets the value of the cartAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCartAmount(Long value) {
        this.cartAmount = value;
    }

    /**
     * Gets the value of the shoppingCartItems property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartInfo.ShoppingCartItems }
     *     
     */
    public ShoppingCartInfo.ShoppingCartItems getShoppingCartItems() {
        return shoppingCartItems;
    }

    /**
     * Sets the value of the shoppingCartItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartInfo.ShoppingCartItems }
     *     
     */
    public void setShoppingCartItems(ShoppingCartInfo.ShoppingCartItems value) {
        this.shoppingCartItems = value;
    }


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
     *         &lt;element name="shoppingCartItem" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ShoppingCartItem" maxOccurs="unbounded"/&gt;
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
        "shoppingCartItem"
    })
    public static class ShoppingCartItems {

        @XmlElement(required = true)
        protected List<ShoppingCartItem> shoppingCartItem;

        /**
         * Gets the value of the shoppingCartItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the shoppingCartItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShoppingCartItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShoppingCartItem }
         * 
         * 
         */
        public List<ShoppingCartItem> getShoppingCartItem() {
            if (shoppingCartItem == null) {
                shoppingCartItem = new ArrayList<ShoppingCartItem>();
            }
            return this.shoppingCartItem;
        }

    }

}
