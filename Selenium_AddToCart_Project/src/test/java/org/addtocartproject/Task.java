package org.addtocartproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	//with default delivery address
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omrbranch.com/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Sasimathiru97@gmail.com");
		
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Sasi@123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		WebElement txtSearch = driver.findElement(By.id("search"));
		txtSearch.sendKeys("Nuts");
		
		WebElement btnSearch = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnSearch.click();
		
		WebElement btnAdd = driver.findElement(By.xpath("(//a[text()='Add'])[2]"));
		btnAdd.click();
		
		WebElement btnAdd2 = driver.findElement(By.xpath("//button[@id='cart-23']"));
		btnAdd2.click();
		
		WebElement btnQuantity = driver.findElement(By.xpath("//div[@class='value-button input-number-increment']"));
		btnQuantity.click();
		
		WebElement btnGotoCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		btnGotoCart.click();
		
		WebElement selectPay = driver.findElement(By.xpath("//select[@id='payment_type']"));
		Select select = new Select(selectPay);
		select.selectByValue("debit_card");
		
		WebElement radioBtn = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		radioBtn.click();
		
		WebElement txtCardNumber = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		txtCardNumber.sendKeys("5555555555552222");
		
		WebElement txtMonth = driver.findElement(By.xpath("//select[@id='month']"));
		txtMonth.sendKeys("June", Keys.ENTER);
		
		WebElement txtYear = driver.findElement(By.id("year"));
		txtYear.sendKeys("2026", Keys.ENTER);
		
		WebElement txtCVV = driver.findElement(By.name("cvv"));
		txtCVV.sendKeys("123");
		
		WebElement btnPlaceOrder = driver.findElement(By.xpath("//button[@id='placeOrder']"));
		btnPlaceOrder.click();
		
		WebElement txtOrderStatus = driver.findElement(By.className("orderStatus"));
		String orderStatus = txtOrderStatus.getText();
		System.out.println(orderStatus);

	}

}
