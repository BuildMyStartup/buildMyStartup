/**
 * Name			 : Rate.java
 * Description	 : 
 * Creation Date : Feb 6, 2015
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import com.bms.common.CommonConstants.Currency;
import com.bms.common.CommonConstants.Frequency;

public class Rate {
	
	private double amount;
	private Currency currency;
	private Frequency frequency;
	
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
}
