package org.test.seleniumTestpaper_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Hello");
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Hello@123");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
	}

}
