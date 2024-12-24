package org.test.seleniumday2testpaper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@Class='_aa4b _add6 _ac4d _ap35'])[1]"));
		txtUserName.sendKeys("Masssasi52@gmail.com");
		
		WebElement txtPassWord = driver.findElement(By.xpath("(//input[@Class='_aa4b _add6 _ac4d _ap35'])[2]"));
		txtPassWord.sendKeys("123456");
		
		
		
	}


}
