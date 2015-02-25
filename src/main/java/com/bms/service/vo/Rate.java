/**
 * Name			 : Rate.java
 * Description	 : 
 * Creation Date : Feb 6, 2015
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import com.bms.common.enums.Currency;
import com.bms.common.enums.Frequency;



public class Rate {
	private long userId;
	private double amount;
	private Currency currency;
	private Frequency frequency;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	
	
	/**
	  * Intended only for debugging.
	  *
	  */
	  @Override public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append(this.getAmount() + " on " + this.frequency + " basis in " + this.getCurrency());
	    return result.toString();
	  }
}
