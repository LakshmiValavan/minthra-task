package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			WebElement emailId = driver.findElement(By.xpath("//*[@id=\'email\']"));
				emailId.sendKeys("basu123@gmail.com");
			WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
			password.sendKeys("basu123");
			WebElement login = driver.findElement(By.xpath("//*[@id=\'loginform\']/div[2]"));
			login.click();
	}

}
