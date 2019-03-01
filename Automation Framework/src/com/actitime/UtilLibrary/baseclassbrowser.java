package com.actitime.UtilLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclassbrowser {
	 
	public static WebDriver driver;
	@BeforeTest
	public void preconfig()
	{
	
		String browser = ExcelOperation.readData("preconfig", 2, 0);
		String url = ExcelOperation.readData("preconfig", 1, 1);
	
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\src\\resource\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\src\\resource\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();	
			 
		}			
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void postConfig()
	{
		 
		driver.close();
	}
	
	
}
