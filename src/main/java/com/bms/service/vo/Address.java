/**
 * Name			 : Address.java
 * Description	 : This is to contain the address field.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import com.bms.common.enums.Country;



public class Address {
	private long userId;
	private String streetAddress;
	private String postCode;
	private String city;
	private Country country;
	private String additionalInfo;
	private UserProfile userProfile;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	/**
	  * Intended only for debugging.
	  *
	  * <P>Here, the contents of every field are placed into the result, with
	  * one field per line.
	  */
	  @Override public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append("\n++++++++++++++++++++++++++++");
	    result.append("\nStreet Address: " + this.getStreetAddress());
	    result.append("\nPost Code: " + this.getCity());
	    result.append("\nCity: " + this.getCity());
	    result.append("\nCountry: " + this.getCountry());
	    result.append("\nAdditional Info: " + this.getAdditionalInfo());
	    result.append("\n++++++++++++++++++++++++++++");
	    return result.toString();
	  }
	
}
