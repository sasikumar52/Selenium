package org.test.seleniumTestpaper_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("sasikumar@123");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Sasi@123kumar");
	}

}
