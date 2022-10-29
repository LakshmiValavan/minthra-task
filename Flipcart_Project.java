package com.seleniumtesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_Project {
	
	public static WebDriver driver;

	public static Actions a;
	public static String title;

	public static void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvi\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("9551239925");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("rvnbasu783");

		WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			element.click();
			
	}

	public static void selectElectronics() {

		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		a = new Actions(driver);
		a.moveToElement(electronics).build().perform();
		

	}

	public static void laptopAccessories() {
		WebElement ltAccessories = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		a = new Actions(driver);
		a.moveToElement(ltAccessories).build().perform();

	}
	public static void laptopKeyBoards() {

		WebElement ltKeyboards = driver.findElement(By.xpath("//a[text()='Laptop Keyboards']"));
		a = new Actions(driver);
		a.moveToElement(ltKeyboards).build().perform();
		ltKeyboards.click();

	}

	public static void clickPriceHighToLow() {

		WebElement highToLow = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));

		highToLow.click();
	}

	public static void selectHighestFirstKeyboard() {

		WebElement keyBoard = driver.findElement(By.xpath("//img[contains(@alt,'APPLE MJQK3HN/A Magic ')]"));
		keyBoard.click();

	}

	public static void getSelectedKeyboardTitle() {

		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {

			title = driver.switchTo().window(window).getTitle();
	}
		System.out.println("Product Title :" + title);

		for (String childWindow : windowHandles) {

			if (driver.switchTo().window(childWindow).getTitle().equalsIgnoreCase(title)) {

				break;

			}

		}
	}

	public static void productPrize() {

		WebElement prize = driver.findElement(By.xpath("//div[@class='CEmiEU']"));

		System.out.println("Product Prize :" + prize.getText());

	}

	public static void enterPinCode() {

		driver.findElement(By.id("pincodeInputId")).sendKeys("625012");

		driver.findElement(By.xpath("//span[text()='Check']")).click();
	}

	public static void userGivenPinCode() {

		String pin = driver.findElement(By.id("pincodeInputId")).getAttribute("value");
		System.out.println("Given PinCode :" + pin);
	}

	public static void deliveryDate() {

		WebElement date = driver.findElement(By.xpath("//span[text()='21 Sep, Wednesday']"));

		System.out.println("Delivery Date :" + date.getText());
	}

	public static void main(String[] args) {

		browserLaunch();
		selectElectronics();
		laptopAccessories();
		laptopKeyBoards();
		clickPriceHighToLow();
		selectHighestFirstKeyboard();
		getSelectedKeyboardTitle();
		productPrize();
		enterPinCode();
		deliveryDate();
		userGivenPinCode();
	}

}



