
package cz.gpe.pay.pay_ws.proc.v1.type;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MessageId"/&gt;
 *         &lt;element name="preCheckoutData" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}MpsPreCheckoutData"/&gt;
 *         &lt;element name="walletPartnerLogoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="masterpassLogoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="simpleValueHolder" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}SimpleValueHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MpsPreCheckoutResponse", propOrder = {
    "messageId",
    "preCheckoutData",
    "walletPartnerLogoUrl",
    "masterpassLogoUrl",
    "simpleValueHolder",
    "signature"
})
public class MpsPreCheckoutResponse {

    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected MpsPreCheckoutData preCheckoutData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String walletPartnerLogoUrl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String masterpassLogoUrl;
    protected List<SimpleValueHolder> simpleValueHolder;
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
     * Gets the value of the preCheckoutData property.
     * 
     * @return
     *     possible object is
     *     {@link MpsPreCheckoutData }
     *     
     */
    public MpsPreCheckoutData getPreCheckoutData() {
        return preCheckoutData;
    }

    /**
     * Sets the value of the preCheckoutData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MpsPreCheckoutData }
     *     
     */
    public void setPreCheckoutData(MpsPreCheckoutData value) {
        this.preCheckoutData = value;
    }

    /**
     * Gets the value of the walletPartnerLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletPartnerLogoUrl() {
        return walletPartnerLogoUrl;
    }

    /**
     * Sets the value of the walletPartnerLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletPartnerLogoUrl(String value) {
        this.walletPartnerLogoUrl = value;
    }

    /**
     * Gets the value of the masterpassLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterpassLogoUrl() {
        return masterpassLogoUrl;
    }

    /**
     * Sets the value of the masterpassLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterpassLogoUrl(String value) {
        this.masterpassLogoUrl = value;
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
