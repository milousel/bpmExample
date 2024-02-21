
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionType" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TransactionTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="shippingIndicator" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ShippingIndicatorValue" minOccurs="0"/&gt;
 *         &lt;element name="preOrderPurchaseInd" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PreOrderPurchaseIndValue" minOccurs="0"/&gt;
 *         &lt;element name="preOrderDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="reorderItemsInd" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReorderItemsIndValue" minOccurs="0"/&gt;
 *         &lt;element name="deliveryTimeframe" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DeliveryTimeframeValue" minOccurs="0"/&gt;
 *         &lt;element name="deliveryEmailAddress" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
 *         &lt;element name="giftCardCount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}GiftCardCountValue" minOccurs="0"/&gt;
 *         &lt;element name="giftCardAmount" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}GiftCardAmountValue" minOccurs="0"/&gt;
 *         &lt;element name="giftCardCurrency" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}GiftCardCurrencyValue" minOccurs="0"/&gt;
 *         &lt;element name="recurringExpiry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="recurringFrequency" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RecurringFrequencyValue" minOccurs="0"/&gt;
 *         &lt;element name="remmitanceInfo1" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RemmitanceInfoValue" minOccurs="0"/&gt;
 *         &lt;element name="remmitanceInfo2" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}RemmitanceInfoValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfo", propOrder = {
    "transactionType",
    "shippingIndicator",
    "preOrderPurchaseInd",
    "preOrderDate",
    "reorderItemsInd",
    "deliveryTimeframe",
    "deliveryEmailAddress",
    "giftCardCount",
    "giftCardAmount",
    "giftCardCurrency",
    "recurringExpiry",
    "recurringFrequency",
    "remmitanceInfo1",
    "remmitanceInfo2"
})
public class PaymentInfo {

    protected String transactionType;
    protected String shippingIndicator;
    protected String preOrderPurchaseInd;
    protected String preOrderDate;
    protected String reorderItemsInd;
    protected String deliveryTimeframe;
    protected String deliveryEmailAddress;
    protected String giftCardCount;
    protected String giftCardAmount;
    protected String giftCardCurrency;
    protected String recurringExpiry;
    protected String recurringFrequency;
    protected String remmitanceInfo1;
    protected String remmitanceInfo2;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the shippingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingIndicator() {
        return shippingIndicator;
    }

    /**
     * Sets the value of the shippingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingIndicator(String value) {
        this.shippingIndicator = value;
    }

    /**
     * Gets the value of the preOrderPurchaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreOrderPurchaseInd() {
        return preOrderPurchaseInd;
    }

    /**
     * Sets the value of the preOrderPurchaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreOrderPurchaseInd(String value) {
        this.preOrderPurchaseInd = value;
    }

    /**
     * Gets the value of the preOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreOrderDate() {
        return preOrderDate;
    }

    /**
     * Sets the value of the preOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreOrderDate(String value) {
        this.preOrderDate = value;
    }

    /**
     * Gets the value of the reorderItemsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderItemsInd() {
        return reorderItemsInd;
    }

    /**
     * Sets the value of the reorderItemsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderItemsInd(String value) {
        this.reorderItemsInd = value;
    }

    /**
     * Gets the value of the deliveryTimeframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTimeframe() {
        return deliveryTimeframe;
    }

    /**
     * Sets the value of the deliveryTimeframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTimeframe(String value) {
        this.deliveryTimeframe = value;
    }

    /**
     * Gets the value of the deliveryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryEmailAddress() {
        return deliveryEmailAddress;
    }

    /**
     * Sets the value of the deliveryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryEmailAddress(String value) {
        this.deliveryEmailAddress = value;
    }

    /**
     * Gets the value of the giftCardCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCount() {
        return giftCardCount;
    }

    /**
     * Sets the value of the giftCardCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCount(String value) {
        this.giftCardCount = value;
    }

    /**
     * Gets the value of the giftCardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardAmount() {
        return giftCardAmount;
    }

    /**
     * Sets the value of the giftCardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardAmount(String value) {
        this.giftCardAmount = value;
    }

    /**
     * Gets the value of the giftCardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCurrency() {
        return giftCardCurrency;
    }

    /**
     * Sets the value of the giftCardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCurrency(String value) {
        this.giftCardCurrency = value;
    }

    /**
     * Gets the value of the recurringExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringExpiry() {
        return recurringExpiry;
    }

    /**
     * Sets the value of the recurringExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringExpiry(String value) {
        this.recurringExpiry = value;
    }

    /**
     * Gets the value of the recurringFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Sets the value of the recurringFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringFrequency(String value) {
        this.recurringFrequency = value;
    }

    /**
     * Gets the value of the remmitanceInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmitanceInfo1() {
        return remmitanceInfo1;
    }

    /**
     * Sets the value of the remmitanceInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmitanceInfo1(String value) {
        this.remmitanceInfo1 = value;
    }

    /**
     * Gets the value of the remmitanceInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmitanceInfo2() {
        return remmitanceInfo2;
    }

    /**
     * Sets the value of the remmitanceInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmitanceInfo2(String value) {
        this.remmitanceInfo2 = value;
    }

}
