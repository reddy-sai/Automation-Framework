package dolibarr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelInteger;
import com.actitime.UtilLibrary.ExcelOperation;

public class CreateUser {

	@Test
	public void TestCreateUser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://localhost/dolibarr-3.1.1/htdocs/");
		 c1.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.linkText("Users & Groups")).click();
		 c1.findElement(By.linkText("New user")).click();
		 c1.findElement(By.name("password")).clear();
		 List<WebElement> a = c1.findElements(By.xpath("//input[@type='text']"));
		 for (int i = 0; i <a.size(); i++) {
						
			a.get(i).sendKeys(ExcelOperation.readData("Sheet1", 1, i));
			 
		 }
		 c1.findElement(By.name("office_phone")).sendKeys("9989689796");
		 c1.findElement(By.name("user_mobile")).sendKeys("9989689796");
		 c1.findElement(By.name("office_fax")).sendKeys("9989689796");
		 c1.findElement(By.name("email")).sendKeys("RObert_Tarin@gmail.com");
		 c1.findElement(By.className("button")).click();
			 
	
		
		 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
		}
		 
		
	}

