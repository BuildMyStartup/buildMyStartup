/**
 * Name			 : DisplayProfileServiceImpl.java
 * Description	 : 
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service;

import static com.bms.common.CommonConstants.ACCOUNTSTATUS;
import static com.bms.common.CommonConstants.AVAILABILITYDATE;
import static com.bms.common.CommonConstants.AVAILABILITYSTATUS;
import static com.bms.common.CommonConstants.COMPANYNAME;
import static com.bms.common.CommonConstants.CREATIONDATE;
import static com.bms.common.CommonConstants.DATEOFBIRTH;
import static com.bms.common.CommonConstants.FIRSTNAME;
import static com.bms.common.CommonConstants.LASTNAME;
import static com.bms.common.CommonConstants.MIDDLENAME;
import static com.bms.common.CommonConstants.MODIFICATIONDATE;
import static com.bms.common.CommonConstants.PASSWORD;
import static com.bms.common.CommonConstants.PHONENUMBER;
import static com.bms.common.CommonConstants.PROJECTS;
import static com.bms.common.CommonConstants.SKILLS;
import static com.bms.common.CommonConstants.USERID;
import static com.bms.common.CommonConstants.USERNAME;
import static com.bms.common.CommonConstants.WEBSITE;
import static com.bms.common.CommonConstants.creatorFields;
import static com.bms.common.CommonConstants.ideatorFields;
import static com.bms.common.Utils.lookupInd;

import java.util.ArrayList;
import java.util.Date;

import jxl.Sheet;

import com.bms.common.CommonConstants.AccountStatus;
import com.bms.common.CommonConstants.Currency;
import com.bms.common.CommonConstants.Frequency;
import com.bms.common.CommonConstants.Sex;
import com.bms.dao.BaseDAO;
import com.bms.dao.CreatorDao;
import com.bms.dao.IdeatorDao;
import com.bms.service.vo.Address;
import com.bms.service.vo.Creator;
import com.bms.service.vo.Experience;
import com.bms.service.vo.Ideator;
import com.bms.service.vo.Rate;

public class DisplayProfileServiceImpl implements DisplayProfileService {
	
	private BaseDAO baseDAO;
	
	//TODO Change to autowired constructor on final implementation
	public DisplayProfileServiceImpl(){
		baseDAO = new BaseDAO();
	}
	
	
	@SuppressWarnings("deprecation")
	public Creator fetchCreatorProfile(String userName){
		
		/**
		 * We are currently showing hard coded data for only the first creator.
		 */
//		Creator creator = new Creator();
//		
//		creator.setUserName(getFieldValueForCreator(USERNAME));
//		creator.setPassword(getFieldValueForCreator(PASSWORD));
//		creator.setUserId(new Long(getFieldValueForCreator(USERID)));
//		creator.setAccountStatus(AccountStatus.valueOf(getFieldValueForCreator(ACCOUNTSTATUS).toUpperCase()));
//		creator.setCreationDate(new Date(getFieldValueForCreator(CREATIONDATE)));
//		creator.setModificationDate(new Date(getFieldValueForCreator(MODIFICATIONDATE)));
//		creator.setFirstName(getFieldValueForCreator(FIRSTNAME));
//		creator.setMiddleName(getFieldValueForCreator(MIDDLENAME));
//		creator.setLastName(getFieldValueForCreator(LASTNAME));
//		creator.setSex(Sex.MALE);
//		creator.setDateOfBirth(new Date(getFieldValueForCreator(DATEOFBIRTH)));
//		//TODO
//		Address address = new Address();
//		address.setStreetAddress("24 Abercane Lane");
//		address.setCity("Wallington");
//		address.setPostCode("Sm6 0PS");
//		creator.setAddress(address);
//		creator.setPhoneNumber(getFieldValueForCreator(PHONENUMBER));
//		creator.setCompanyName(getFieldValueForCreator(COMPANYNAME));
//		creator.setWebsite(getFieldValueForCreator(WEBSITE));
//		
//		ArrayList<String> skills = new ArrayList<String>();
//		skills.add(getFieldValueForCreator(SKILLS));
//		creator.setSkills(skills);
//		
//		Experience experience = new Experience();
//		experience.setMonths(5);
//		experience.setYears(8);
//		creator.setExperience(experience);
//		
//		Rate rate = new Rate();
//		rate.setAmount(350.0);
//		rate.setCurrency(Currency.GBP);
//		rate.setFrequency(Frequency.MONTHLY);
//		creator.setRate(rate );
//		
//		creator.setAvailabilityStatus(Boolean.valueOf(getFieldValueForCreator(AVAILABILITYSTATUS)));
//		creator.setAvailabilityDate(new Date(getFieldValueForCreator(AVAILABILITYDATE)));

