package org.test.day12KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleActionClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, "Welcome").keyUp(Keys.SHIFT).perform();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement amazonElement = driver.findElement(By.id("twotabsearchtextbox"));
		amazonElement.sendKeys("iphone", Keys.ENTER);

	}

}
