/**
 * Name			 : IdeatorsDisplayProfileController.java
 * Description	 : 
 * Creation Date : Dec 24, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bms.service.DisplayProfileService;
import com.bms.service.vo.Ideator;

@Controller
@RequestMapping("/displayIdeator")
@SessionAttributes("ideator")
public class IdeatorsDisplayProfileController {

	private DisplayProfileService displayProfileService;
	
	@Autowired
	public IdeatorsDisplayProfileController(DisplayProfileService displayProfile){
		this.displayProfileService = displayProfile;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model){
		Ideator ideator = new Ideator();
		String userName = "saif.rizvi@gmail.com";
		Ideator profile = displayProfileService.fetchIdeatorProfile(userName);
		
		if(null != profile){
			ideator = profile;
			System.out.println("Creator Name: " + ideator.getFirstName());
		}
		model.addAttribute("ideator", ideator);
		return "displayIdeator";
	}
}
