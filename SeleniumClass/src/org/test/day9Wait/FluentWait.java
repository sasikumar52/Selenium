package org.test.day9Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		Object object = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		
		WebElement element=(WebElement)object;
		element.sendKeys("Hello");
	}

}
