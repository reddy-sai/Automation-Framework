package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class testcase2 extends baseClass{
@Test
	public void Testtestcase2()
{
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		 driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		 driver.findElement(By.partialLinkText("Projects")).click();
		 driver.findElement(By.cssSelector("input[value='Add New Customer']")).click();
		 driver.findElement(By.cssSelector("input[maxlength='209']")).sendKeys("dummyz");	
		 driver.findElement(By.cssSelector("input[value='Create Customer']")).click();
			String s= driver.findElement(By.className("successmsg")).getText();
			System.out.println(s);
			driver.findElement(By.className("logoutImg")).click();
			
			
	}
	

}
