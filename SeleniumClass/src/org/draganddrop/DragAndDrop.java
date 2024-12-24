package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		WebElement s = driver.findElement(By.id("fifth"));
		WebElement d = driver.findElement(By.id("selenium-class"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();

	}

}
