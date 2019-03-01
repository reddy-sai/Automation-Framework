package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Testcase4 extends baseClass
{
	
	@Test
	public void TestTestcase4()
	{
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Products/Services']")).click();
		 driver.findElement(By.xpath("//a[text()='New service']")).click();
		 driver.findElement(By.name("ref")).sendKeys("Service1");
		 driver.findElement(By.name("libelle")).sendKeys("label1");
		
		 WebElement a = driver.findElement(By.id("selectcountry_id"));
		 Select s1=new Select(a);
		 s1.selectByVisibleText("India (IN)");

		 driver.findElement(By.xpath("//input[@value='Create']")).click();
		 driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/product/liste.php?leftmenu=service&type=1']")).click();
		 
		 boolean actual = driver.findElement(By.xpath("//a[text()='Service1']")).isDisplayed();

		 assertEquals(actual, true);
		 
		 driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
}
;
