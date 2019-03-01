package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase3 {

	
	@Test
	public void TestTestcase3()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.xpath("//span[text()='Products/Services']")).click();
		 c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/product/fiche.php?leftmenu=product&action=create&type=0']")).click();
		 c1.findElement(By.name("ref")).sendKeys("Ref2");
		 c1.findElement(By.name("libelle")).sendKeys("Label2");
		 
		 WebElement a = c1.findElement(By.id("selectcountry_id"));
		 Select s1=new Select(a);
		 s1.selectByVisibleText("India (IN)");
		 
		 c1.findElement(By.xpath("//input[@value='Create']")).click();
		 c1.findElement(By.xpath("//a[text()='List']")).click();
		boolean actual = c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/product/fiche.php?id=7']")).isDisplayed();
		assertEquals(actual, true); 
		
		 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
}
