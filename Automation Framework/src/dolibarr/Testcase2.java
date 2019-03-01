package dolibarr;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase2 {
	
	
	@Test
	public void TestTestcase2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.xpath("//span[text()='Third parties']")).click();
		 c1.findElement(By.className("vsmenu")).click();
		 c1.findElement(By.name("nom")).sendKeys("ADP");
		 
		 c1.findElement(By.name("code_client")).sendKeys("ADP011");
		 c1.findElement(By.name("adresse")).sendKeys("1-2-3/4, hyderabad");
		 c1.findElement(By.id("zipcode")).sendKeys("500035");
		 c1.findElement(By.id("town")).sendKeys("Hyderabad");
		 
		 WebElement a = c1.findElement(By.id("selectpays_id"));
		 Select s1=new Select(a);
		 s1.selectByVisibleText("India (IN)");
		 
		 WebElement a1 = c1.findElement(By.id("departement_id"));
		 Select s2= new Select(a1);
		 s2.selectByVisibleText("AP - Andhra Pradesh");
		 
		 
		 c1.findElement(By.name("tel")).sendKeys("9989689797");
		 c1.findElement(By.name("email")).sendKeys("ADP_Hyd@gmail.com");
		 c1.findElement(By.xpath("//input[@value='Add third party']")).click();
		 
		 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
	

}
