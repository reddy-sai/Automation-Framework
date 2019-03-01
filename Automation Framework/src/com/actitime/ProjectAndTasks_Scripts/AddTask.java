package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;
import com.actitime.UtilLibrary.baseClass;

public class AddTask extends  baseClass{
	@Test
	public void TestAddTask()
	{
		// TODO Auto-generated method stub
		
		 driver.get(ExcelOperation.readData("WritingSheet1", 1, 0));
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 1));
		 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 2));
		 driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		 driver.findElement(By.cssSelector("input[value='Add New Tasks']")).click();
		 WebElement rv2= driver.findElement(By.name("customerId"));
		 Select s1= new Select(rv2);
		 s1.selectByVisibleText("Ramu");
		 WebElement rv3= driver.findElement(By.name("projectId"));
		 Select s2= new Select(rv3);
		 s2.selectByVisibleText("project1");
		 driver.findElement(By.name("task[0].name")).sendKeys("TA");
		 driver.findElement(By.cssSelector("input[value='Create Tasks']")).click();;
		 String ExpectedResult="1 new task was added to the customer \"Ramu\", project \"project1\".";
		 String ActualResult= driver.findElement(By.className("successmsg")).getText();
		 if(ExpectedResult.equals(ActualResult))
		 {
			 ExcelOperation.writeData("WritingSheet1", 7, 3, "Pass");
			 ExcelOperation.writeData("WritingSheet1", 7, 4, "1 new task was added to the customer \"Ramu\", project \"project1\".");
			 ExcelOperation.writeData("WritingSheet1", 7, 5, ActualResult);
		 }
		 else {
			 ExcelOperation.writeData("WritingSheet1", 7, 3, "Fail");
		}


	}

}
