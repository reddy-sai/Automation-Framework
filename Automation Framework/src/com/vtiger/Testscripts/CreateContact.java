package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact {

	@Test
	public void TestCreateContact()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		c1.findElement(By.linkText("Contacts")).click();
		c1.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		WebElement rv1= c1.findElement(By.name("salutationtype"));
		Select s1= new Select(rv1);
		s1.selectByIndex(1);
		c1.findElement(By.name("firstname")).sendKeys("Tony93x3399");
		c1.findElement(By.name("lastname")).sendKeys("Stark9gsxs");		
		c1.findElement(By.id("phone")).sendKeys("9989689796");
		c1.findElement(By.id("mobile")).sendKeys("9989689796");
		c1.findElement(By.id("homephone")).sendKeys("9908025704");
		c1.findElement(By.id("email")).sendKeys("reddy.bsaiteja@gmail.com");
		c1.findElement(By.id("jscal_field_birthday")).sendKeys("1997-05-10");
		c1.findElement(By.name("mailingstreet")).sendKeys("1-2-3/4 Hyderabad");
		c1.findElement(By.name("otherstreet")).sendKeys("1-2-3/4 Hyderabad");
		c1.findElement(By.cssSelector("input[value='  Save  ']")).click();
		WebElement c2 = c1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1= new Actions(c1);
		a1.moveToElement(c2).build().perform();
		c1.findElement(By.linkText("Sign Out")).click();
	}
	
}
