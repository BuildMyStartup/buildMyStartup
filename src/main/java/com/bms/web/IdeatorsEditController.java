/**
 * Name			 : IdeatorsEditController.java
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

import com.bms.service.vo.Ideator;

@Controller
@SessionAttributes("ideator")
public class IdeatorsEditController {

	@RequestMapping(value = "/editIdeator", method = RequestMethod.GET)
	public String items(Model model){
		Ideator ideator = new Ideator();
		model.addAttribute("ideator", ideator);
		return "editIdeator";
	}
	
	@RequestMapping(value = "/ideatorEditSuccess", method= RequestMethod.GET)
	public String invoiceSentSuccess(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "ideatorEditSuccess";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("ideator") Ideator ideator, BindingResult result, SessionStatus status){
		
		boolean success = true; 
		
		System.out.println("First Name : " + ideator.getFirstName());
		System.out.println("Middle Name : " + ideator.getMiddleName());
		System.out.println("Last Name : " + ideator.getLastName());
		System.out.println("Sex : " + ideator.getSex());
		System.out.println("Date Of Birth : " + ideator.getDateOfBirth());
		System.out.println("Street Address : " + ideator.getAddress().getStreetAddress());
		System.out.println("Post Code : " + ideator.getAddress().getPostCode());
		System.out.println("City : " + ideator.getAddress().getCity());
		System.out.println("Country : " + ideator.getAddress().getCountry());
		System.out.println("Phone Number : " + ideator.getPhoneNumber());
		System.out.println("Company Name : " + ideator.getCompanyName());
		System.out.println("Website : " + ideator.getWebsite());
		
		String redirect = (success) ? "redirect:ideatorEditSuccess": "redirect:editIdeator";
		
		System.out.println("Redirect : " + redirect);
		
		return redirect;
	}

}
