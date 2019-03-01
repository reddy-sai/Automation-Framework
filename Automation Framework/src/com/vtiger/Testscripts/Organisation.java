package com.vtiger.Testscripts;



import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelOperation;

public class Organisation {
	
	@Test
	public void TestOrganisation()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost:8888");	
		c1.findElement(By.name("user_name")).sendKeys("admin"+Keys.TAB+"saiteja123"+Keys.ENTER);
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.linkText("Organizations")).click();
		c1.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		List<WebElement> a = c1.findElements(By.xpath("//input[@type='text']"));
		for (int i = 0; i <a.size()-1; i++) {
			a.get(i).sendKeys(ExcelOperation.readData("Sheet2", 1, i));
			}
		List<WebElement> a1 = c1.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <a1.size()-1; i++) {
			a1.get(i).click();
		}
		c1.findElement(By.xpath("//img[@alt='Select']")).click();
		Set<String> a2 = c1.getWindowHandles();
		Iterator<String> i1 = a2.iterator();
		String s1= i1.next();
		String s2= i1.next();
		c1.switchTo().window(s2);
		c1.findElement(By.linkText("Organisation 1")).click();
		c1.switchTo().alert().accept();
		c1.switchTo().window(s1);
		
			}
	
}
