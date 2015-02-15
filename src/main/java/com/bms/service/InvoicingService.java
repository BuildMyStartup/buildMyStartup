/**
 * Name			 : InvoicingService.java
 * Description	 : 
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service;

import java.util.List;

import com.bms.service.vo.CustomerSelection;
import com.bms.service.vo.Invoice;
import com.bms.service.vo.ItemSelection;

//TODO - This is still kept in the package for BMS for reference functionality
public interface InvoicingService {
	
	public boolean sendInvoice(Invoice invoice);
	
	public List<CustomerSelection> getAvailableCustomers();
	
	public CustomerSelection getCustomerSelection(long customerId);
	
	public List<ItemSelection> getAvailableItems();
	
	public ItemSelection getItemSelection(long itemId);
}
