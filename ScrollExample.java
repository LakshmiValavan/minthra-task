package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,-500)");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,-200)");
				
				//driver.findElement(By.xpath(""));
				
				
				
				
				
				
	}

}
