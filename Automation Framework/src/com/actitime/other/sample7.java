package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample7 extends baseClass {
@Test
	public void Testsample7() {
		// TODO Auto-generated method stub
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			driver.findElement(By.linkText("Projects & Customers")).click();
			WebElement rv2 = driver.findElement(By.name("selectedCustomer"));
			Select s1= new Select(rv2);
			s1.selectByVisibleText("Ram99");
			
			driver.findElement(By.cssSelector("input[value='  Show  ']")).click();
			boolean b = driver.findElement(By.linkText("Ram99")).isDisplayed();
			System.out.println(b);
			boolean b1 = driver.findElement(By.linkText("Project199")).isDisplayed();
            System.out.println(b1);   	
            driver.findElement(By.name("showProjects")).click();
            driver.findElement(By.cssSelector("input[value='  Show  ']")).click();
            
           
			
            
	}

}
