package org.test.seleniumday1testpaper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//ChromeBrowser
public class Task2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.get(" http://gmail.com/");
		driver.get(" http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");

	}

}
