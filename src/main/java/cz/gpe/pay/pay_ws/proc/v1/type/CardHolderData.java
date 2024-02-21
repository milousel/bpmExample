
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardHolderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardHolderData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardholderDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}NameValue"/&gt;
 *                   &lt;element name="loginId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
 *                   &lt;element name="loginType" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}LoginTypeValue" minOccurs="0"/&gt;
 *                   &lt;element name="loginTime" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}LoginTimeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountIdValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountCreatedDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountAgeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountLastChangeDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountLastChangeAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountLastChangeAgeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountPasswordChangeDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
 *                   &lt;element name="userAccountPasswordChangeAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountPasswordChangeAgeValue" minOccurs="0"/&gt;
 *                   &lt;element name="socialNetworkId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email"/&gt;
 *                   &lt;element name="phoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="mobilePhoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
 *                   &lt;element name="mobilePhone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="workPhoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
 *                   &lt;element name="workPhone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="clientIpAddress" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}IpValue" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressMatch" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressMatchValue" minOccurs="0"/&gt;
 *         &lt;element name="billingDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue"/&gt;
 *                   &lt;element name="address1" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue"/&gt;
 *                   &lt;element name="address2" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
 *                   &lt;element name="address3" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
 *                   &lt;element name="city" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CityValue"/&gt;
 *                   &lt;element name="postalCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PostalCodeValue"/&gt;
 *                   &lt;element name="country" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountryValue"/&gt;
 *                   &lt;element name="countrySubdivision" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountrySubdivisionValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
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
 *                   &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue"/&gt;
 *                   &lt;element name="address1" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue"/&gt;
 *                   &lt;element name="address2" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
 *                   &lt;element name="address3" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
 *                   &lt;element name="city" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CityValue"/&gt;
 *                   &lt;element name="postalCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PostalCodeValue"/&gt;
 *                   &lt;element name="country" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountryValue"/&gt;
 *                   &lt;element name="countrySubdivision" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountrySubdivisionValue" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
 *                   &lt;element name="method" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
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
@XmlType(name = "CardHolderData", propOrder = {
    "cardholderDetails",
    "addressMatch",
    "billingDetails",
    "shippingDetails"
})
public class CardHolderData {

    protected CardHolderData.CardholderDetails cardholderDetails;
    @XmlSchemaType(name = "string")
    protected AddressMatchValue addressMatch;
    protected CardHolderData.BillingDetails billingDetails;
    protected CardHolderData.ShippingDetails shippingDetails;

    /**
     * Gets the value of the cardholderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderData.CardholderDetails }
     *     
     */
    public CardHolderData.CardholderDetails getCardholderDetails() {
        return cardholderDetails;
    }

    /**
     * Sets the value of the cardholderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderData.CardholderDetails }
     *     
     */
    public void setCardholderDetails(CardHolderData.CardholderDetails value) {
        this.cardholderDetails = value;
    }

    /**
     * Gets the value of the addressMatch property.
     * 
     * @return
     *     possible object is
     *     {@link AddressMatchValue }
     *     
     */
    public AddressMatchValue getAddressMatch() {
        return addressMatch;
    }

