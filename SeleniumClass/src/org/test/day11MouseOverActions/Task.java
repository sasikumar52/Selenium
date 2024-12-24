package org.test.day11MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		WebElement btnCurrent = driver.findElement(By.xpath("//button[contains(text(),'current date')]"));
		btnCurrent.click();
		
		WebElement btnFuture = driver.findElement(By.xpath("//button[contains(text(),'future date')]"));
		actions.doubleClick(btnFuture).perform();
		
		WebElement btnPast = driver.findElement(By.xpath("//button[contains(text(),'past date')]"));
		actions.contextClick(btnPast).perform();


		

		
	}

}
