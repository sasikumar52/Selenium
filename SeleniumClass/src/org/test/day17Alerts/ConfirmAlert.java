package org.test.day17Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement lnkAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		lnkAlert.click();
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnAlert.click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		//to click to cancel the button
		al.dismiss();
	}

}
