package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class LoginLogout {
	
	@Test
	public void TestLoginLogout()
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement c2 = c1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1= new Actions(c1);
		a1.moveToElement(c2).build().perform();
		c1.findElement(By.linkText("Sign Out")).click();
		String Expected = c1.getTitle();
		System.out.println(Expected);
		String Actual = "vtiger CRM 5 - Commercial Open Source CRM";
		
	}
}
