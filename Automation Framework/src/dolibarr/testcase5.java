package dolibarr;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testcase5 {

	@Test
	public void TestTestcase5()
	{

	
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	 ChromeDriver c1 = new ChromeDriver();
	 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
	 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
	 c1.findElement(By.className("button")).click();
	 c1.findElement(By.xpath("//span[text()='Bank/Cash']")).click();
	 c1.findElement(By.xpath("//a[text()='New financial account']")).click();
	 c1.findElement(By.name("ref")).sendKeys("bk3");
	 c1.findElement(By.name("label")).sendKeys("label3");
	 
	 
	 WebElement a = c1.findElement(By.id("selectaccount_country_id"));
	 Select s1=new Select(a);
	 s1.selectByVisibleText("India (IN)");
	
	 c1.findElement(By.xpath("//input[@value='Create account']")).click();
	 
	 c1.findElement(By.xpath("//span[text()='Bank/Cash']")).click();
	boolean actual = c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/compta/bank/fiche.php?id=4']")).isDisplayed();
	 assertEquals(actual, true);
	 
	 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	 
	 
}
}
	

