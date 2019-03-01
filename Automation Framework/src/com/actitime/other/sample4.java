package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample4 extends baseClass{
@Test
	public void Testsample4()
{
		// TODO Auto-generated method stub

		
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.linkText("Projects &&&&&&&& Customers")).click();
			
			
	}

}
