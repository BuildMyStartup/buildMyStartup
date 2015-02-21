/**
 * Name			 : BaseDAO.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.bms.dao;

import static com.bms.common.CommonConstants.DATA_STORE_PATH;
import static com.bms.common.CommonConstants.SPREADSHEET_CREATOR;
import static com.bms.common.CommonConstants.SPREADSHEET_IDEATOR;
import static com.bms.common.CommonConstants.SPREADSHEET_PROJECT;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * Till the backend DB integration is not complete this is being used as the data store in a relational manner.
 * Display Profile Pages of the Creators & Ideators will show data which is in these sheets.
 */
public class BaseDAO {

	private File bmsDataSource;
	private Workbook dbWorkbook; //Workbook.getWorkbook(new File(excelWbName)); 
	private Sheet ideatorTblSheet; //dbWorkbook.getSheet(excelSpreadsheet);
	private Sheet creatorTblSheet;
	private Sheet projectTblSheet;
	
	public BaseDAO() {
		bmsDataSource = new File(DATA_STORE_PATH);
		try {
			dbWorkbook = Workbook.getWorkbook(bmsDataSource);
		} catch (BiffException | IOException e) {
			// TODO implement logging framework
			System.out.println("Please Map the path for Data Store Excel correctly in Common Constants: Variable DATA_STORE_PATH");
			e.printStackTrace();
		}
		ideatorTblSheet = dbWorkbook.getSheet(SPREADSHEET_IDEATOR);
		creatorTblSheet = dbWorkbook.getSheet(SPREADSHEET_CREATOR);
		projectTblSheet = dbWorkbook.getSheet(SPREADSHEET_PROJECT);
		
		}
	
//	public static void main(String args[]) throws BiffException, IOException, URISyntaxException{
//		BaseDAO baseDAO = new BaseDAO();
//		System.out.println(baseDAO.getBmsDataSource().getName());
//		System.out.println(baseDAO.getDbWorkbook().getVersion());
//		System.out.println(baseDAO.getIdeatorTblSheet().getRows());
//		System.out.println(baseDAO.getCreatorTblSheet().getColumns());
//		System.out.println(baseDAO.getProjectTblSheet().getSettings());
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

	public Sheet getIdeatorTblSheet() {
		return ideatorTblSheet;
	}

	public void setIdeatorTblSheet(Sheet ideatorTblSheet) {
		this.ideatorTblSheet = ideatorTblSheet;
	}

	public Sheet getCreatorTblSheet() {
		return creatorTblSheet;
	}

	public void setCreatorTblSheet(Sheet creatorTblSheet) {
		this.creatorTblSheet = creatorTblSheet;
	}

	public Sheet getProjectTblSheet() {
		return projectTblSheet;
	}

	public void setProjectTblSheet(Sheet projectTblSheet) {
		this.projectTblSheet = projectTblSheet;
	}

}
