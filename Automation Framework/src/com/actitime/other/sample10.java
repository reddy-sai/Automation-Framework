package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample10 extends baseClass{
	@Test

	public void Testsample10(){
		// TODO Auto-generated method stub

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.name("customersToArchive[12]")).click();
		driver.findElement(By.cssSelector("input[value='Archive Selected Customers & Projects']")).click();
			String s= driver.switchTo().alert().getText();
			System.out.println(s);
			driver.switchTo().alert().accept();
			driver.findElement(By.className("logoutImg")).click();

		
	}

}
