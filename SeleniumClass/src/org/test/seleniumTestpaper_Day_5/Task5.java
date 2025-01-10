package org.test.seleniumTestpaper_Day_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement element = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		actions.moveToElement(element2).perform();
		
		driver.findElement(By.xpath("//span[text()='Selenium Certification Training']")).click();
		
		
	}
}
