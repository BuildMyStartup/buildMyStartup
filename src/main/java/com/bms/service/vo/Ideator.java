/**
 * Name			 : Ideator
 * Description	 : 
 * Creation Date : 12/23/2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import java.util.ArrayList;

public class Ideator extends UserProfile {
	
	private String companyName;
	private String website;
	private ArrayList<String> projects;
	
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
	public ArrayList<String> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<String> projects) {
		this.projects = projects;
	}
}
