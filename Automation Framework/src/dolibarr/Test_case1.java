package dolibarr;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;


public class Test_case1 extends baseClass {
	
	@Test
	public void TestTest_case1()
	{
		
		 driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Third parties']")).click();
		 driver.findElement(By.xpath("//a[text()='New supplier']")).click();
		 driver.findElement(By.name("nom")).sendKeys("Supplier1");
		 driver.findElement(By.name("code_client")).sendKeys("tide01");
		 driver.findElement(By.name("code_fournisseur")).sendKeys("tide_sup01");
		 driver.findElement(By.name("adresse")).sendKeys("1-2-3/4, karnataka");
		 driver.findElement(By.id("zipcode")).sendKeys("500035");
		 driver.findElement(By.id("town")).sendKeys("chennai");
		 
		 WebElement a = driver.findElement(By.id("selectpays_id"));
		 Select s1=new Select(a);
		 s1.selectByVisibleText("India (IN)");
		 
		 
		 driver.findElement(By.xpath("//input[@value='Add third party']")).click();
		 driver.findElement(By.xpath("//a[text()='List of suppliers']")).click();
		 
		  boolean actual =driver.findElement(By.xpath("//a[text()='Supplier1']")).isDisplayed();
		  assertEquals(actual, true);
		  
		 
		 
		 
		
		
		}
	
}
