package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample2 extends baseClass {
@Test
public void Testsample2()
{

		
		
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("pwd")).sendKeys("passwwwfford123");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	 driver.quit();
	}	
	

}
