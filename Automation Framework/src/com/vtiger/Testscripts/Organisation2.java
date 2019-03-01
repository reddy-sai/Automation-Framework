package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organisation2 {

	@Test
	public void TestOrganisation2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		c1.findElement(By.linkText("Organizations")).click();
		c1.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		c1.findElement(By.name("accountname")).sendKeys("Organisation 6 ");
		c1.findElement(By.cssSelector("input[value='  Save  ']")).click();

	}
}
