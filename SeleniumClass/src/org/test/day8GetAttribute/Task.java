package org.test.day8GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirstName.sendKeys("Sasi");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLastName.sendKeys("Kumar");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtAddress.sendKeys("99,anna nagar, bhavani");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("sasikumar@gmail.com");
		
		WebElement txtPhone = driver.findElement(By.id("phone"));
		txtPhone.sendKeys("9047898091");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Sasi@123");
		
		WebElement txtConfirmPassword = driver.findElement(By.id("confirm-password"));
		txtConfirmPassword.sendKeys("Sasi@123");
		
		
		
		
	


	}

}
