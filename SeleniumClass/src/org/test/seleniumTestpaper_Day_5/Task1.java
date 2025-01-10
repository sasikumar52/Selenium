	package org.test.seleniumTestpaper_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement scrElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement desElement = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(scrElement, desElement).perform();
		
		WebElement src1Element = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement des1Element = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(src1Element, des1Element).perform();

		WebElement scr2Element = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement des2Element = driver.findElement(By.id("loan"));
		actions.dragAndDrop(scr2Element, des2Element).perform();
		
		WebElement src3Element = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des3Element = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(src3Element, des3Element).perform();
	}

}
