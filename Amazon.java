package com.seleniumtesting;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	static String expectedOption = "Baby";
	static String expectedSearch ="soft toy set";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		Thread.sleep(2000);
		for (int i = 0; i < options.size(); i++) {
			String actualOptions = options.get(i).getText();
			if (expectedOption.equals(actualOptions)) {
				s.selectByVisibleText(actualOptions);
				break;
			} else {
				continue;
			}
			
		}
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("expectedSearch");
		Thread.sleep(2000);
		
		//List<WebElement> suggestions = driver.findElements(By.xpath(""));
	}

}
