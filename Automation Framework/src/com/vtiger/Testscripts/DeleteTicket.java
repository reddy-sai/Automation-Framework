package com.vtiger.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.actitime.UtilLibrary.ExcelOperation;

public class DeleteTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url= ExcelOperation.readData("WritingSheet", 1, 0);
		String username=ExcelOperation.readData("WritingSheet", 1, 1);
		String password=ExcelOperation.readData("WritingSheet", 1, 2);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get(url);
		 rv1.findElement(By.name("user_name")).sendKeys(username);
		 rv1.findElement(By.name("user_password")).sendKeys(password);
		 rv1.findElement(By.id("submitButton")).click();
		 rv1.findElement(By.partialLinkText("Trouble Tickets")).click();
		 rv1.findElement(By.className("txtBox")).sendKeys("tt10");
		WebElement rv2= rv1.findElement(By.name("search_field"));
		Select s1= new Select(rv2);
		s1.selectByIndex(1);
		  rv1.findElement(By.name("submit")).click();
		  
		  String ExpectedResult ="tt10";
		  String ActualResult = rv1.findElement(By.cssSelector("a[title='Trouble Tickets']")).getText();
		  boolean b = rv1.findElement(By.cssSelector("a[title='Trouble Tickets']")).isDisplayed();
				  System.out.println(b);
				  //rv1.findElement(By.id("28")).click();
		  System.out.println(ActualResult);
		  if (ExpectedResult.equals(ActualResult)) {
			  ExcelOperation.writeData("WritingSheet", 3, 3, "Pass");
			 
			  ExcelOperation.writeData("WritingSheet", 3, 4, "Pass");
			  ExcelOperation.writeData("WritingSheet", 3, 5, "Pass");
				 
			}
		else {
			ExcelOperation.writeData("WritingSheet", 3, 3, "Fail");
			
			ExcelOperation.writeData("WritingSheet", 3, 4, "Fail");
			ExcelOperation.writeData("WritingSheet", 3, 5, "Fail");
			
		}
			
		}
			 
	}


