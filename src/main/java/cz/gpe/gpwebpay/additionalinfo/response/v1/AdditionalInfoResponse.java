
package cz.gpe.gpwebpay.additionalinfo.response.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="walletDetails" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *         &lt;element name="contact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="firstName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="lastName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="billingDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="address1" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="address2" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="address3" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="city" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="postalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="countrySubdivision" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shippingDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="address1" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="address2" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="address3" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="city" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="postalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="countrySubdivision" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardsDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cardDetail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="brandId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                             &lt;element name="brandName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                             &lt;element name="cardHolderName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                             &lt;element name="expiryMonth" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}month" minOccurs="0"/&gt;
 *                             &lt;element name="expiryYear" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}year" minOccurs="0"/&gt;
 *                             &lt;element name="cardId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                             &lt;element name="lastFour" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                             &lt;element name="cardAlias" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loyaltyProgramDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="programNumber" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="programId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
 *                   &lt;element name="programName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="programExpiryMonth" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}month" minOccurs="0"/&gt;
 *                   &lt;element name="programExpiryYear" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}year" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eetRegistrationData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="taxId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}czTaxIdValue"/&gt;
 *                   &lt;element name="businessPremisesId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}businessPremisesIdValue"/&gt;
 *                   &lt;element name="cashRegisterId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}cashRegisterIdValue"/&gt;
 *                   &lt;element name="receiptNumber" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}receiptNumberValue"/&gt;
 *                   &lt;element name="saleDateTime" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
 *                   &lt;element name="totalSaleAmount" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}amountValue"/&gt;
 *                   &lt;element name="regime" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}regimeValue"/&gt;
 *                   &lt;element name="fiscalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}fiscalCodeValue" minOccurs="0"/&gt;
 *                   &lt;element name="securityCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}securityCodeValue" minOccurs="0"/&gt;
 *                   &lt;element name="signatureCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}signatureCodeValue" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="\d+\.\d+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalInfoResponse", propOrder = {
    "walletDetails",
    "contact",
    "billingDetails",
    "shippingDetails",
    "cardsDetails",
    "loyaltyProgramDetails",
    "eetRegistrationData"
})
public class AdditionalInfoResponse {

    protected String walletDetails;
    protected AdditionalInfoResponse.Contact contact;
    protected AdditionalInfoResponse.BillingDetails billingDetails;
    protected AdditionalInfoResponse.ShippingDetails shippingDetails;
    protected AdditionalInfoResponse.CardsDetails cardsDetails;
    protected AdditionalInfoResponse.LoyaltyProgramDetails loyaltyProgramDetails;
    protected AdditionalInfoResponse.EetRegistrationData eetRegistrationData;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the walletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletDetails() {
        return walletDetails;
    }

