package org.test.seleniumTestpaper_Day_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(" https://www.shopclues.com/wholesale.html");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
		
	}

}
