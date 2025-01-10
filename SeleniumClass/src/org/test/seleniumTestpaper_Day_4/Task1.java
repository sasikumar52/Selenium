package org.test.seleniumTestpaper_Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.greenstechnologys.com/");
		
		WebElement txtWebElement = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		String text = txtWebElement.getText();
		System.out.println(text);
		driver.quit();
	}

}
