/**
 * Name			 : BaseDAO.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.dao;

import static com.bms.common.CommonConstants.DATA_STORE_PATH;
import static com.bms.common.CommonConstants.SPREADSHEET_CREATORS;
import static com.bms.common.CommonConstants.SPREADSHEET_IDEATORS;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//TODO - This is still kept in the package for BMS for reference functionality
public class BaseDAO {

	private File bmsDataSource;
	private Workbook dbWorkbook; //Workbook.getWorkbook(new File(excelWbName)); 
	private Sheet ideatorsTblSheet; //dbWorkbook.getSheet(excelSpreadsheet);
	private Sheet creatorsTblSheet;
	
	public BaseDAO() {
		bmsDataSource = new File(DATA_STORE_PATH);
		try {
			dbWorkbook = Workbook.getWorkbook(bmsDataSource);
		} catch (BiffException | IOException e) {
			// TODO implement logging framework
			e.printStackTrace();
		}
		ideatorsTblSheet = dbWorkbook.getSheet(SPREADSHEET_IDEATORS);
		creatorsTblSheet = dbWorkbook.getSheet(SPREADSHEET_CREATORS);
		
		}
	
//	public static void main(String args[]) throws BiffException, IOException, URISyntaxException{
//		BaseDAO baseDAO = new BaseDAO();
//		System.out.println(baseDAO.getIdeatorsTblSheet().getName());
//		System.out.println(baseDAO.getDbWorkbook().getVersion());
//		System.out.println(baseDAO.getCreatorsTblSheet().getRows());
//	}

	public File getBmsDataSource() {
		return bmsDataSource;
	}

	public void setBmsDataSource(File bmsDataSource) {
		this.bmsDataSource = bmsDataSource;
	}

	public Workbook getDbWorkbook() {
		return dbWorkbook;
	}

	public void setDbWorkbook(Workbook dbWorkbook) {
		this.dbWorkbook = dbWorkbook;
	}

	public Sheet getIdeatorsTblSheet() {
		return ideatorsTblSheet;
	}

	public void setIdeatorsTblSheet(Sheet ideatorsTblSheet) {
		this.ideatorsTblSheet = ideatorsTblSheet;
	}

	public Sheet getCreatorsTblSheet() {
		return creatorsTblSheet;
	}

	public void setCreatorsTblSheet(Sheet creatorsTblSheet) {
		this.creatorsTblSheet = creatorsTblSheet;
	}
	
}
