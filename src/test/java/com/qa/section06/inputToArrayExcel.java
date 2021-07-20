package com.qa.section06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class inputToArrayExcel {

	public static void main(String[] args) throws IOException {
		Object [][] arr = read_excel_data();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	private static Object[][] read_excel_data() throws IOException {
		File file = new File("src/test/resources/excel/data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Object [][] arr = new Object[0][0];
		int start = sheet.getFirstRowNum();
		int end = sheet.getLastRowNum();
		arr = new Object[end-start+1][4];
		for(int	 i = start; i <= end; i++) {
			arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
			arr[i][1] = sheet.getRow(i).getCell(1).getNumericCellValue();
			arr[i][2] = sheet.getRow(i).getCell(2).getBooleanCellValue();
			arr[i][3] = sheet.getRow(i).getCell(3).getDateCellValue();
		}
		return arr;
	}

}
