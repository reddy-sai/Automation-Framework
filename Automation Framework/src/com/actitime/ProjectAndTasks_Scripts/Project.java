package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.baseClass;

public class Project extends baseClass {
@Test
	public void TestProject()
	{
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 1));
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 2));
		driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		driver.findElement(By.partialLinkText("Projects & Customers")).click();
		driver.findElement(By.cssSelector("input[value='Add New Project']")).click();
		
		 WebElement rv2= driver.findElement(By.name("customerId"));
		 Select s1= new Select(rv2);
		 s1.selectByVisibleText("Ramu");
		 
		 driver.findElement(By.name("name")).sendKeys("MyExcelP008");
		 driver.findElement(By.name("createProjectSubmit")).click();
		 String ExpectedResult="Project has been successfully registered.";
		 String ActualResult= driver.findElement(By.className("successmsg")).getText();
		 if(ExpectedResult.equals(ActualResult))
		 {
			 ExcelOperation.writeData("WritingSheet1", 5, 3, "Pass");
			 ExcelOperation.writeData("WritingSheet1", 5, 4, "Project has been successfully registered.");
			 ExcelOperation.writeData("WritingSheet1", 5, 5, ActualResult);
		 }
		 else {
			 ExcelOperation.writeData("WritingSheet1", 5, 3, "Fail");
		}

	}
	

}
