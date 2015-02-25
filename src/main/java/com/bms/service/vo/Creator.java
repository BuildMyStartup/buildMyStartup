/**
 * Name			 : Creator
 * Description	 : 
 * Creation Date : 12/23/2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Creator extends UserProfile {
	
	private String companyName;
	private String website;
	private List<String> skills;
	private Experience experience;
	private Rate rate;
	private boolean availabilityStatus;
	private Date availabilityDate;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Experience getExperience() {
		return experience;
	}
	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public Date getAvailabilityDate() {
		return availabilityDate;
	}
	public void setAvailabilityDate(Date availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
	
	/**
	  * Intended only for debugging.
	  *
	  * <P>Here, the contents of every field are placed into the result, with
	  * one field per line.
	  */
	  @Override public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append("========Creator=============");
	    result.append("\nuserId: " + this.getUserId());
	    result.append("\nusername: " + this.getUserName());
	    result.append("\nfirstName: " + this.getFirstName());
	    result.append("\nmiddleName: " + this.getMiddleName());
	    result.append("\nlastName: " + this.getLastName());
	    result.append("\nSex: " + this.getSex().toString());
	    result.append("\nPhone: " + this.getPhoneNumber());
	    result.append("\nCreation Date: " + this.getCreationDate());
	    result.append("\nModification Date: " + this.getModificationDate());
	    result.append("\nDate of Birth: " + this.getDateOfBirth());
	    result.append("\nAccount Status: " + this.getAccountStatus().toString());
	    result.append("\nAddress: " + this.getAddress());
	    result.append("\nCompany Name: " + this.getCompanyName());
	    result.append("\nWebsite: " + this.getWebsite());
	    result.append("\nSkills: " + this.getSkills());
	    result.append("\nExperience: " + this.getExperience());
	    result.append("\nRate: " + this.getRate());
	    if(this.isAvailabilityStatus()){
	    	result.append("\nAvailability Status: Available");
	    }else{
	    	result.append("\nAvailability Status: Not Available");
	    }
	    result.append("\nAvailability Date: " + this.getAvailabilityDate());
	    result.append("\n============================");
	    return result.toString();
	  }
}
