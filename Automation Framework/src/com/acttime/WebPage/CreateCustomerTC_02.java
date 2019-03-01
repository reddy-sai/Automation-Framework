package com.acttime.WebPage;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.ExcelOperation1;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.ActiveProjectsAndCustomers;
import dolibarr.AddNewCustomer;
import dolibarr.LoginPage;
import dolibarr.OpenTaskPage1;

import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	

	public class CreateCustomerTC_02 extends baseClass
	{
		@Test
		public void testCreateCustomerTC_02() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			//STEP 1 FETCH ALL NECCESARY DATA
		String username=ExcelOperation.readData("TC_02",1,0);
		String password=ExcelOperation.readData("TC_02",1,1);
		String customername=ExcelOperation.readData("TC_02",1,2);
		String expectedresult=ExcelOperation.readData("TC_02",1,3);
		//Step 2 create all neccesary page Objects
		LoginPage lp=new LoginPage();
		OpenTaskPage1 otp1=new OpenTaskPage1();
		ActiveProjectsAndCustomers apc=new ActiveProjectsAndCustomers();
		AddNewCustomer anc=new AddNewCustomer();
		
		//Step 3 convert testcase into testSCript

		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		otp1.clickOnProjectsCustomers();
		apc.clickonaddCustomer();
		anc.addCustomerName(customername);
		anc.createCustomer();
		String actualresult=apc.retrivemessage1();
		otp1.clickOnLogoutButton();
		
		//step 4 validate testscript
		String status = ValidationOperation.verify(expectedresult, actualresult);
		//Step 5 write data into Excel
		ExcelOperation.writeData("TC_02",1,4,actualresult);
		ExcelOperation.writeData("TC_02",1,5,status);
		
		
		
		
		
		
		
		}
	}
