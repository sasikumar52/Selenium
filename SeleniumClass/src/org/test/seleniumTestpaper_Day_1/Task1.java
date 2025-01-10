package org.test.seleniumTestpaper_Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//FireFox Driver
public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.get(" https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");

	}
}
