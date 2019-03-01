package com.acttime.WebPage;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.ExcelOperation1;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.ActiveProjectsAndCustomers;
import dolibarr.EditCustomerInformation;
import dolibarr.LoginPage;
import dolibarr.OpenTaskPage1;

public class deleteCustomerTC_06  extends baseClass{
	
	@Test
	public void testdeleteCustomerTC_06()
	{
	String username= ExcelOperation.readData("TC_06", 1, 0);
	String password= ExcelOperation.readData("TC_06", 1, 1);
	String s= ExcelOperation.readData("TC_06", 1, 2);
	String expectedResult = ExcelOperation.readData("TC_06", 1, 3);
	
	LoginPage lp = new LoginPage();
	ActiveProjectsAndCustomers apac= new ActiveProjectsAndCustomers();
	EditCustomerInformation eci= new EditCustomerInformation();
	OpenTaskPage1 otp1= new OpenTaskPage1();
	
	lp.enterUsername(username);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	otp1.clickOnProjectsCustomers();
	apac.SelectCustomername(s);
	eci.deletecustomer();
	eci.popup();
	String actualResult= apac.successmsg();
	otp1.clickOnLogoutButton();
	
	String status= ValidationOperation.verify(expectedResult, actualResult);
	
	ExcelOperation.writeData("TC_06", 1, 4, actualResult);
	ExcelOperation.writeData("TC_06", 1, 5, status);
	
	
	
	
	}			

}
