package com.acttime.WebPage;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.ActiveProjectsAndCustomers;
import dolibarr.LoginPage;
import dolibarr.OpenTaskPage1;

public class addProjectTC_07 extends baseClass{
	
	@Test
	public void TestaddProjectTC_07()
	{
		
		
		String username= ExcelOperation.readData("TC_07", 1, 0);
		String password= ExcelOperation.readData("TC_07", 1, 1);
		String s= ExcelOperation.readData("TC_07", 1, 2);
		String expectedResult = ExcelOperation.readData("TC_07", 1, 3);
	
		LoginPage lp = new LoginPage();
		ActiveProjectsAndCustomers apac= new ActiveProjectsAndCustomers();
		OpenTaskPage1 otp1= new OpenTaskPage1();
		
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		otp1.clickOnProjectsCustomers();
		apac.SelectProjectname(s);
		apac.selectcustomer();
		apac.Savechanges();
		String actualResult= apac.successmsg();
		otp1.clickOnLogoutButton();
		
		String status= ValidationOperation.verify(expectedResult, actualResult);
		
		ExcelOperation.writeData("TC_07", 1, 4, actualResult);
		ExcelOperation.writeData("TC_07", 1, 5, status);
		
		
		
		
	}

}
