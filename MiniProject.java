package com.seleniumtesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
			WebElement userName = driver.findElement(By.id("username"));
					userName.sendKeys("karthickvijay779");
					WebElement password = driver.findElement(By.id("password"));
						password.sendKeys("karthickvijay");
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\ss.png");
				FileUtils.copyFile(source,destination);
				
				WebElement login = driver.findElement(By.id("login"));
				login.click();
				WebElement location = driver.findElement(By.id("location"));
				Select L = new Select(location);
				L.selectByValue("Melbourne");
				WebElement hotels = driver.findElement(By.id("hotels"));
				Select H = new Select(hotels);
				H.selectByVisibleText("Hotel Hervey");
				WebElement room_Type = driver.findElement(By.id("room_type"));
				Select R = new Select(room_Type);
				R.selectByIndex(3);
				WebElement room_No = driver.findElement(By.id("room_nos"));
				Select RN = new Select(room_No);
				RN.selectByVisibleText("1 - One");

				WebElement date_In = driver.findElement(By.xpath("//input[@id='datepick_in']"));
				date_In.clear();
				date_In.sendKeys("08/10/2022");
				WebElement date_Out = driver.findElement(By.xpath("//input[contains(@id,'datepick_out')]"));
				date_Out.clear();
				date_Out.sendKeys("09/10/2022");
				WebElement adults = driver.findElement(By.xpath("//select [@id='adult_room']"));
				Select ad = new Select(adults);
				ad.selectByVisibleText("2 - Two");
				WebElement child_no = driver.findElement(By.xpath("//select[@id='child_room']"));
				Select Cn = new Select(child_no);
				Cn.selectByIndex(1);

				TakesScreenshot TT = (TakesScreenshot) driver;
				File file = TT.getScreenshotAs(OutputType.FILE);
				File des = new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\tab1.png");
				FileUtils.copyFile(file, des);

				driver.findElement(By.id("Submit")).click();

				TakesScreenshot TS = (TakesScreenshot) driver;
				File Source1 = TS.getScreenshotAs(OutputType.FILE);
				File destination1 = new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\tab2.png");
				FileUtils.copyFile(Source1, destination1);

				driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mythili");
				driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("S");
				driver.findElement(By.id("address")).sendKeys("Ganga foundation ,Est ,Usa");
				driver.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("123456789012d4512");

				WebElement type_Card = driver.findElement(By.xpath("//select[@id='cc_type']"));
				Select vv = new Select(type_Card);
				vv.selectByValue("AMEX");

				WebElement expiry_Month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
				Select month = new Select(expiry_Month);
				month.selectByVisibleText("October");

				WebElement expiry_Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
				Select ww = new Select(expiry_Year);
				ww.selectByValue("2022");

				driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
				driver.findElement(By.xpath("//input[@value='Book Now']")).click();
				Thread.sleep(3000);
				TakesScreenshot ll = (TakesScreenshot) driver;
				File kkk = ll.getScreenshotAs(OutputType.FILE);
				File mmm = new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\tab3.png");
				FileUtils.copyFile(kkk, mmm);
				Thread.sleep(8000);
				driver.findElement(By.id("logout")).click();
				
				TakesScreenshot ts1=(TakesScreenshot) driver;
				File sour = ts1.getScreenshotAs(OutputType.FILE);
				File destin=new File("C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\ScreenShot\\logout.png");
				FileUtils.copyFile(sour, destin);
				
			}

		


	}


