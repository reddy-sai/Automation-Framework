package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateLead {
	@Test
	public void TestCreateLead()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		c1.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		c1.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		c1.findElement(By.xpath("//input[@name='company']")).sendKeys("puxbg99");
		c1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("GxxTA999");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement w1 = c1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions A1 = new Actions(c1);
	    A1.moveToElement(w1).build().perform();
	    c1.findElement(By.linkText("Sign Out")).click();
		
		
	}
}
