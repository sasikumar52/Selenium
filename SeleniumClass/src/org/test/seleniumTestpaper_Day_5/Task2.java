package org.test.seleniumTestpaper_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
}
