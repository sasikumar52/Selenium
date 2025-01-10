package org.test.seleniumTestpaper_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("sasikumar@123");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Sasi@123kumar");
	}

}
