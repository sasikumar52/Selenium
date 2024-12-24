package org.test.day12KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		
		Actions actions=new Actions(driver);
		actions.sendKeys(element,"Hexaware Technologies").keyDown(Keys.ENTER).perform();
		
	}

}
