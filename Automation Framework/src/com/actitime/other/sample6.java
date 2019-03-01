package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample6 extends baseClass {
	@Test

	public void Testsample6(){
		// TODO Auto-generated method stub

		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.linkText("Projects & Customers")).click();
			driver.findElement(By.cssSelector("input[value='Add New Customer']")).click();
			driver.findElement(By.name("name")).sendKeys("Ram99");
			driver.findElement(By.name("createCustomerSubmit")).click();
			String s= driver.findElement(By.className("successmsg")).getText();
			System.out.println(s);
			driver.findElement(By.cssSelector("input[value='Add New Project']")).click();
			WebElement rv2 = driver.findElement(By.name("customerId"));
			Select s1= new Select(rv2);
			s1.selectByVisibleText("Ram99");
			driver.findElement(By.name("name")).sendKeys("Project199");
			driver.findElement(By.name("createProjectSubmit")).click();
			String s2= driver.findElement(By.className("successmsg")).getText();
			System.out.println(s2);
			driver.findElement(By.className("logoutImg")).click();
	}

}
