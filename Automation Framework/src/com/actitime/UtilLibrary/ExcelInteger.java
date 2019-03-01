package com.actitime.UtilLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelInteger {
	public static long readData(String sheetName, int rowNumber, int cellNumber)
	{
		try
		{
			FileInputStream fis= new FileInputStream(".\\src\\resource\\testdata\\Book1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		  long data =(long) w1.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getNumericCellValue();
		return data;
		}
	catch(Exception rv)
		{
		return 0;
		}
	}


	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

}
