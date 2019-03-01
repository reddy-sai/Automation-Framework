package com.vtiger.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtiger4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		c1.findElement(By.name("firstname")).sendKeys("Tony");
		c1.findElement(By.name("lastname")).sendKeys("Stark9");		
		c1.findElement(By.id("phone")).sendKeys("9989689796");
		c1.findElement(By.id("mobile")).sendKeys("9989689796");
		c1.findElement(By.id("homephone")).sendKeys("9908025704");
		c1.findElement(By.id("email")).sendKeys("reddy.bsaiteja@gmail.com");
		c1.findElement(By.id("jscal_field_birthday")).sendKeys("1997-05-10");
		c1.findElement(By.name("mailingstreet")).sendKeys("1-2-3/4 Hyderabad");
		c1.findElement(By.name("otherstreet")).sendKeys("1-2-3/4 Hyderabad");
		c1.findElement(By.cssSelector("input[value='  Save  ']")).click();
		boolean b = c1.findElement(By.linkText("More Information")).isDisplayed();
		System.out.println(b);
		
	}

}
