/**
 * Name			 : DisplayProfileService.java
 * Description	 : 
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.service;

import com.bms.service.vo.Creator;
import com.bms.service.vo.Ideator;

public interface DisplayProfileService {
	
	public Creator fetchCreatorProfile(String userName);
	
	public Ideator fetchIdeatorProfile(String userName);
}