//		return creator;
		CreatorDao creatorDao = new CreatorDao();
//		Creator creator1 = creatorDao.findCreatorByUserId(56789L);
		Creator creator1 = creatorDao.findCreatorByUserName("sachintendulkar");
		
     	System.out.println(creator1);
		return creator1;
		
	}

	@SuppressWarnings("deprecation")
	public Ideator fetchIdeatorProfile(String userName){
		
		/**
		 * We are currently showing hard coded data for only the first creator.
		 */
//		Ideator ideator = new Ideator();
		
//		ideator.setUserName(getFieldValueFromSheetForIdeator(USERNAME));
//		ideator.setPassword(getFieldValueFromSheetForIdeator(PASSWORD));
//		ideator.setUserId(new Long(getFieldValueFromSheetForIdeator(USERID)));
//		ideator.setAccountStatus(AccountStatus.valueOf(getFieldValueFromSheetForIdeator(ACCOUNTSTATUS).toUpperCase()));
//		ideator.setCreationDate(new Date(getFieldValueFromSheetForIdeator(CREATIONDATE)));
//		ideator.setModificationDate(new Date(getFieldValueFromSheetForIdeator(MODIFICATIONDATE)));
//		ideator.setFirstName(getFieldValueFromSheetForIdeator(FIRSTNAME));
//		ideator.setMiddleName(getFieldValueFromSheetForIdeator(MIDDLENAME));
//		ideator.setLastName(getFieldValueFromSheetForIdeator(LASTNAME));
//		ideator.setSex(Sex.MALE);
//		ideator.setDateOfBirth(new Date(getFieldValueFromSheetForIdeator(DATEOFBIRTH)));
//		//TODO
//		Address address = new Address();
//		address.setStreetAddress("24 Abercane Lane");
//		address.setCity("Wallington");
//		address.setPostCode("Sm6 0PS");
//		ideator.setAddress(address);
//		ideator.setPhoneNumber(getFieldValueFromSheetForIdeator(PHONENUMBER));
//		ideator.setCompanyName(getFieldValueFromSheetForIdeator(COMPANYNAME));
//		ideator.setWebsite(getFieldValueFromSheetForIdeator(WEBSITE));
//		
//		ArrayList<String> projects = new ArrayList<String>();
//		projects.add(getFieldValueFromSheetForIdeator(PROJECTS));
//		ideator.setProjects(projects );
//
//		return ideator;
		IdeatorDao ideatorDao = new IdeatorDao();
//		Creator creator1 = creatorDao.findCreatorByUserId(56789L);
		Ideator ideator1 = ideatorDao.findIdeatorByUserName("sauravganguly");
		
     	System.out.println(ideator1);
		return ideator1;
	}

	
	private String getFieldValueForCreator(String field) {
		
		String returnString = "Blank Return";
		Sheet creatorTblSheet = baseDAO.getCreatorsTblSheet();
		int lookupInd = lookupInd(creatorFields, field);
		int row = 1;
		
		if(-1 != lookupInd && null != creatorTblSheet){
			String contents = creatorTblSheet.getCell(lookupInd, row).getContents();
			if(null != contents){
				returnString = contents;
				}
			}
		return returnString;
	}
	
	private String getFieldValueFromSheetForIdeator(String field) {
		String returnString = "Blank Return";
		int lookupInd = lookupInd(ideatorFields, field);
		Sheet ideatorTblSheet = baseDAO.getIdeatorsTblSheet();
		int row = 1;
		
		if(-1 != lookupInd){
			String contents = ideatorTblSheet.getCell(lookupInd, row).getContents();
			if(null != contents){
				returnString = contents;
				}
			}
		return returnString;
	}
	

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}
}
