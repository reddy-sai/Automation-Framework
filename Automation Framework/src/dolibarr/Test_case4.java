package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Test_case4  extends baseClass{

	@Test
	public void TestTest_case4()
	{

		 driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Third parties']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 driver.findElement(By.xpath("//a[text()='dummy']")).click();
		 driver.findElement(By.xpath("//a[text()='Add invoice or credit note']")).click();
		 driver.findElement(By.name("facnumber")).sendKeys("supllier23");
		 driver.findElement(By.xpath("//img[@alt='SelectDate']")).click();
		 driver.findElement(By.className("dpSelected")).click();
		 driver.findElement(By.name("bouton")).click();
		 driver.findElement(By.xpath("//a[text()='Clone']")).click();
		 driver.findElement(By.xpath("//span[text()='Yes']")).click();
	
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 boolean actual = driver.findElement(By.xpath("//a[text()='supplier55']")).isDisplayed();
		 assertEquals(actual, true);
	}
}
