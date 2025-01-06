package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	//make this a static method so you don't have to create an object of this method
	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		
		//create a file object that will reference an excel file
		File file = new File("D:\\selenium-java\\javacode\\TestData.xlsx");
		
		//create workbook object
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//create a sheet object and get the first sheet index 0
		XSSFSheet sheet = book.getSheetAt(0);
		
		//specify row and cell number to get the data
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
		
	}

}
