package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement emailid = driver.findElement(By.id("inputEmail"));
		emailid.sendKeys("lakshmi.79@2010");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("basu123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.close();
	}

}
