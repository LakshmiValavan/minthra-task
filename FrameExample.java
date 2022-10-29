package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		//Single frame
		driver.switchTo().frame("singleframe");
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Lakshmi");
		Thread.sleep(2000);

		//default Content
		driver.switchTo().defaultContent();

		//multiple frame
		WebElement iframeButton = driver.findElement(By.xpath("//a[@class='analystic']"));
		iframeButton.click();

		//outer frame
		WebElement outterframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outterframe);

		//inner frame
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);

		//text box
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox2.sendKeys("selinium");

	}

}
