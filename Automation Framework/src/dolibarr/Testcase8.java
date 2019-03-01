package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Testcase8 extends baseClass {

	@Test
	public void TestTestcase8()
	{
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Members']")).click();
		 driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/adherents/type.php?leftmenu=setup&mainmenu=members&action=create']")).click();
		 driver.findElement(By.name("libelle")).sendKeys("mt3");
		 driver.findElement(By.xpath("//input[@value='Add']")).click();
		boolean actual = driver.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/adherents/type.php?rowid=8']")).isDisplayed();
		assertEquals(actual, true);

		 driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
}
