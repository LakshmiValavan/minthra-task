package com.seleniumtesting;

//import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Project {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", ".\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("lakshmi79.basu@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("lakbasu123");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		System.out.println("done1");
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		a.moveToElement(women).build().perform();
		System.out.println("done2");
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		js.executeScript("window.scrollBy(0,600)");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("done3");
		WebElement clk = driver.findElement(By.xpath("//div[@class='right-block']"));
		clk.click();
		WebElement add = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		add.click();
		System.out.println("done4");
		WebElement quantity = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		quantity.clear();
		WebElement txt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txt.sendKeys("7");
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		System.out.println("done5");

//		// checkout
////		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
////		ok.click();
////		driver.findElement(By.id("cgv")).click();
////		WebElement p_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
////		p_Order.click();
////
////		// payment
////		WebElement che = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
////		che.click();
////		WebElement cnfrm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
////		cnfrm.click();
////
////		// Screenshot
////		TakesScreenshot ss = (TakesScreenshot) driver;
////		File source = ss.getScreenshotAs(OutputType.FILE);
////		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Concepts\\TakeSS\\mini.png");
////		FileUtils.copyFile(source, destination);
//
	}

}