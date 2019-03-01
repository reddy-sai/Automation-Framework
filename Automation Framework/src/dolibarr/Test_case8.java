package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Test_case8 extends baseClass {
	
	@Test
	
	public void TestTest_case8()
	{
		 driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Third parties']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 driver.findElement(By.xpath("//a[text()='supplier55']")).click();
		 driver.findElement(By.xpath("//a[text()='Add order']")).click();
		WebElement a = driver.findElement(By.className("flat"));
		Select s1= new Select(a);
		s1.selectByValue("0");
		 driver.findElement(By.id("dp_desc")).sendKeys("order11");
		 driver.findElement(By.xpath("//input[@value='Add']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		boolean actual = driver.findElement(By.xpath("//a[text()='supplier55']")).isDisplayed();
		assertEquals(actual, true);

		
	}
	

}
