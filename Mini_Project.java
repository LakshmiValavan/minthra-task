package com.seleniumtesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
	public static WebDriver driver;
	public static int min_price;

	public static void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.myntra.com/kids");
		driver.manage().window().maximize();

	}

	public static void totalNumberofShirts() {
		driver.get("https://www.myntra.com/kids");

		List<WebElement> allcount = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> allPrice = new ArrayList<Integer>();
		for (int i = 0; i < allcount.size(); i++) {
			String replaceAll = allcount.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			allPrice.add(parseInt);
		}
		
		//System.out.println("maximum price" +Collections.min(allPrice));
		System.out.println("minimum price :"
				+ "" +Collections.max(allPrice));
		System.out.println("Total max:" + allcount.size());

	}
	public static void brand_name() {
		WebElement brandName = driver.findElement(By.xpath("//li[@class=\"product-base\"]//descendant::div[@class=\"product-price\"]//ancestor::div[@class=\"product-productMetaInfo\"]/h3"));
		
		System.out.println("brandName" +brandName.getText());
	
	}
	public static void discount_price() {
		driver.findElement(By.xpath(""));
	
	}
	
	public static void main(String[] args) {
		browserLaunch();
		totalNumberofShirts();
		brand_name();
		
	}
}
