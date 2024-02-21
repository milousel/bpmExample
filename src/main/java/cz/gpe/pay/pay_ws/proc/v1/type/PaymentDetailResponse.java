
package cz.gpe.pay.pay_ws.proc.v1.type;

import java.util.ArrayList;
import java.util.List;
import cz.gpe.gpwebpay.additionalinfo.response.v1.AdditionalInfoResponse;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="approveAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="captureAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="refundAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="approveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCaptureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalInfoResponse" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}additionalInfoResponse" minOccurs="0"/&gt;
 *         &lt;element name="simpleValueHolder" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}SimpleValueHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="panToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="panExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dayToCapture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traceId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TraceId" minOccurs="0"/&gt;
 *         &lt;element name="authResponseCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthResponseCode" minOccurs="0"/&gt;
 *         &lt;element name="authRRN" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthRRN" minOccurs="0"/&gt;
 *         &lt;element name="paymentAccountReference" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PaymentAccountReference" minOccurs="0"/&gt;
 *         &lt;element name="iasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payPalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailResponse", propOrder = {
    "messageId",
    "state",
    "status",
    "subStatus",
    "paymentMethod",
    "panMasked",
    "brandName",
    "paymentAmount",
    "approveAmount",
    "captureAmount",
    "refundAmount",
    "approveCode",
    "paymentTime",
    "approveTime",
    "lastCaptureTime",
    "additionalInfoResponse",
    "simpleValueHolder",
    "panToken",
    "panPattern",
    "panExpiry",
    "acsResult",
    "dayToCapture",
    "traceId",
    "authResponseCode",
    "authRRN",
    "paymentAccountReference",
    "iasId",
    "payPalId",
    "signature"
})
public class PaymentDetailResponse {

    @XmlElement(required = true)
    protected String messageId;
    protected int state;
    protected String status;
    protected String subStatus;
    protected String paymentMethod;
    protected String panMasked;
    protected String brandName;
    protected Long paymentAmount;
    protected Long approveAmount;
    protected Long captureAmount;
    protected Long refundAmount;
    protected String approveCode;
    protected String paymentTime;
    protected String approveTime;
    protected String lastCaptureTime;
    protected AdditionalInfoResponse additionalInfoResponse;
    protected List<SimpleValueHolder> simpleValueHolder;
    protected String panToken;
    protected String panPattern;
    protected String panExpiry;
    protected String acsResult;
    protected String dayToCapture;
    protected String traceId;
    protected String authResponseCode;
    protected String authRRN;
    protected String paymentAccountReference;
    protected String iasId;
    protected String payPalId;
    @XmlElement(required = true)
    protected byte[] signature;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the panMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanMasked() {
        return panMasked;
    }

    /**
     * Sets the value of the panMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanMasked(String value) {
        this.panMasked = value;
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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentAmount(Long value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the approveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApproveAmount() {
        return approveAmount;
    }

    /**
     * Sets the value of the approveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApproveAmount(Long value) {
        this.approveAmount = value;
    }

    /**
     * Gets the value of the captureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaptureAmount() {
        return captureAmount;
    }

    /**
     * Sets the value of the captureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaptureAmount(Long value) {
        this.captureAmount = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefundAmount(Long value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the approveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveCode() {
        return approveCode;
    }

    /**
     * Sets the value of the approveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveCode(String value) {
        this.approveCode = value;
    }

    /**
     * Gets the value of the paymentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * Sets the value of the paymentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTime(String value) {
        this.paymentTime = value;
    }

    /**
     * Gets the value of the approveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveTime() {
        return approveTime;
    }

    /**
     * Sets the value of the approveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveTime(String value) {
        this.approveTime = value;
    }

    /**
     * Gets the value of the lastCaptureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCaptureTime() {
        return lastCaptureTime;
    }

    /**
     * Sets the value of the lastCaptureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCaptureTime(String value) {
        this.lastCaptureTime = value;
    }

    /**
     * Gets the value of the additionalInfoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse }
     *     
     */
    public AdditionalInfoResponse getAdditionalInfoResponse() {
        return additionalInfoResponse;
    }

    /**
     * Sets the value of the additionalInfoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse }
     *     
     */
    public void setAdditionalInfoResponse(AdditionalInfoResponse value) {
        this.additionalInfoResponse = value;
    }

    /**
     * Gets the value of the simpleValueHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the simpleValueHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleValueHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleValueHolder }
     * 
     * 
     */
    public List<SimpleValueHolder> getSimpleValueHolder() {
        if (simpleValueHolder == null) {
            simpleValueHolder = new ArrayList<SimpleValueHolder>();
        }
        return this.simpleValueHolder;
    }

    /**
     * Gets the value of the panToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanToken() {
        return panToken;
    }

    /**
     * Sets the value of the panToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanToken(String value) {
        this.panToken = value;
    }

    /**
     * Gets the value of the panPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanPattern() {
        return panPattern;
    }

    /**
     * Sets the value of the panPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanPattern(String value) {
        this.panPattern = value;
    }

    /**
     * Gets the value of the panExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanExpiry() {
        return panExpiry;
    }

    /**
     * Sets the value of the panExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanExpiry(String value) {
        this.panExpiry = value;
    }

    /**
     * Gets the value of the acsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsResult() {
        return acsResult;
    }

    /**
     * Sets the value of the acsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsResult(String value) {
        this.acsResult = value;
    }

    /**
     * Gets the value of the dayToCapture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayToCapture() {
        return dayToCapture;
    }

    /**
     * Sets the value of the dayToCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayToCapture(String value) {
        this.dayToCapture = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the authResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthResponseCode() {
        return authResponseCode;
    }

    /**
     * Sets the value of the authResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthResponseCode(String value) {
        this.authResponseCode = value;
    }

    /**
     * Gets the value of the authRRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRRN() {
        return authRRN;
    }

    /**
     * Sets the value of the authRRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRRN(String value) {
        this.authRRN = value;
    }

    /**
     * Gets the value of the paymentAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Sets the value of the paymentAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
    }

    /**
     * Gets the value of the iasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIasId() {
        return iasId;
    }

    /**
     * Sets the value of the iasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIasId(String value) {
        this.iasId = value;
    }

    /**
     * Gets the value of the payPalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalId() {
        return payPalId;
    }

    /**
     * Sets the value of the payPalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalId(String value) {
        this.payPalId = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

}
