/**
 * Name			 : CommonConstants.java
 * Description	 : This class is used to contain all the constants to be used commonly across the project.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CommonConstants {

	/**
	 * Object Model constants
	 */
	public enum Frequency {
	    HOURLY, DAILY, WEEKLY, MONTHLY, FIXED_PRICE_PROJECT; 
	}
	
	public enum EntityType {
	    BUSINESS, INDIVIDUAL; 
	}
	
	public enum Country {
	    UNITED_KINGDOM, INDIA, USA, OTHERS; 
	}
	
	public enum Currency {
	    GBP, INR, USD; 
	}
	
	public enum AccountStatus{
		ACTIVE, SUSPENDED, TERMINATED;
	}
	
	public enum Sex{
		MALE, FEMALE, OTHERS;
	}
	
	
	/**
	 * Datasource constants
	 */
	public static final String SPREADSHEET_PROJECT = "Project";
	public static final String SPREADSHEET_CREATOR = "Creator";
	public static final String SPREADSHEET_IDEATOR = "Ideator";
	public static final String DATA_STORE_PATH = "C:\\work\\git\\BuildMyStartup\\buildMyStartup\\src\\main\\resources\\BMSDataStore.xls";
	
	public static final String SNO = "s.No.";
	public static final String USERNAME = "userName";
	public static final String PASSWORD = "password";
	public static final String USERID = "userId";
	public static final String ACCOUNTSTATUS = "accountStatus";
	public static final String CREATIONDATE = "creationDate";
	public static final String MODIFICATIONDATE = "modificationDate";
	public static final String FIRSTNAME = "firstName";
	public static final String MIDDLENAME = "middleName";
	public static final String LASTNAME = "lastName";
	public static final String SEX = "sex";
	public static final String DATEOFBIRTH = "dateOfBirth";
	public static final String ADDRESS = "address";
	public static final String PHONENUMBER = "phoneNumber";
	
	public static final String COMPANYNAME = "companyName";
	public static final String WEBSITE = "website";
	
	public static final String SKILLS = "skills";
	public static final String EXPERIENCE = "experience";
	public static final String RATE = "rate";
	public static final String AVAILABILITYSTATUS = "availabilityStatus";
	public static final String AVAILABILITYDATE = "availabilityDate";

	public static final String PROJECTS = "projects";
	
	
	public static Map<String, Integer> ideatorFields = new HashMap<String, Integer>();
	public static Map<String, Integer> creatorFields = new HashMap<String, Integer>();
	
	static{
		Map<String, Integer> tmpMap1 = new HashMap<String, Integer>();
		
		tmpMap1.put(SNO, new Integer(0));
		tmpMap1.put(USERNAME, new Integer(1));
		tmpMap1.put(PASSWORD, new Integer(2));
		tmpMap1.put(USERID, new Integer(3));
		tmpMap1.put(ACCOUNTSTATUS, new Integer(4));
		tmpMap1.put(CREATIONDATE, new Integer(5));
		tmpMap1.put(MODIFICATIONDATE, new Integer(6));
		tmpMap1.put(FIRSTNAME, new Integer(7));
		tmpMap1.put(MIDDLENAME, new Integer(8));
		tmpMap1.put(LASTNAME, new Integer(9));
		tmpMap1.put(SEX, new Integer(10));
		tmpMap1.put(DATEOFBIRTH, new Integer(11));
		tmpMap1.put(ADDRESS, new Integer(12));
		tmpMap1.put(PHONENUMBER, new Integer(13));
		tmpMap1.put(COMPANYNAME, new Integer(14));
		tmpMap1.put(WEBSITE, new Integer(15));
		tmpMap1.put(PROJECTS, new Integer(16));
			
		ideatorFields = Collections.unmodifiableMap(tmpMap1);
		
		Map<String, Integer> tmpMap2 = new HashMap<String, Integer>();
		
		tmpMap2.put(SNO, new Integer(0));
		tmpMap2.put(USERNAME, new Integer(1));
		tmpMap2.put(PASSWORD, new Integer(2));
		tmpMap2.put(USERID, new Integer(3));
		tmpMap2.put(ACCOUNTSTATUS, new Integer(4));
		tmpMap2.put(CREATIONDATE, new Integer(5));
		tmpMap2.put(MODIFICATIONDATE, new Integer(6));
		tmpMap2.put(FIRSTNAME, new Integer(7));
		tmpMap2.put(MIDDLENAME, new Integer(8));
		tmpMap2.put(LASTNAME, new Integer(9));
		tmpMap2.put(SEX, new Integer(10));
		tmpMap2.put(DATEOFBIRTH, new Integer(11));
		tmpMap2.put(ADDRESS, new Integer(12));
		tmpMap2.put(PHONENUMBER, new Integer(13));
		tmpMap2.put(COMPANYNAME, new Integer(14));
		tmpMap2.put(WEBSITE, new Integer(15));
		tmpMap2.put(SKILLS, new Integer(16));
		tmpMap2.put(EXPERIENCE, new Integer(17));
		tmpMap2.put(RATE, new Integer(18));
		tmpMap2.put(AVAILABILITYSTATUS, new Integer(19));
		tmpMap2.put(AVAILABILITYDATE, new Integer(20));
		
		
		creatorFields = Collections.unmodifiableMap(tmpMap2);
		
	}
	
}
