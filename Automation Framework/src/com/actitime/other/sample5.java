package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.UtilLibrary.baseClass;

public class sample5 extends baseClass {
@Test

	public void Testsample5()
{
		// TODO Auto-generated method stub
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pwscscd']")).sendKeys("mxncvnkjbsanager");
	driver.findElement(By.cssSelector("input[valign='absmcsfiddle']")).click();
		 String s = driver.getTitle();
		 System.out.println(s);
		 String s1="actiTIME ------------------ Login";
		
				 if(s.equals(s1))
					{	
						
						driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
						driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
						driver.findElement(By.cssSelector("input[valign='absmiddle']")).click();
						
						
						String s3= "actiTIME - Open Tasks";
						String s4= driver.getTitle();
						System.out.println(s4);
						if(s3.equals(s4)){
							driver.findElement(By.className("logoutImg")).click();
						}
					}
				 
					else 
					{
						
						System.out.println("Page not Found");
					}
	}

}
