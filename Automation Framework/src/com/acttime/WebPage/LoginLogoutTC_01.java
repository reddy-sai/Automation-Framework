package com.acttime.WebPage;


import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.LoginPage;
import dolibarr.OpenTaskPage;

public class LoginLogoutTC_01  extends baseClass{
	
	@Test
	public void testLoginLogoutTC_01()
	{
		String username =  ExcelOperation.readData("TC_01", 1, 0);
		String password = ExcelOperation.readData("TC_01", 1, 1);
		String expectedResult = ExcelOperation.readData("TC_01", 1, 2);
		
		
		LoginPage lp = new LoginPage();
		OpenTaskPage otp= new OpenTaskPage();
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		
		String actualResult = otp.retrieveTitleOfWebPage();
		otp.clickOnLogoutButton();
		
		String status= ValidationOperation.verify(expectedResult, actualResult);
		
		ExcelOperation.writeData("TC_01", 1, 3, actualResult);
		ExcelOperation.writeData("TC_01", 1, 4, status);

	}

}
