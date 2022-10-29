package com.seleniumtesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotExample {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\error.png");
		
		FileUtils.copyFile(src, dest);
	

	}

}
