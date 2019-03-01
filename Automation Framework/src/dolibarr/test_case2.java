package dolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class test_case2 extends baseClass {

	@Test
	public void Testtest_case2()
	{
		 driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Third parties']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 driver.findElement(By.xpath("//a[text()='Supplier1']")).click();
		 driver.findElement(By.id("card")).click();
		 driver.findElement(By.id("action-delete")).click();
		 driver.findElement(By.xpath("//span[text()='Yes']")).click();
		 
	}
}
