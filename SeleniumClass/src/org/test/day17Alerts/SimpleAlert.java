package org.test.day17Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btnAlert.click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
	}

}
