package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Test_case3  extends baseClass{
	
	@Test
	public void TestTest_case3()
	{
		 driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Third parties']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 driver.findElement(By.xpath("//a[text()='supplier55']")).click();
		 driver.findElement(By.id("card")).click();
		 driver.findElement(By.xpath("//a[text()='Modify']")).click();
		 driver.findElement(By.name("code_client")).sendKeys("midfyclient");
		 driver.findElement(By.name("save")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 boolean actual = driver.findElement(By.xpath("//a[text()='supplier55']")).isDisplayed();
		 assertEquals(actual, true);
	}

}
