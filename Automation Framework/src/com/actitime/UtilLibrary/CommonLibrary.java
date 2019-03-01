package com.actitime.UtilLibrary;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;



public class CommonLibrary {

	public static void selectdropdownbyindex(WebElement dropdownaddress, int indexnumber)
			{
			Select s1=new Select (dropdownaddress);
			s1.selectByIndex(indexnumber);
			}
	public static void selectdropdownbyvisibletext (WebElement dropdownaddress,String visibletext)
			{
			Select s1=new Select(dropdownaddress);
			s1.selectByVisibleText(visibletext);
			}
	public static void selectdropdownbyvalue (WebElement dropdownaddress,String value)
	{
			Select s1=new Select (dropdownaddress);
			s1.selectByValue(value);
	}
	public static void movingthecursortodesiredlocation(WebElement addressofdesiredlocation)
	{
			Actions a1=new Actions(baseClass.driver);
			a1.moveToElement(addressofdesiredlocation).build().perform();
	}	
	public static void clickonokbuttononalertpopup()
	{
			baseClass.driver.switchTo().alert().accept();
	}
	public static void clickonCancelbuttononalertpopup()
	{
			baseClass.driver.switchTo().alert().dismiss();
	}
	public static String clickongetTextbuttononalertpopup()
	{		
		String data= baseClass.driver.switchTo().alert().getText();
		return data;
	}
	

	public static void takeScreenshot(String testscriptmethodName)
	{
		EventFiringWebDriver efw= new EventFiringWebDriver(baseClass.driver);
		java.io.File Source = efw.getScreenshotAs(OutputType.FILE);
		java.io.File Target = new java.io.File(".\\src\\resource\\FailedTestScriptScreenshots\\"+testscriptmethodName+".jpg");
				try {
					FileUtils.moveFile(Source, Target);
					
				} catch (IOException e) {
					// TODO: handle exception
				}
	}
}
