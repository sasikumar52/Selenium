package org.test.day17Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement lnkAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		lnkAlert.click();
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnAlert.click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		String text = al.getText();
		System.out.println(text);
		al.sendKeys("Sasi Kumar");
		al.accept();
	
		

	}

}
