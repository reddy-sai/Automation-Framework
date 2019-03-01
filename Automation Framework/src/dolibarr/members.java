package dolibarr;

import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class members {
	
	@Test
	public void Testmembers()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.xpath("//span[text()='Members']")).click();
		 c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/adherents/fiche.php?leftmenu=members&action=create']")).click();
		 c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/adherents/type.php?leftmenu=setup&mainmenu=members&action=create']")).click();
		 c1.findElement(By.name("libelle")).sendKeys("Label1");
		 
		 c1.findElement(By.id("mail_valid")).sendKeys("Welcome to Dolibarr.");
		 c1.findElement(By.xpath("//input[@value='Add']")).click();
boolean actual = c1.findElement(By.xpath("//a[@href='/dolibarr-3.1.1/htdocs/adherents/type.php?rowid=3']")).isDisplayed();
	assertEquals(actual, true);
	
	

	 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	
	}

}
