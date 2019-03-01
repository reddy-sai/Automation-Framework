package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.UtilLibrary.ExcelOperation;

public class ExcelOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get(ExcelOperation.readData("WritingSheet1", 1, 0));
		 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 1));
		 rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys(ExcelOperation.readData("WritingSheet1", 1, 2));
		 rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		// ExcelOperation1.writeData("WritingSheet1", 2, 0, "http://localhost:8888/");
		
		 rv1.get(ExcelOperation.readData("WritingSheet1", 2, 0));
		 rv1.findElement(By.name("user_name")).sendKeys(ExcelOperation.readData("WritingSheet1", 2, 1));
		 rv1.findElement(By.name("user_password")).sendKeys(ExcelOperation.readData("WritingSheet1", 2, 2));
		 rv1.findElement(By.id("submitButton")).click();
		 
	}

}
