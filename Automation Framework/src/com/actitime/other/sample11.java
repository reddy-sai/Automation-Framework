package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("http://saipersonal:81/login.do");
		 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			rv1.findElement(By.linkText("Projects & Customers")).click();
			rv1.findElement(By.linkText("abc2")).click();
			rv1.findElement(By.cssSelector("input[value='Delete This Customer']")).click();
			String s = rv1.switchTo().alert().getText();
			System.out.println(s);
			rv1.switchTo().alert().accept();
			String s1= rv1.findElement(By.className("successmsg")).getText();
			System.out.println(s1);
			
	}

}
