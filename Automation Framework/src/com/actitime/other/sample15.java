package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("http://saipersonal:81/login.do");
		 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			rv1.findElement(By.linkText("Projects & Customers")).click();
			rv1.findElement(By.name("customersToArchive[5]")).click();
			rv1.findElement(By.cssSelector("input[value='Archive Selected Customers & Projects']")).click();
			rv1.switchTo().alert().accept();
			rv1.switchTo().defaultContent();
			rv1.findElement(By.linkText("Archives")).click();
			rv1.findElement(By.name("customersToRestore[5]")).click();
			rv1.findElement(By.name("restore")).click();
			rv1.switchTo().alert().accept();
			
			rv1.findElement(By.className("logoutImg")).click();
		
	}

}
