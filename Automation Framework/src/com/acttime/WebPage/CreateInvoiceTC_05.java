package com.acttime.WebPage;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.Dolibarrsetup;
import dolibarr.LoginPage;

public class CreateInvoiceTC_05 extends baseClass {
	
	@Test
	public void TestCreateInvoiceTC_05()
	{
		String username=ExcelOperation.readData("TC_05",1,0);
		String password=ExcelOperation.readData("TC_05",1,1);
		String invoicename=ExcelOperation.readData("TC_05",1,2);
		String expectedresult=ExcelOperation.readData("TC_05",1,3);
	
		LoginPage lp= new LoginPage();
		Dolibarrsetup ds= new Dolibarrsetup();
		
	
	
	
	}

}
