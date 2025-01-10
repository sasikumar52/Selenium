package org.test.seleniumTestpaper_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement lnkLogin = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		lnkLogin.click();
		WebElement txtMobile = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','9047898091')", txtMobile);
		
	}

}
