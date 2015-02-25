/**
 * Name			 : Ideator
 * Description	 : 
 * Creation Date : 12/23/2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bms.common.enums.AccountStatus;
import com.bms.common.enums.Sex;

public class Ideator extends UserProfile {
	
	private String companyName;
	private String website;
	private List<String> projects;
	
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
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	
	/**
	  * Intended only for debugging.
	  *
	  * <P>Here, the contents of every field are placed into the result, with
	  * one field per line.
	  */
	  @Override public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append("========Ideator=============");
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
	    result.append("\nProjects: " + this.getProjects());
	    result.append("\n============================");
	    return result.toString();
	  }
		
}
