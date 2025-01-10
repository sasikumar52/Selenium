package org.test.seleniumTestpaper_Day_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement btnSignUp = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignUp.click();
		WebElement lnkRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		lnkRegister.click();
		driver.switchTo().frame("loginIframe");
		WebElement txtMobile = driver.findElement(By.id("userName"));
		txtMobile.sendKeys("9012347899");
		WebElement btnContinue = driver.findElement(By.id("checkUser"));
		btnContinue.click();
	
	}

}
