package com.actitime.screenshots;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class case4 extends baseClass{
	@Test
	public void Testcase4()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@value=' Login now ']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.linkText("Ramu000")).click();
	}


}
