package com.seleniumtesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {
	public static WebDriver driver;
	public static String expectedTitle="All Categories- Buy Products Online at Best Price in India - All Categories | Flipkart.com";

	public static void Browser_launch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	public static void SwitchBetween_TwoWindow() {

		String pid = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//div[@class='_3LU4EM']")).click();

		Set<String> allid = driver.getWindowHandles();

		for (String id : allid) {

			if (!(id.equals(pid))) {

				driver.switchTo().window(id);
			}
		}

	}
	
	public static void SwitchWindow_MoreThan_TwoWindow() {

		String pid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//div[@class='_3LU4EM']")).click();

		Set<String> allid = driver.getWindowHandles();

		for (String id : allid) {

			if (driver.switchTo().window(id).getTitle().equals(expectedTitle)) {

				
			}
		}
		
	}

	//Xpath issue have to rework just concept type for my reference
	public static void main(String[] args) {

		Browser_launch();
		SwitchBetween_TwoWindow();
		SwitchWindow_MoreThan_TwoWindow();
	}
}