    /**
     * Sets the value of the addressMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressMatchValue }
     *     
     */
    public void setAddressMatch(AddressMatchValue value) {
        this.addressMatch = value;
    }

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderData.BillingDetails }
     *     
     */
    public CardHolderData.BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderData.BillingDetails }
     *     
     */
    public void setBillingDetails(CardHolderData.BillingDetails value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderData.ShippingDetails }
     *     
     */
    public CardHolderData.ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderData.ShippingDetails }
     *     
     */
    public void setShippingDetails(CardHolderData.ShippingDetails value) {
        this.shippingDetails = value;
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
     *         &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue"/&gt;
     *         &lt;element name="address1" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue"/&gt;
     *         &lt;element name="address2" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
     *         &lt;element name="address3" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
     *         &lt;element name="city" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CityValue"/&gt;
     *         &lt;element name="postalCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PostalCodeValue"/&gt;
     *         &lt;element name="country" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountryValue"/&gt;
     *         &lt;element name="countrySubdivision" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountrySubdivisionValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
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

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String address1;
        protected String address2;
        protected String address3;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String postalCode;
        @XmlElement(required = true)
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
     *         &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}NameValue"/&gt;
     *         &lt;element name="loginId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
     *         &lt;element name="loginType" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}LoginTypeValue" minOccurs="0"/&gt;
     *         &lt;element name="loginTime" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}LoginTimeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountIdValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountCreatedDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountAgeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountLastChangeDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountLastChangeAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountLastChangeAgeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountPasswordChangeDate" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}DateTypeValue" minOccurs="0"/&gt;
     *         &lt;element name="userAccountPasswordChangeAge" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}UserAccountPasswordChangeAgeValue" minOccurs="0"/&gt;
     *         &lt;element name="socialNetworkId" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email"/&gt;
     *         &lt;element name="phoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
     *         &lt;element name="mobilePhoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
     *         &lt;element name="mobilePhone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
     *         &lt;element name="workPhoneCountry" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneCountryValue" minOccurs="0"/&gt;
     *         &lt;element name="workPhone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
     *         &lt;element name="clientIpAddress" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}IpValue" minOccurs="0"/&gt;
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
        "loginId",
        "loginType",
        "loginTime",
        "userAccountId",
        "userAccountCreatedDate",
        "userAccountAge",
        "userAccountLastChangeDate",
        "userAccountLastChangeAge",
        "userAccountPasswordChangeDate",
        "userAccountPasswordChangeAge",
        "socialNetworkId",
        "email",
        "phoneCountry",
        "phone",
        "mobilePhoneCountry",
        "mobilePhone",
        "workPhoneCountry",
        "workPhone",
        "clientIpAddress"
    })
    public static class CardholderDetails {

        @XmlElement(required = true)
        protected String name;
        protected String loginId;
        protected String loginType;
        protected String loginTime;
        protected String userAccountId;
        protected String userAccountCreatedDate;
        protected String userAccountAge;
        protected String userAccountLastChangeDate;
        protected String userAccountLastChangeAge;
        protected String userAccountPasswordChangeDate;
        protected String userAccountPasswordChangeAge;
        protected String socialNetworkId;
        @XmlElement(required = true)
        protected String email;
        protected String phoneCountry;
        protected String phone;
        protected String mobilePhoneCountry;
        protected String mobilePhone;
        protected String workPhoneCountry;
        protected String workPhone;
        protected String clientIpAddress;

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
         * Gets the value of the loginId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoginId() {
            return loginId;
        }

        /**
         * Sets the value of the loginId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoginId(String value) {
            this.loginId = value;
        }

        /**
         * Gets the value of the loginType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoginType() {
            return loginType;
        }

        /**
         * Sets the value of the loginType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoginType(String value) {
            this.loginType = value;
        }

        /**
         * Gets the value of the loginTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoginTime() {
            return loginTime;
        }

        /**
         * Sets the value of the loginTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoginTime(String value) {
            this.loginTime = value;
        }

        /**
         * Gets the value of the userAccountId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountId() {
            return userAccountId;
        }

        /**
         * Sets the value of the userAccountId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountId(String value) {
            this.userAccountId = value;
        }

        /**
         * Gets the value of the userAccountCreatedDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountCreatedDate() {
            return userAccountCreatedDate;
        }

        /**
         * Sets the value of the userAccountCreatedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountCreatedDate(String value) {
            this.userAccountCreatedDate = value;
        }

        /**
         * Gets the value of the userAccountAge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountAge() {
            return userAccountAge;
        }

        /**
         * Sets the value of the userAccountAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountAge(String value) {
            this.userAccountAge = value;
        }

        /**
         * Gets the value of the userAccountLastChangeDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountLastChangeDate() {
            return userAccountLastChangeDate;
        }

        /**
         * Sets the value of the userAccountLastChangeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountLastChangeDate(String value) {
            this.userAccountLastChangeDate = value;
        }

        /**
         * Gets the value of the userAccountLastChangeAge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountLastChangeAge() {
            return userAccountLastChangeAge;
        }

        /**
         * Sets the value of the userAccountLastChangeAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountLastChangeAge(String value) {
            this.userAccountLastChangeAge = value;
        }

        /**
         * Gets the value of the userAccountPasswordChangeDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountPasswordChangeDate() {
            return userAccountPasswordChangeDate;
        }

        /**
         * Sets the value of the userAccountPasswordChangeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountPasswordChangeDate(String value) {
            this.userAccountPasswordChangeDate = value;
        }

        /**
         * Gets the value of the userAccountPasswordChangeAge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAccountPasswordChangeAge() {
            return userAccountPasswordChangeAge;
        }

        /**
         * Sets the value of the userAccountPasswordChangeAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAccountPasswordChangeAge(String value) {
            this.userAccountPasswordChangeAge = value;
        }

        /**
         * Gets the value of the socialNetworkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSocialNetworkId() {
            return socialNetworkId;
        }

        /**
         * Sets the value of the socialNetworkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSocialNetworkId(String value) {
            this.socialNetworkId = value;
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

        /**
         * Gets the value of the phoneCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneCountry() {
            return phoneCountry;
        }

        /**
         * Sets the value of the phoneCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneCountry(String value) {
            this.phoneCountry = value;
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
         * Gets the value of the mobilePhoneCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilePhoneCountry() {
            return mobilePhoneCountry;
        }

        /**
         * Sets the value of the mobilePhoneCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilePhoneCountry(String value) {
            this.mobilePhoneCountry = value;
        }

        /**
         * Gets the value of the mobilePhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilePhone() {
            return mobilePhone;
        }

        /**
         * Sets the value of the mobilePhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilePhone(String value) {
            this.mobilePhone = value;
        }

        /**
         * Gets the value of the workPhoneCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkPhoneCountry() {
            return workPhoneCountry;
        }

        /**
         * Sets the value of the workPhoneCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkPhoneCountry(String value) {
            this.workPhoneCountry = value;
        }

        /**
         * Gets the value of the workPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkPhone() {
            return workPhone;
        }

        /**
         * Sets the value of the workPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkPhone(String value) {
            this.workPhone = value;
        }

        /**
         * Gets the value of the clientIpAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientIpAddress() {
            return clientIpAddress;
        }

        /**
         * Sets the value of the clientIpAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientIpAddress(String value) {
            this.clientIpAddress = value;
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
     *         &lt;element name="name" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue"/&gt;
     *         &lt;element name="address1" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue"/&gt;
     *         &lt;element name="address2" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
     *         &lt;element name="address3" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AddressValue" minOccurs="0"/&gt;
     *         &lt;element name="city" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CityValue"/&gt;
     *         &lt;element name="postalCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PostalCodeValue"/&gt;
     *         &lt;element name="country" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountryValue"/&gt;
     *         &lt;element name="countrySubdivision" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CountrySubdivisionValue" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}PhoneValue" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}Email" minOccurs="0"/&gt;
     *         &lt;element name="method" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}TextValue" minOccurs="0"/&gt;
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
        "email",
        "method"
    })
    public static class ShippingDetails {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String address1;
        protected String address2;
        protected String address3;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String postalCode;
        @XmlElement(required = true)
        protected String country;
        protected String countrySubdivision;
        protected String phone;
        protected String email;
        protected String method;

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

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

    }

}
