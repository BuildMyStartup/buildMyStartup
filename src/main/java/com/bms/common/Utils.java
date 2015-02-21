/**
 * Name			 : Utils.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.common;

import java.util.Map;


public final class Utils {

	/**
	 * 
	 * @param sheetTbl
	 * @param fieldName
	 * @return
	 */
	public static int lookupInd(Map<String, Integer> sheetTbl, String fieldName) {
		int lookupInd=-1;
		try {
			lookupInd=sheetTbl.get(fieldName).intValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lookupInd;
	}

}
