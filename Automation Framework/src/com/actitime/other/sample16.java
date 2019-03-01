package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("http://saipersonal:81/login.do");
		 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			 WebElement rv2 = rv1.findElement(By.name("customerProject.shownCustomer"));
			 Select s2= new Select(rv2);
			 s2.selectByVisibleText("teja");
			 rv1.findElement(By.cssSelector("input[value='Add New Tasks']")).click();
			 rv1.findElement(By.name("projectName")).sendKeys("project3");
			 rv1.findElement(By.name("task[0].name")).sendKeys("task1");
			 WebElement rv3 = rv1.findElement(By.name("task[0].billingType"));
			 Select s3= new Select(rv3);
			 s3.selectByVisibleText("Billable");
			 rv1.findElement(By.cssSelector("input[value='Create Tasks']")).click();
			 String s= rv1.findElement(By.className("successmsg")).getText();
			 System.out.println(s);
			 rv1.findElement(By.linkText("task1")).click();
			 rv1.findElement(By.cssSelector("input[value='Delete This Task']")).click();
			 rv1.switchTo().alert().accept();
			 String s8= rv1.findElement(By.className("successmsg")).getText();
			 System.out.println(s8);
			 rv1.findElement(By.className("logoutImg")).click();
			}

}
