package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("http://saipersonal:81/login.do");
		 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			rv1.findElement(By.linkText("Users")).click();
			rv1.findElement(By.cssSelector("input[value='Add New User']")).click();
			rv1.findElement(By.name("username")).sendKeys("Iamuser5");
			rv1.findElement(By.name("passwordText")).sendKeys("123456");
			rv1.findElement(By.name("passwordTextRetype")).sendKeys("123456");
			rv1.findElement(By.name("firstName")).sendKeys("Iam");
			rv1.findElement(By.name("lastName")).sendKeys("user5");
			rv1.findElement(By.cssSelector("input[value='   Create User   ']")).click();
			rv1.findElement(By.className("logoutImg")).click();
			 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("Iamuser5");
				rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("123456");
				rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
				String s = rv1.getTitle();
				System.out.println(s);
				 String s1="actiTIME - Modify Profile";
					
				 if(s.equals(s1))
					{
				System.out.println("Profile Verified");
					}
				 else
				 {
					 System.out.println("Profile Not Verified"); 
				 }
					}

				 
}
