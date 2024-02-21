
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MpsPreCheckoutRewardProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MpsPreCheckoutRewardProgram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rewardId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rewardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rewardProgramId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rewardLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpsPreCheckoutRewardProgram", propOrder = {
    "rewardNumber",
    "rewardId",
    "rewardName",
    "expiryMonth",
    "expiryYear",
    "rewardProgramId",
    "rewardLogoUrl"
})
public class MpsPreCheckoutRewardProgram {

    @XmlElement(required = true)
    protected String rewardNumber;
    @XmlElement(required = true)
    protected String rewardId;
    protected String rewardName;
    protected Integer expiryMonth;
    protected Integer expiryYear;
    @XmlElement(required = true)
    protected String rewardProgramId;
    protected String rewardLogoUrl;

    /**
     * Gets the value of the rewardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardNumber() {
        return rewardNumber;
    }

    /**
     * Sets the value of the rewardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardNumber(String value) {
        this.rewardNumber = value;
    }

    /**
     * Gets the value of the rewardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardId() {
        return rewardId;
    }

    /**
     * Sets the value of the rewardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardId(String value) {
        this.rewardId = value;
    }

    /**
     * Gets the value of the rewardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardName() {
        return rewardName;
    }

    /**
     * Sets the value of the rewardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardName(String value) {
        this.rewardName = value;
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
     * Gets the value of the rewardProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardProgramId() {
        return rewardProgramId;
    }

    /**
     * Sets the value of the rewardProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardProgramId(String value) {
        this.rewardProgramId = value;
    }

    /**
     * Gets the value of the rewardLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardLogoUrl() {
        return rewardLogoUrl;
    }

    /**
     * Sets the value of the rewardLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardLogoUrl(String value) {
        this.rewardLogoUrl = value;
    }

}
