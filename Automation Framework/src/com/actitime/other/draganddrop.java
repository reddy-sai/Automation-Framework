package com.actitime.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 WebElement Source = rv1.findElement(By.id("draggable"));
		 WebElement Target = rv1.findElement(By.id("droppable"));
		 Actions a1= new Actions(rv1);
		 a1.dragAndDrop(Source,Target).build().perform();
		
	}

}
