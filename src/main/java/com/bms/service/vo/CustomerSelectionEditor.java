/**
 * Name			 : CustomerSelectionEditor.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service.vo;

import java.beans.PropertyEditorSupport;

import com.bms.service.InvoicingService;

//TODO - This is still kept in the package for BMS for reference functionality
public class CustomerSelectionEditor extends PropertyEditorSupport {

	private InvoicingService invoiceService;
	
	public CustomerSelectionEditor(InvoicingService invoiceService){
		this.invoiceService = invoiceService;
	}
	
	public void setAsText(String text){
		long customerId = Long.parseLong(text);
		CustomerSelection customerSelection = invoiceService.getCustomerSelection(customerId);
		setValue(customerSelection);
	}
}
