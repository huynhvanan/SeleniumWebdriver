package com.qa.section06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/excel/data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int start = sheet.getFirstRowNum();
		int end = sheet.getLastRowNum();
		for(int i = start; i < end; i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
			System.out.println(sheet.getRow(i).getCell(1).getNumericCellValue()+"\t");
			System.out.println(sheet.getRow(i).getCell(2).getBooleanCellValue()+"\t");
			System.out.println(sheet.getRow(i).getCell(3).getDateCellValue());
		}

	}

}
