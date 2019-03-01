package com.acttime.Reports_Scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import com.actitime.UtilLibrary.baseClass;

public class ChildWindow extends baseClass{
@Test
	public void TestChildWindow() {
	


		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		 driver.findElement(By.partialLinkText("Reports")).click();
		 driver.findElement(By.cssSelector("img[alt='Click Here to Pick up the date']")).click();
		 Set<String> a1 = driver.getWindowHandles();
		  Iterator<String> i1 = a1.iterator();
		 String s1= i1.next();
		 String s2= i1.next();
		 driver.switchTo().window(s2);
		 driver.findElement(By.xpath("//span[text()='28']")).click();
		 driver.switchTo().window(s1);
		 driver.findElement(By.className("logoutImg")).click();
		 
		
	}

}
