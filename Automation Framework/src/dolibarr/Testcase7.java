package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Testcase7 extends baseClass{
	
	
	@Test
	public void TestTestcase7()
	{
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Tools']")).click();
		 driver.findElement(By.xpath("//a[text()='New emailing']")).click();
		 driver.findElement(By.name("titre")).sendKeys("Mail3");
		 driver.findElement(By.name("sujet")).sendKeys("subject");
		 
		 driver.findElement(By.id("body")).sendKeys("Welcome to Dolibar");
		 
		 driver.findElement(By.xpath("//input[@value='Create emailing']")).click();
		 
		  boolean actual = driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/comm/mailing/fiche.php?id=6']")).isDisplayed();
		  assertEquals(actual, true);
		  
		  driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
	

}
