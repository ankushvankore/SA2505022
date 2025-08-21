package com.TestNGDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D12CreateFriendsData {
	String fPath = "ExcelFiles\\FriendsData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void createData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Ankita");
		
		cell = row.createCell(1);
		cell.setCellValue("Kabra");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Jainal");
		
		cell = row.createCell(1);
		cell.setCellValue("Panchal");
		
		sheet.createRow(2).createCell(0).setCellValue("Vrushika");
		sheet.getRow(2).createCell(1).setCellValue("Hingu");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
