package org.test.seleniumTestpaper_Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Interner Explorer Driver
public class Task3 {
	public static void main(String[] args) {
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get(" http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");

	}

}
