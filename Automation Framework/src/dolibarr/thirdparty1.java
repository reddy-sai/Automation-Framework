package dolibarr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class thirdparty1 {
	
	@Test
	public void testthirdparty1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		ChromeDriver rv1= new ChromeDriver();
		rv1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		rv1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		rv1.findElement(By.name("username")).sendKeys("erpadmin");
		rv1.findElement(By.name("password")).sendKeys("erpadmin");
		rv1.findElement(By.className("button")).click();
		rv1.findElement(By.xpath("//span[text()='Third parties']")).click();
		rv1.findElement(By.linkText("New third party")).click();
		rv1.findElement(By.name("nom")).sendKeys("surya27");
		WebElement rv2=  rv1.findElement(By.name("pays_id"));
		org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(rv2);
		s1.selectByIndex(10);
		rv1.findElement(By.name("tel")).sendKeys("9666856944"+"");
		WebElement rv3=  rv1.findElement(By.name("typent_id"));
		org.openqa.selenium.support.ui.Select s11=new org.openqa.selenium.support.ui.Select(rv3);
		s11.selectByIndex(4);
		WebElement rv4=  rv1.findElement(By.name("effectif_id"));
		org.openqa.selenium.support.ui.Select s12=new org.openqa.selenium.support.ui.Select(rv4);
		s12.selectByIndex(2);
		rv1.findElement(By.xpath("//input[@value='Add third party']")).click();
		rv1.findElement(By.linkText("Add proposal")).click();
		rv1.findElement(By.name("ref_client")).sendKeys("suneendra");
		WebElement rv5=  rv1.findElement(By.name("mode_reglement_id"));
		org.openqa.selenium.support.ui.Select s13=new org.openqa.selenium.support.ui.Select(rv5);
		s13.selectByIndex(5);
		WebElement rv6=  rv1.findElement(By.name("demand_reason_id"));
		org.openqa.selenium.support.ui.Select s14=new org.openqa.selenium.support.ui.Select(rv6);
		s14.selectByIndex(5);
		WebElement rv7=  rv1.findElement(By.name("availability_id"));
		org.openqa.selenium.support.ui.Select s15=new org.openqa.selenium.support.ui.Select(rv7);
		s15.selectByIndex(1);
		rv1.findElement(By.xpath("//input[@value='Create draft']")).click();
		
		rv1.findElement(By.xpath("//a[text()='Delete']")).click();
		
		
		
		 
	rv1.findElement(By.xpath("//span[text()='Yes']")).click();
	}
	


}