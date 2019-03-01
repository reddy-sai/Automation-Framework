package com.actitime.ProjectAndTasks_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class copypaste extends baseClass
{
	@Test
	public void Testcopypaste()
	{
	
		
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin"+ Keys.CONTROL + "a");
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys(Keys.CONTROL + "c");
		 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.CONTROL + "v");
		 driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.ENTER);
	}

}
