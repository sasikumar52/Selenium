package org.test.day11MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {
		//Move to element
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement lnkCourses = driver.findElement(By.xpath("//a[text()='Courses ']"));
		actions.moveToElement(lnkCourses).perform();
		
		WebElement lnkOracle = driver.findElement(By.xpath("//a[text()='Oracle Training']"));
		actions.moveToElement(lnkOracle).perform();
		
		WebElement lnkBigdata = driver.findElement(By.xpath("//a[text()='Bigdata Training']"));
		lnkBigdata.click();
		
		
		
		
		
		
	}

}
