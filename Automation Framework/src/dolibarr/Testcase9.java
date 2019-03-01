package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class Testcase9  extends baseClass{
	
	@Test
	public void TestTestcase9()
	{
		
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//span[text()='Members']")).click();
		 driver.findElement(By.xpath("//a[text()='New member']")).click();
		 driver.findElement(By.name("member_login")).sendKeys("login3");
		 WebElement a = driver.findElement(By.id("morphy"));
		 Select s1= new Select(a);
		 s1.selectByValue("phy");
		 
		 
		 driver.findElement(By.name("nom")).sendKeys("Kapoor2");
		 driver.findElement(By.name("prenom")).sendKeys("Arjun2");
		 
		 
		 WebElement b = driver.findElement(By.id("typeid"));
		 Select s2= new Select(b);
		 s2.selectByValue("6");
		 

		 driver.findElement(By.xpath("//input[@value='Add member']")).click();
		 
		 driver.findElement(By.xpath("//a[text()='List']")).click();
		 
		 boolean actual = driver.findElement(By.xpath("//a[@href='fiche.php?rowid=4']")).isDisplayed();
		 assertEquals(actual, true);
		 
		 driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		 
		 
		 
		 
	}
	

}
