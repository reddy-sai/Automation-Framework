package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sample13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("file:///C:/Users/hp/Desktop/main.htm");
		 
		 rv1.findElement(By.id("cb1")).click();
		 rv1.switchTo().frame(0);
		 
		 WebElement rv2 = rv1.findElement(By.id("s1"));
		 Select s2= new Select(rv2);
		 s2.selectByVisibleText("JSP");
		 
		 rv1.switchTo().defaultContent();
		 rv1.findElement(By.className("male")).click();
		 rv1.switchTo().frame(1);
		 rv1.findElement(By.id("un")).sendKeys("admin");
		 rv1.switchTo().defaultContent();
		 rv1.findElement(By.id("cb2")).click();
		 rv1.switchTo().frame(2);
		 rv1.findElement(By.className("Proceed")).click();
	}
	

}
