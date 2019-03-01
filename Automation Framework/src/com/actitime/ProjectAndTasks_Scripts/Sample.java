package com.actitime.ProjectAndTasks_Scripts;



import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;


public class Sample extends baseClass{
@Test
	public void TestSample()
{
 String s = driver.getTitle();
 System.out.println(s);
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().refresh();
Dimension d1 = new Dimension(500,500);
driver.manage().window().setSize(d1);
driver.manage().window().maximize();
 

	}

}
