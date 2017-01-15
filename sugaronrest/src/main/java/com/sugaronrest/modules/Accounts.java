/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten. Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template file) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0.0
* @since   2017-01-03
*
* A class which represents the accounts table.
*/

package com.sugaronrest.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sugaronrest.restapicalls.Module;
import com.sugaronrest.restapicalls.CustomDateDeserializer;
import com.sugaronrest.restapicalls.CustomDateSerializer;

import java.util.Date;

@Module(name = "Accounts", tablename = "accounts")
@JsonRootName(value = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String value) {
        modifiedUserId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String value) {
        accountType = value;
    }
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String value) {
        industry = value;
    }
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String value) {
        annualRevenue = value;
    }
    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String value) {
        phoneFax = value;
    }
    public String getBillingAddressStreet() {
        return billingAddressStreet;
    }

    public void setBillingAddressStreet(String value) {
        billingAddressStreet = value;
    }
    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    public void setBillingAddressCity(String value) {
        billingAddressCity = value;
    }
    public String getBillingAddressState() {
        return billingAddressState;
    }

    public void setBillingAddressState(String value) {
        billingAddressState = value;
    }
    public String getBillingAddressPostalcode() {
        return billingAddressPostalcode;
    }

    public void setBillingAddressPostalcode(String value) {
        billingAddressPostalcode = value;
    }
    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    public void setBillingAddressCountry(String value) {
        billingAddressCountry = value;
    }
    public String getRating() {
        return rating;
    }

    public void setRating(String value) {
        rating = value;
    }
    public String getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(String value) {
        phoneOffice = value;
    }
    public String getPhoneAlternate() {
        return phoneAlternate;
    }

    public void setPhoneAlternate(String value) {
        phoneAlternate = value;
    }
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String value) {
        website = value;
    }
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String value) {
        ownership = value;
    }
    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String value) {
        employees = value;
    }
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String value) {
        tickerSymbol = value;
    }
    public String getShippingAddressStreet() {
        return shippingAddressStreet;
    }

    public void setShippingAddressStreet(String value) {
        shippingAddressStreet = value;
    }
    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String value) {
        shippingAddressCity = value;
    }
    public String getShippingAddressState() {
        return shippingAddressState;
    }

    public void setShippingAddressState(String value) {
        shippingAddressState = value;
    }
    public String getShippingAddressPostalcode() {
        return shippingAddressPostalcode;
    }

    public void setShippingAddressPostalcode(String value) {
        shippingAddressPostalcode = value;
    }
    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    public void setShippingAddressCountry(String value) {
        shippingAddressCountry = value;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String value) {
        parentId = value;
    }
    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String value) {
        sicCode = value;
    }
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String value) {
        campaignId = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("account_type")
    private String accountType;
  
    @JsonProperty("industry")
    private String industry;
  
    @JsonProperty("annual_revenue")
    private String annualRevenue;
  
    @JsonProperty("phone_fax")
    private String phoneFax;
  
    @JsonProperty("billing_address_street")
    private String billingAddressStreet;
  
    @JsonProperty("billing_address_city")
    private String billingAddressCity;
  
    @JsonProperty("billing_address_state")
    private String billingAddressState;
  
    @JsonProperty("billing_address_postalcode")
    private String billingAddressPostalcode;
  
    @JsonProperty("billing_address_country")
    private String billingAddressCountry;
  
    @JsonProperty("rating")
    private String rating;
  
    @JsonProperty("phone_office")
    private String phoneOffice;
  
    @JsonProperty("phone_alternate")
    private String phoneAlternate;
  
    @JsonProperty("website")
    private String website;
  
    @JsonProperty("ownership")
    private String ownership;
  
    @JsonProperty("employees")
    private String employees;
  
    @JsonProperty("ticker_symbol")
    private String tickerSymbol;
  
    @JsonProperty("shipping_address_street")
    private String shippingAddressStreet;
  
    @JsonProperty("shipping_address_city")
    private String shippingAddressCity;
  
    @JsonProperty("shipping_address_state")
    private String shippingAddressState;
  
    @JsonProperty("shipping_address_postalcode")
    private String shippingAddressPostalcode;
  
    @JsonProperty("shipping_address_country")
    private String shippingAddressCountry;
  
    @JsonProperty("parent_id")
    private String parentId;
  
    @JsonProperty("sic_code")
    private String sicCode;
  
    @JsonProperty("campaign_id")
    private String campaignId;
  
}
