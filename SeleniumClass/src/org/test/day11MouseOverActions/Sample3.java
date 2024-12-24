package org.test.day11MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 {
	public static void main(String[] args) {
		//Right Click
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement lnkGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
			
			Actions actions = new Actions(driver);
			
			actions.contextClick(lnkGmail).perform();
				
	}

}
