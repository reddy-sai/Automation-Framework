package com.actitime.UtilLibrary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
	@Listeners(FrameWorkListener.class)
public class baseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void preConfig()
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\resource\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://saipersonal:81/login.do");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 
	}
	
	@AfterTest
	public void postConfig()
	{
		 
		driver.close();
	}
	

}
