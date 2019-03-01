package com.actitime.other;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("E:\\Selenium//Book1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		Row r1 = s1.getRow(4);
		Cell c1 = r1.getCell(4);
		String s= c1.getStringCellValue();
		System.out.println(s);
	}

}
