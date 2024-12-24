package org.test.seleniumday3testpaper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement lnkSIgnIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		lnkSIgnIn.click();
		WebElement lnkCreateAccount = driver.findElement(By.xpath("//a[@class='KUBiz']"));
		lnkCreateAccount.click();
		WebElement txtMobilElement = driver.findElement(By.id("mobile"));
		txtMobilElement.sendKeys("9077889919");
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("Sasi");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("sasi1233@gmail.com");
		WebElement btnContinur = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btnContinur.click();
		

	}
}
