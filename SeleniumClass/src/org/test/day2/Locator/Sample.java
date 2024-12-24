package org.test.day2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Find Element By Id Locator
public class Sample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("GreensOMR");
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Greens@123");

	}
}
