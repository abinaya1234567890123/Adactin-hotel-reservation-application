package org.base01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoExecution extends DemoBase {

	public static void main(String[] args) throws InterruptedException {

		browserLaunch();

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// login page

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("abi09876");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("abi12345");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		Thread.sleep(6000);

		driver.manage().window().maximize();

		// search hotel page1

		WebElement loc = driver.findElement(By.id("location"));
		sendValue(loc, "London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		sendValue(hotel, "Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.id("room_type"));
		sendValue(roomtype, "Double");

		WebElement numofrooms = driver.findElement(By.id("room_nos"));
		sendValue(numofrooms, "4 - Four");

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		sendValue(adultroom, "3 - Three");

		WebElement childroom = driver.findElement(By.id("child_room"));
		sendValue(childroom, "2 - Two");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		Thread.sleep(6000);

		// search hotel page2

		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();

		WebElement cnt = driver.findElement(By.id("continue"));
		cnt.click();

		Thread.sleep(6000);

		// book a hotel page3

		WebElement firstname = driver.findElement(By.id("first_name"));
		sendValue(firstname, "Abinaya");

		WebElement lastname = driver.findElement(By.id("last_name"));
		sendValue(lastname, "D");

		WebElement billingaddress = driver.findElement(By.id("address"));
		sendValue(billingaddress, "Sri Hari Appartment");

		WebElement creditcard = driver.findElement(By.id("cc_num"));
		sendValue(creditcard, "1234567890987654");

		WebElement dummy = driver.findElement(By.xpath("//label[contains(text(),'Use 16 digit Dummy Data')]"));
		String text = dummy.getText();
		System.out.println(text);

		WebElement cardtype = driver.findElement(By.id("cc_type"));
		sendValue(cardtype, "VISA");

		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
		sendValue(expdate, "March");

		WebElement expdate1 = driver.findElement(By.id("cc_exp_year"));
		sendValue(expdate1, "2027");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendValue(cvv, "123");

		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();

		WebElement text1 = driver.findElement(
				By.xpath("//label[contains(text(),'Please wait! We are processing your Hotel Booking...')]"));
		String text2 = text1.getText();
		System.out.println(text2);
		Thread.sleep(6000);

		// logout

		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();

		Thread.sleep(3000);

	}

}
