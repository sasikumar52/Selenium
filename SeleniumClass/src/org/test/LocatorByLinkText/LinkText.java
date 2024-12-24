package org.test.LocatorByLinkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (WebElement webElement : elements) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		driver.findElement(By.linkText("Mobiles")).click();
	}
}
