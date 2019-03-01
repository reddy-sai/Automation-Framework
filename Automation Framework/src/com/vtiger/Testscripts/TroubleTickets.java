package com.vtiger.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.actitime.UtilLibrary.ExcelOperation;

public class TroubleTickets {

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
		 rv1.findElement(By.cssSelector("img[title='Create Ticket...']")).click();
		 rv1.findElement(By.name("ticket_title")).sendKeys(ExcelOperation.readData("WritingSheet", 2, 6));
		 WebElement rv2= rv1.findElement(By.name("ticketstatus"));
		 Select s1= new Select(rv2);
		 s1.selectByVisibleText("Wait For Response");
		 rv1.findElement(By.id("hours")).sendKeys(ExcelOperation.readData("WritingSheet", 2, 7));
		 rv1.findElement(By.id("days")).sendKeys(ExcelOperation.readData("WritingSheet", 2, 8));
		
		 
		 rv1.findElement(By.name("button")).click();
		 String ExpectedResult ="[ TT16 ] Ticket000 - Trouble Tickets Information";
		 String ActualResult= rv1.findElement(By.className("dvHeaderText")).getText();
		 System.out.println(ActualResult);
		 
		 if (ExpectedResult.equals(ActualResult)){
			ExcelOperation.writeData("WritingSheet", 2, 3, "Pass");
			ExcelOperation.writeData("WritingSheet", 2, 4, ExpectedResult);
			ExcelOperation.writeData("WritingSheet", 2, 5, ActualResult);
			 
		}
	else {
		ExcelOperation.writeData("WritingSheet", 2, 3, "Fail");
		
	}
	}
	

}
