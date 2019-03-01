package dolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteUser {
	
	@Test
	public void TestDeleteUser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.linkText("Users & Groups")).click();
		 c1.findElement(By.className("flat")).sendKeys("user2");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.xpath("//img[@alt='Show user']")).click();
		 c1.findElement(By.className("butActionDelete")).click();
		 c1.findElement(By.xpath("//span[text()='Yes']")).click();
		 
		 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
		 
	}

}
