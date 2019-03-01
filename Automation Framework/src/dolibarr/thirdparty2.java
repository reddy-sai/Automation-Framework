package dolibarr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class thirdparty2 {

	@Test
	public void Testthirdparty2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		ChromeDriver rv1= new ChromeDriver();
		rv1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		rv1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		rv1.findElement(By.name("username")).sendKeys("erpadmin");
		rv1.findElement(By.name("password")).sendKeys("erpadmin");
		rv1.findElement(By.className("button")).click();
		rv1.findElement(By.xpath("//span[text()='Third parties']")).click();
		rv1.findElement(By.xpath("//a[text()='List of customers']")).click();
		rv1.findElement(By.xpath("//a[text()='ADP']")).click();
		rv1.findElement(By.xpath("//a[text()='Modify']")).click();
		rv1.findElement(By.name("adresse")).clear();
		rv1.findElement(By.name("adresse")).sendKeys("1-2-3/4, Vizag");
		rv1.findElement(By.name("save")).click();
		
		
	}
}
