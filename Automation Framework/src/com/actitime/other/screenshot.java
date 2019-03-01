package com.actitime.other;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		 ChromeDriver rv1 = new ChromeDriver();
		 rv1.get("http://saipersonal:81/login.do");
		 EventFiringWebDriver ff= new EventFiringWebDriver(rv1);
		File source = ff.getScreenshotAs(OutputType.FILE);
		 File target = new File("E:\\Testimages\\ACTILOGIN.jpg");
		 FileUtils.moveFile(source, target);
		
	}

}