    /**
     * Sets the value of the walletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletDetails(String value) {
        this.walletDetails = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.Contact }
     *     
     */
    public AdditionalInfoResponse.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.Contact }
     *     
     */
    public void setContact(AdditionalInfoResponse.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.BillingDetails }
     *     
     */
    public AdditionalInfoResponse.BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.BillingDetails }
     *     
     */
    public void setBillingDetails(AdditionalInfoResponse.BillingDetails value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.ShippingDetails }
     *     
     */
    public AdditionalInfoResponse.ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.ShippingDetails }
     *     
     */
    public void setShippingDetails(AdditionalInfoResponse.ShippingDetails value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the cardsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.CardsDetails }
     *     
     */
    public AdditionalInfoResponse.CardsDetails getCardsDetails() {
        return cardsDetails;
    }

    /**
     * Sets the value of the cardsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.CardsDetails }
     *     
     */
    public void setCardsDetails(AdditionalInfoResponse.CardsDetails value) {
        this.cardsDetails = value;
    }

    /**
     * Gets the value of the loyaltyProgramDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.LoyaltyProgramDetails }
     *     
     */
    public AdditionalInfoResponse.LoyaltyProgramDetails getLoyaltyProgramDetails() {
        return loyaltyProgramDetails;
    }

    /**
     * Sets the value of the loyaltyProgramDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.LoyaltyProgramDetails }
     *     
     */
    public void setLoyaltyProgramDetails(AdditionalInfoResponse.LoyaltyProgramDetails value) {
        this.loyaltyProgramDetails = value;
    }

    /**
     * Gets the value of the eetRegistrationData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoResponse.EetRegistrationData }
     *     
     */
    public AdditionalInfoResponse.EetRegistrationData getEetRegistrationData() {
        return eetRegistrationData;
    }

    /**
     * Sets the value of the eetRegistrationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoResponse.EetRegistrationData }
     *     
     */
    public void setEetRegistrationData(AdditionalInfoResponse.EetRegistrationData value) {
        this.eetRegistrationData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="name" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="address1" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="address2" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="address3" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="city" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="postalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="countrySubdivision" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
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
        "name",
        "address1",
        "address2",
        "address3",
        "city",
        "postalCode",
        "country",
        "countrySubdivision",
        "phone",
        "email"
    })
    public static class BillingDetails {

        protected String name;
        @XmlElement(required = true)
        protected String address1;
        protected String address2;
        protected String address3;
        protected String city;
        protected String postalCode;
        protected String country;
        protected String countrySubdivision;
        protected String phone;
        protected String email;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the address1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress1() {
            return address1;
        }

        /**
         * Sets the value of the address1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress1(String value) {
            this.address1 = value;
        }

        /**
         * Gets the value of the address2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress2() {
            return address2;
        }

        /**
         * Sets the value of the address2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress2(String value) {
            this.address2 = value;
        }

        /**
         * Gets the value of the address3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress3() {
            return address3;
        }

        /**
         * Sets the value of the address3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress3(String value) {
            this.address3 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the countrySubdivision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountrySubdivision() {
            return countrySubdivision;
        }

        /**
         * Sets the value of the countrySubdivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountrySubdivision(String value) {
            this.countrySubdivision = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
     *         &lt;element name="cardDetail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="brandId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *                   &lt;element name="brandName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *                   &lt;element name="cardHolderName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *                   &lt;element name="expiryMonth" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}month" minOccurs="0"/&gt;
     *                   &lt;element name="expiryYear" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}year" minOccurs="0"/&gt;
     *                   &lt;element name="cardId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *                   &lt;element name="lastFour" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *                   &lt;element name="cardAlias" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "cardDetail"
    })
    public static class CardsDetails {

        @XmlElement(required = true)
        protected List<AdditionalInfoResponse.CardsDetails.CardDetail> cardDetail;

        /**
         * Gets the value of the cardDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the cardDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCardDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalInfoResponse.CardsDetails.CardDetail }
         * 
         * 
         */
        public List<AdditionalInfoResponse.CardsDetails.CardDetail> getCardDetail() {
            if (cardDetail == null) {
                cardDetail = new ArrayList<AdditionalInfoResponse.CardsDetails.CardDetail>();
            }
            return this.cardDetail;
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
         *         &lt;element name="brandId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
         *         &lt;element name="brandName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
         *         &lt;element name="cardHolderName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
         *         &lt;element name="expiryMonth" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}month" minOccurs="0"/&gt;
         *         &lt;element name="expiryYear" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}year" minOccurs="0"/&gt;
         *         &lt;element name="cardId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
         *         &lt;element name="lastFour" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
         *         &lt;element name="cardAlias" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
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
            "brandId",
            "brandName",
            "cardHolderName",
            "expiryMonth",
            "expiryYear",
            "cardId",
            "lastFour",
            "cardAlias"
        })
        public static class CardDetail {

            protected String brandId;
            @XmlElement(required = true)
            protected String brandName;
            protected String cardHolderName;
            @XmlSchemaType(name = "unsignedByte")
            protected Short expiryMonth;
            @XmlSchemaType(name = "unsignedShort")
            protected Integer expiryYear;
            protected String cardId;
            @XmlElement(required = true)
            protected String lastFour;
            protected String cardAlias;

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
             *     {@link Short }
             *     
             */
            public Short getExpiryMonth() {
                return expiryMonth;
            }

            /**
             * Sets the value of the expiryMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setExpiryMonth(Short value) {
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

        }

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
     *         &lt;element name="firstName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="lastName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
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
        "firstName",
        "lastName",
        "country",
        "phone",
        "email"
    })
    public static class Contact {

        @XmlElement(required = true)
        protected String firstName;
        @XmlElement(required = true)
        protected String lastName;
        protected String country;
        protected String phone;
        protected String email;

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
     *         &lt;element name="taxId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}czTaxIdValue"/&gt;
     *         &lt;element name="businessPremisesId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}businessPremisesIdValue"/&gt;
     *         &lt;element name="cashRegisterId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}cashRegisterIdValue"/&gt;
     *         &lt;element name="receiptNumber" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}receiptNumberValue"/&gt;
     *         &lt;element name="saleDateTime" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="totalSaleAmount" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}amountValue"/&gt;
     *         &lt;element name="regime" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}regimeValue"/&gt;
     *         &lt;element name="fiscalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}fiscalCodeValue" minOccurs="0"/&gt;
     *         &lt;element name="securityCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}securityCodeValue" minOccurs="0"/&gt;
     *         &lt;element name="signatureCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}signatureCodeValue" minOccurs="0"/&gt;
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
        "taxId",
        "businessPremisesId",
        "cashRegisterId",
        "receiptNumber",
        "saleDateTime",
        "totalSaleAmount",
        "regime",
        "fiscalCode",
        "securityCode",
        "signatureCode"
    })
    public static class EetRegistrationData {

        @XmlElement(required = true)
        protected String taxId;
        protected int businessPremisesId;
        @XmlElement(required = true)
        protected String cashRegisterId;
        @XmlElement(required = true)
        protected String receiptNumber;
        @XmlElement(required = true)
        protected String saleDateTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger totalSaleAmount;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected RegimeValue regime;
        protected String fiscalCode;
        protected String securityCode;
        protected String signatureCode;

        /**
         * Gets the value of the taxId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId() {
            return taxId;
        }

        /**
         * Sets the value of the taxId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId(String value) {
            this.taxId = value;
        }

        /**
         * Gets the value of the businessPremisesId property.
         * 
         */
        public int getBusinessPremisesId() {
            return businessPremisesId;
        }

        /**
         * Sets the value of the businessPremisesId property.
         * 
         */
        public void setBusinessPremisesId(int value) {
            this.businessPremisesId = value;
        }

        /**
         * Gets the value of the cashRegisterId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashRegisterId() {
            return cashRegisterId;
        }

        /**
         * Sets the value of the cashRegisterId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashRegisterId(String value) {
            this.cashRegisterId = value;
        }

        /**
         * Gets the value of the receiptNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiptNumber() {
            return receiptNumber;
        }

        /**
         * Sets the value of the receiptNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiptNumber(String value) {
            this.receiptNumber = value;
        }

        /**
         * Gets the value of the saleDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaleDateTime() {
            return saleDateTime;
        }

        /**
         * Sets the value of the saleDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaleDateTime(String value) {
            this.saleDateTime = value;
        }

        /**
         * Gets the value of the totalSaleAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalSaleAmount() {
            return totalSaleAmount;
        }

        /**
         * Sets the value of the totalSaleAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalSaleAmount(BigInteger value) {
            this.totalSaleAmount = value;
        }

        /**
         * Gets the value of the regime property.
         * 
         * @return
         *     possible object is
         *     {@link RegimeValue }
         *     
         */
        public RegimeValue getRegime() {
            return regime;
        }

        /**
         * Sets the value of the regime property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegimeValue }
         *     
         */
        public void setRegime(RegimeValue value) {
            this.regime = value;
        }

        /**
         * Gets the value of the fiscalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiscalCode() {
            return fiscalCode;
        }

        /**
         * Sets the value of the fiscalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiscalCode(String value) {
            this.fiscalCode = value;
        }

        /**
         * Gets the value of the securityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityCode() {
            return securityCode;
        }

        /**
         * Sets the value of the securityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityCode(String value) {
            this.securityCode = value;
        }

        /**
         * Gets the value of the signatureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureCode() {
            return signatureCode;
        }

        /**
         * Sets the value of the signatureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureCode(String value) {
            this.signatureCode = value;
        }

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
     *         &lt;element name="programNumber" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="programId" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="programName" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="programExpiryMonth" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}month" minOccurs="0"/&gt;
     *         &lt;element name="programExpiryYear" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}year" minOccurs="0"/&gt;
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
        "programNumber",
        "programId",
        "programName",
        "programExpiryMonth",
        "programExpiryYear"
    })
    public static class LoyaltyProgramDetails {

        protected String programNumber;
        protected String programId;
        @XmlElement(required = true)
        protected String programName;
        @XmlSchemaType(name = "unsignedByte")
        protected Short programExpiryMonth;
        @XmlSchemaType(name = "unsignedShort")
        protected Integer programExpiryYear;

        /**
         * Gets the value of the programNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramNumber() {
            return programNumber;
        }

        /**
         * Sets the value of the programNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramNumber(String value) {
            this.programNumber = value;
        }

        /**
         * Gets the value of the programId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramId() {
            return programId;
        }

        /**
         * Sets the value of the programId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramId(String value) {
            this.programId = value;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Gets the value of the programExpiryMonth property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getProgramExpiryMonth() {
            return programExpiryMonth;
        }

        /**
         * Sets the value of the programExpiryMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setProgramExpiryMonth(Short value) {
            this.programExpiryMonth = value;
        }

        /**
         * Gets the value of the programExpiryYear property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getProgramExpiryYear() {
            return programExpiryYear;
        }

        /**
         * Sets the value of the programExpiryYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setProgramExpiryYear(Integer value) {
            this.programExpiryYear = value;
        }

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
     *         &lt;element name="name" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="address1" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue"/&gt;
     *         &lt;element name="address2" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="address3" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="city" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="postalCode" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="country" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="countrySubdivision" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}textValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}phoneValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/gpwebpay/additionalInfo/response/v1}emailValue" minOccurs="0"/&gt;
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
        "name",
        "address1",
        "address2",
        "address3",
        "city",
        "postalCode",
        "country",
        "countrySubdivision",
        "phone",
        "email"
    })
    public static class ShippingDetails {

        protected String name;
        @XmlElement(required = true)
        protected String address1;
        protected String address2;
        protected String address3;
        protected String city;
        protected String postalCode;
        protected String country;
        protected String countrySubdivision;
        protected String phone;
        protected String email;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the address1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress1() {
            return address1;
        }

        /**
         * Sets the value of the address1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress1(String value) {
            this.address1 = value;
        }

        /**
         * Gets the value of the address2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress2() {
            return address2;
        }

        /**
         * Sets the value of the address2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress2(String value) {
            this.address2 = value;
        }

        /**
         * Gets the value of the address3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress3() {
            return address3;
        }

        /**
         * Sets the value of the address3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress3(String value) {
            this.address3 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the countrySubdivision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountrySubdivision() {
            return countrySubdivision;
        }

        /**
         * Sets the value of the countrySubdivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountrySubdivision(String value) {
            this.countrySubdivision = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

    }

}
