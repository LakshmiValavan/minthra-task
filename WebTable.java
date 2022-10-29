package com.seleniumtesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static WebDriver driver;

	public static void browser_Launch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/#countries");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	//Table header list
	public static void allHeaders() {
		List<WebElement> allHeaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (WebElement header : allHeaders) {
			System.out.println(header.getText());
		}
	}
	
//	//By using all row data fetch column data use for each loop
//	
//	public static void allData() {
//		List<WebElement> allrow = driver
//				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
//		for (WebElement row : allrow) {
//			List<WebElement> allColumn = row.findElements(By.xpath("/td"));
//			for (WebElement column : allColumn) {
//				System.out.println(column.getText());
//			}
//		}
//	}
//	
	public static void row_Wise_Data() {
		List<WebElement> row_Wise_Data = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td"));
		for (WebElement data : row_Wise_Data) {
			System.out.println(data.getText());
		}
	}
//	
//	
//	public static void column_Wise_Data() {
//		List<WebElement> column_Wise_Data = driver
//				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td[2]"));
//		for (WebElement data : column_Wise_Data) {
//			System.out.println(data.getText());
//		}
//	}
//	
//	public static void particularData() {
//		List<WebElement> part_Data = driver
//				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td[2]"));
//		for (WebElement data : part_Data) {
//			System.out.println(data.getText());
//		}
//	}
//
	
	public static void main(String[] args) {
		browser_Launch();
		allHeaders();
//		allData();
//		row_Wise_Data();
//		column_Wise_Data();
//		particularData();
	}
}




