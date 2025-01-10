package org.test.seleniumTestpaper_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Sasi");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Kumar");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		txtAddress.sendKeys("19, panchayat main road, Perungudi");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("Sasikumar@gmail.com");
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhone.sendKeys("9047898091");
		
		WebElement txtLanguage = driver.findElement(By.xpath("//div[@id='msdd']"));
		txtLanguage.sendKeys("Tamil");
		
		WebElement txtFirstPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtFirstPassword.sendKeys("Sasi@123");
		
		WebElement txtSecondPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtSecondPassword.sendKeys("Sasi@123");

		
		

		
		
	
		
		
		
		
		
	}

}
