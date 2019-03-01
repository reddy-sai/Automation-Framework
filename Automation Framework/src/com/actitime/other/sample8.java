package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample8 extends baseClass {
@Test
	public void Testsample8()
{
		// TODO Auto-generated method stub

		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.cssSelector("input[value='Add New User']")).click();
			driver.findElement(By.name("username")).sendKeys("33user");
			driver.findElement(By.name("passwordText")).sendKeys("123456");
			driver.findElement(By.name("passwordTextRetype")).sendKeys("123456");
			driver.findElement(By.name("firstName")).sendKeys("33");
			driver.findElement(By.name("lastName")).sendKeys("user");
			driver.findElement(By.cssSelector("input[value='   Create User   ']")).click();
			driver.findElement(By.className("logoutImg")).click();
	}

}
