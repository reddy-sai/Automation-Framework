package com.actitime.other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriting {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("E:\\Selenium//Book1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		w1.createSheet("WritingSheet1").createRow(5).createCell(5).setCellValue("ITS_WRITING");
				 
		FileOutputStream fos= new FileOutputStream("E:\\Selenium//Book1.xlsx");
		w1.write(fos);
		System.out.println("Sucess");

	}

}
