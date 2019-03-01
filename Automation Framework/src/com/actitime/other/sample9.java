package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample9 extends baseClass{
@Test
	public void Testsample9()
{
		// TODO Auto-generated method stub

		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.linkText("Reports")).click();
			driver.findElement(By.id("users_selected")).click();
			
			WebElement rv2 = driver.findElement(By.name("users"));
			Select s1= new Select(rv2);
			s1.selectByValue("2");
			s1.selectByValue("3");
			s1.selectByValue("4");
			s1.selectByValue("5");
			s1.selectByValue("6");
			
	}

}
