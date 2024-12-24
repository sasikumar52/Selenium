package org.test.seleniumday3testpaper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Erode");
		WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
		btnSearch.click();
	}

}
