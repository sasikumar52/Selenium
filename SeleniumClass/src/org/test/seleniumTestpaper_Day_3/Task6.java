package org.test.seleniumTestpaper_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();                                                                                               
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement btnAccount = driver.findElement(By.xpath("//span[text()='Account']"));
		btnAccount.click();
		WebElement lnkLogin = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		lnkLogin.click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frameElement);
		WebElement txtPhone = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtPhone.sendKeys("9047898091");
		WebElement check = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
		check.click();
	}

}
