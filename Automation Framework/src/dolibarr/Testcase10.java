package dolibarr;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Testcase10 extends baseClass {
	
	@Test
	public void TestTestcase10() throws IOException
	{
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Agenda']")).click();

		 driver.findElement(By.xpath("//a[text()='New action/task']")).click();
		 
		 
		 WebElement a = driver.findElement(By.id("actioncode"));
		 Select s1= new Select(a);
		 s1.selectByValue("AC_EMAIL");
		 
		 driver.findElement(By.name("label")).sendKeys("Agenda3");
		 driver.findElement(By.xpath("//img[@alt='SelectDate']")).click();
		 driver.findElement(By.xpath("//td[text()='19']")).click();
		 driver.findElement(By.xpath("//input[@value='Add']")).click();
		 EventFiringWebDriver ff= new EventFiringWebDriver(driver);
		 File source = ff.getScreenshotAs(OutputType.FILE);
		 File target = new File("E:\\Testimages\\ACTILOGIN4.jpg");
		 FileUtils.moveFile(source, target);
		 
		 driver.findElement(By.xpath("//a[text()='List']")).click();
		 boolean actual = driver.findElement(By.xpath("//a[text()='Agenda3']")).isDisplayed();
		 assertEquals(actual, true);
		 
		 driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		 
	}

}
