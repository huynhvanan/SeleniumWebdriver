package com.qa.section06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/excel/input.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		Row row;
		Cell cell;
		// input value 1 to 10
		for(int i = 0; i <= 9; i++) {
			// create row
			row = sheet.createRow(i);
			for(int j = 0; j <= 9; j++) {
				// create cell
				cell = row.createCell(j);
				// input value
				cell.setCellValue((i+1)*(j+1));
			}
		}
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		workbook.close();
	}

}
