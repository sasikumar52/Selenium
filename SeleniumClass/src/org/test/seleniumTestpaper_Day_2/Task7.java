package org.test.seleniumTestpaper_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		
		WebElement txtLocation = driver.findElement(By.name("username"));
		txtLocation.sendKeys("Sasi@124");
	}

}
