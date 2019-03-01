package dolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseclassbrowser;

public class subclassbrowser extends baseclassbrowser {
	@Test
	public void Testsubclassbrowser()
	{
		driver.findElement(By.id("username")).sendKeys("erpadmin"+ Keys.TAB + "erpadmin");
		 driver.findElement(By.className("button")).click();
	}

	
}
