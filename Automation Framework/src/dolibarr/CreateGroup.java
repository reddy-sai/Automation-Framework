package dolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateGroup {

	@Test
	public void TestCreateGroup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.linkText("Users & Groups")).click();	
		 c1.findElement(By.linkText("New group")).click();
		 c1.findElement(By.name("nom")).sendKeys("Group Alpha33");
		
		 c1.findElement(By.className("button")).click();
		 WebElement rv2 = c1.findElement(By.name("user"));
			Select s1= new Select(rv2);
			s1.selectByValue("6");
			
			c1.findElement(By.className("button")).click();
		 
			 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
}
