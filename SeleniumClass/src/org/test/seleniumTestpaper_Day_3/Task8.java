package org.test.seleniumTestpaper_Day_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement lnkModel = driver.findElement(By.id("heading201"));
		lnkModel.click();
		WebElement lnkResume = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", lnkResume);

	}

}
