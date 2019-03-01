package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DeleteContact {

	@Test
	public void TestDeleteContact()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		c1.findElement(By.linkText("Contacts")).click();
		c1.findElement(By.className("txtBox")).sendKeys("con5");
		c1.findElement(By.name("submit")).click();
		c1.findElement(By.linkText("del")).click();
		c1.switchTo().alert().accept();
		WebElement c2 = c1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1= new Actions(c1);
		a1.moveToElement(c2).build().perform();
		c1.findElement(By.linkText("Sign Out")).click();
	}
}
