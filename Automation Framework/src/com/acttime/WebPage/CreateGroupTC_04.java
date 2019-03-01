package com.acttime.WebPage;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.ExcelOperation1;
import com.actitime.UtilLibrary.ValidationOperation;
import com.actitime.UtilLibrary.baseClass;

import dolibarr.Dolibarrsetup;
import dolibarr.LoginPage;
import dolibarr.OpenTaskPage1;

public class CreateGroupTC_04 extends baseClass {
	

	@Test
	public void testGroupTC_04()
	{
		String username=ExcelOperation.readData("TC_04",1,0);
		String password=ExcelOperation.readData("TC_04",1,1);
		String groupname=ExcelOperation.readData("TC_04",1,2);
		String expectedresult=ExcelOperation.readData("TC_04",1,3);
		
		LoginPage lp=new LoginPage();
		Dolibarrsetup ds= new Dolibarrsetup();
		OpenTaskPage1 otp1=new OpenTaskPage1();
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		ds.clickOnUsers();
		ds.clickOnNewGroup();
		ds.groupnameTextField(groupname);
		ds.clickCreateGroup();
		ds.clickonOnlyGroup();
		String actualresult= ds.retrievetext();
		otp1.clickOnLogoutButton();
		
		String status = ValidationOperation.verify(expectedresult, actualresult);
		//Step 5 write data into Excel
		ExcelOperation1.writeData("TC_04",1,4,actualresult);
		ExcelOperation1.writeData("TC_04",1,5,status);

}
}
