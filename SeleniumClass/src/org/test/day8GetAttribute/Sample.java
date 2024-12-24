package org.test.day8GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Get Attribute
public class Sample {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("GreensOMR");
		String name = txtUserName.getAttribute("value");
		System.out.println(name);
		
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Greens@123");
		String pass = txtPassWord.getAttribute("value");
		System.out.println(pass);

	}
	

}
