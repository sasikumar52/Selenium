package org.test.seleniumTestpaper_Day_3;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();                                                                                               
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement lnkInter = driver.findElement(By.id("heading20"));
		lnkInter.click();
		WebElement lnkCTS = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkCTS).perform();
		
		
		
		
	}

}
