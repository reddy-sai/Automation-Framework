package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Projects extends baseClass {

	@Test
	public void TestProjects()
	{
		
	driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Products/Services']")).click();
		 driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/product/liste.php?leftmenu=product&type=0']")).click();
		boolean actual = driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/product/fiche.php?id=1']")).isDisplayed();
		assertEquals(actual, true);
		
		 driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		
	}
	
	}

