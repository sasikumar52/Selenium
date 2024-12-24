package org.test.day2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("OmrBranch");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Greens@omr124");
	}

}
