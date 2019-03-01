package com.actitime.other;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample18 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub


			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			 ChromeDriver rv1 = new ChromeDriver();
			 rv1.get("http://saipersonal:81/login.do");
			 rv1.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
				rv1.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
				rv1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
				WebElement rv2 = rv1.findElement(By.linkText("Projects & Customers"));
				Actions a1=new Actions(rv1);
				a1.contextClick(rv2).build().perform();
				Robot r1= new Robot();
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyPress(KeyEvent.VK_ENTER);
				

	}

}
