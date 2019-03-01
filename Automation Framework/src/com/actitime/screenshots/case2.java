package com.actitime.screenshots;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class case2 extends baseClass{
	@Test
	public void Testcase2()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("man");
		driver.findElement(By.xpath("//input[@value=' Login now ']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.linkText("Ramu88")).click();
	}


}
