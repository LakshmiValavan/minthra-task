package com.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//Browser launching syntax
		WebDriver driver = new ChromeDriver();
		//get-url
		driver.get("https://www.facebook.com/login/");
		//maximize
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/your-account");
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		//quit
		driver.quit();
		//close
		driver.close();
	}

}
