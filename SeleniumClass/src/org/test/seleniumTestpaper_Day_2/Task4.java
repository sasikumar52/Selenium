package org.test.seleniumTestpaper_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.name("DUMMY1"));
		txtUser.sendKeys("GreensTechnology");
	}

}
