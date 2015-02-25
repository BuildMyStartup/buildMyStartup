/**
 * Name			 : Experience.java
 * Description	 : 
 * Creation Date : Feb 6, 2015
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

public class Experience {

	private long userId;
	private int years;
	private int months;
	private UserProfile userProfile;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	
	
	/**
	  * Intended only for debugging.
	  *
	  */
	  @Override public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append(this.getYears() + " years, " + this.getMonths() + " months.");
	    return result.toString();
	  }
}
