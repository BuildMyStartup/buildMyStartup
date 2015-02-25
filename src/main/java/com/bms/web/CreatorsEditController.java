/**
 * Name			 : CreatorsEditController.java
 * Description	 : 
 * Creation Date : Dec 24, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bms.dao.CreatorDao;
import com.bms.dao.IdeatorDao;
import com.bms.service.vo.Creator;

@Controller
@SessionAttributes("creator")
public class CreatorsEditController {

	@RequestMapping(value = "/editCreator", method = RequestMethod.GET)
	public String items(Model model){
//		Creator creator = new Creator();
		CreatorDao creatorDao = new CreatorDao();
		Creator creator = creatorDao.findCreatorByUserName("sachintendulkar");
		model.addAttribute("creator", creator);
		return "editCreator";
	}
	
	@RequestMapping(value = "/creatorEditSuccess", method= RequestMethod.GET)
	public String invoiceSentSuccess(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "creatorEditSuccess";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("creator") Creator creator, BindingResult result, SessionStatus status){
		
		boolean success = true; 
		System.out.println("After update: " + creator);
//		System.out.println("First Name : " + creator.getFirstName());
//		System.out.println("Middle Name : " + creator.getMiddleName());
//		System.out.println("Last Name : " + creator.getLastName());
//		System.out.println("Sex : " + creator.getSex());
//		System.out.println("Date Of Birth : " + creator.getDateOfBirth());
//		System.out.println("Street Address : " + creator.getAddress().getStreetAddress());
//		System.out.println("Post Code : " + creator.getAddress().getPostCode());
//		System.out.println("City : " + creator.getAddress().getCity());
//		System.out.println("Country : " + creator.getAddress().getCountry());
//		System.out.println("Phone Number : " + creator.getPhoneNumber());
//		System.out.println("Company Name : " + creator.getCompanyName());
//		System.out.println("Website : " + creator.getWebsite());
//		System.out.println("Skills : " + creator.getSkills().get(0));
//		System.out.println("Experience Years : " + creator.getExperience().getYears());
//		System.out.println("Experience Months : " + creator.getExperience().getMonths());
//		System.out.println("Rates Amount: " + creator.getRate().getAmount() + " Currency: "+ creator.getRate().getCurrency() + " Frequency: "+creator.getRate().getFrequency());
//		System.out.println("Availability Status: " + creator.isAvailabilityStatus());
//		System.out.println("Availability Date: " + creator.getAvailabilityDate());
		
		CreatorDao creatorDao = new CreatorDao();
		creatorDao.persist(creator);
		
		String redirect = (success) ? "redirect:creatorEditSuccess": "redirect:editCreator";
		
		System.out.println("Redirect : " + redirect);
		
		return redirect;
	}

}
