package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.baseClass;

public class Customer extends baseClass{
	@Test
	public void TestCustomer() {
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 1));
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 2));
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.partialLinkText("Projects & Customers")).click();
			driver.findElement(By.cssSelector("input[value='Add New Customer']")).click();
			driver.findElement(By.name("name")).sendKeys("Exc");
			driver.findElement(By.name("createCustomerSubmit")).click();
		 String ExpectedResult="Customer has been successfully registered.";
		 String ActualResult= driver.findElement(By.className("successmsg")).getText();
		 if(ExpectedResult.equals(ActualResult))
		 {
			 ExcelOperation.writeData("WritingSheet1", 4, 3, "Pass");
			 ExcelOperation.writeData("WritingSheet1", 4, 4, "Customer has been successfully registered.");
			 ExcelOperation.writeData("WritingSheet1", 4, 5, ActualResult);
		 }
		 else {
			 ExcelOperation.writeData("WritingSheet1", 4, 3, "Fail");
		}
	}
	

}
