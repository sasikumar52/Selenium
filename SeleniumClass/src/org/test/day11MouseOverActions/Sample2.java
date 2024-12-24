package org.test.day11MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	public static void main(String[] args) {
		//Double Click
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Welcome");
		
		Actions actions = new Actions(driver);
		actions.doubleClick(txtEmail).perform();
	}

}
