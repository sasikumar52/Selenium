package org.test.seleniumday2testpaper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement txtSource = driver.findElement(By.id("src"));
		txtSource.sendKeys("Chennai");
		
		WebElement txtDest = driver.findElement(By.id("dest"));
		txtDest.sendKeys("Kumbakonam");
	}
}
