package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.baseClass;

public class DeleteCustomer extends baseClass{

	public void TestDeleteCustomer(){
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 1));
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 2));
		driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		driver.findElement(By.partialLinkText("Projects & Customers")).click();
		driver.findElement(By.partialLinkText("Excel2")).click();
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		driver.switchTo().alert().accept();
		
		 

	}

}
