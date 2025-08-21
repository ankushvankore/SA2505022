package com.TestNGDemo;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D15LoginToOHRM_DDF {
	String fPath = "ExcelFiles\\LoginData_OHRM.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps, String rs) {
		System.out.println(un);
		System.out.println(ps);
		System.out.println(rs);
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] getLoginData() {
		String[][]loginData = new String[7][3];
		
		for(int i = 0; i < 7; i++)
		{
			row = sheet.getRow(i);
			for(int j = 0; j < 3; j++)
			{
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		return loginData;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);	
		sheet = wb.getSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
