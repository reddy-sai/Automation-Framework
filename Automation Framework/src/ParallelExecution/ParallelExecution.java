package ParallelExecution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.ExcelInteger;
import com.actitime.UtilLibrary.ExcelOperation;

public class ParallelExecution {

	@Parameters("s1")
	@Test
	public void TestParallelExecution(String browser)
	{
		if(browser.equals("Chrome"))
		{
			String url= ExcelOperation.readData("WritingSheet1", 1, 0);
			String username=ExcelOperation.readData("WritingSheet1", 1, 1);
			String password=ExcelOperation.readData("WritingSheet1", 1, 2);
			
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			 ChromeDriver rv1 = new ChromeDriver();
			 rv1.get(url);
			 rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 rv1.findElement(By.name("username")).sendKeys(username);
			 rv1.findElement(By.name("pwd")).sendKeys(password);
			 rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
			 rv1.findElement(By.partialLinkText("Users")).click();
			 rv1.findElement(By.cssSelector("input[value='Add New User']")).click();
			
			 List<WebElement> a = rv1.findElements(By.cssSelector("input[type='checkbox']"));
			 for (int i = 0; i <a.size(); i++) {
				 a.get(i).click();
			}
			 List<WebElement> a1 = rv1.findElements(By.cssSelector("input[type='text']"));
			 for (int i = 0; i <a1.size(); i++) {
				 if (i<5) {
					 a1.get(i).sendKeys(ExcelOperation.readData("WritingSheet", 5, i));	
				}
				 
				 else {
					a1.get(i).sendKeys(ExcelInteger.readData("WritingSheet", 5, i)+"");
				}
			}
			
			
			 List<WebElement> a3 = rv1.findElements(By.cssSelector("input[type='password']"));
			 for (int i = 0; i <a3.size(); i++) {
				a3.get(i).sendKeys(ExcelOperation.readData("WritingSheet", 7, i));
			}
			 
			
			rv1.findElement(By.cssSelector("input[value='   Create User   ']")).click();

		}
	
		
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
			 FirefoxDriver rv1 = new FirefoxDriver();
			 rv1.get("http://saipersonal:81/login.do");
			 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
				rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
				rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
				rv1.findElement(By.linkText("Projects & Customers")).click();
				rv1.findElement(By.linkText("Excel2")).click();
				rv1.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
				rv1.switchTo().alert().accept();
				rv1.switchTo().defaultContent();
				rv1.findElement(By.className("logoutImg")).click();
		}
	}
}
