package com.seleniumtesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Count {
	public static void main(String[] args) {
		
		//Task 1 - No. of Products count in Kids T Shirt - Myntra.com site
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Up casting
//		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
//		List<WebElement> count = driver.findElements(By.xpath("//li[@class='product-base']"));
//		System.out.("Total no. of product :" + count.size());

		//Task 2 - Minimum price of  Kids T Shirt - Myntra.com site
		
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.getTitle();
		List<WebElement> count = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i = 0; i < count.size() ; i++) {
			
			String replace = count.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replace);
			a.add(parseInt);
		}
		int size=a.size();
		System.out.println("Total no of Tshirt :" + size);
//		System.out.println("Max Price :"+ Collections.max(a));
		System.out.println("Min Price :" +Collections.min(a));
}

}



