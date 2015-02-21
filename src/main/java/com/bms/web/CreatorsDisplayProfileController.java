/**
 * Name			 : CreatorsDisplayProfileController.java
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
import com.bms.service.vo.Creator;

@Controller
@RequestMapping("/displayCreator")
@SessionAttributes("creator")
public class CreatorsDisplayProfileController {

	private DisplayProfileService displayProfileService;
	
	@Autowired
	public CreatorsDisplayProfileController(DisplayProfileService displayProfile){
		this.displayProfileService = displayProfile;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model){
		Creator creator = new Creator();
		String userName = "saif.rizvi@gmail.com";
		Creator profile = displayProfileService.fetchCreatorProfile(userName);
		
		if(null != profile){
			creator = profile;
			System.out.println("Creator Name: " + creator.getFirstName());
		}
		model.addAttribute("creator", creator);
		return "displayCreator";
	}
	
}
