package org.base01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBase {

	public static WebDriver driver;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	public static void sendValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void dropDown(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByVisibleText(value);
	}

	public static void searchClick(WebElement ref) {
		ref.click();
	}

	public static void radioBtn(WebElement ref) {
		ref.click();
	}

}
