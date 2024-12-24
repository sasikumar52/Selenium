package org.test.day3.LocatorByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Find Element By Id Locator
public class Sample {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("OmrBranch@12455");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Greens@omr124");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnLogin.click();
	}
}