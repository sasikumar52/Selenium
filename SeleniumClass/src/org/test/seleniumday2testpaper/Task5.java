package org.test.seleniumday2testpaper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Error in Program

public class Task5 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		WebElement txtCustId = driver.findElement(By.xpath("//input[@type='text']"));
		txtCustId.sendKeys("123456789");
	}

}
