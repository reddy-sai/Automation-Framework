package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sampe12 extends baseClass{
@Test
	public void Testsampe12() {
		// TODO Auto-generated method stub

		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		 driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		 driver.findElement(By.linkText("Projects & Customers")).click();
		 driver.findElement(By.cssSelector("input[value='Add New Customer']")).click();
		 driver.findElement(By.name("name")).sendKeys("maha");
			driver.findElement(By.name("createCustomerSubmit")).click();
				
	}

}
