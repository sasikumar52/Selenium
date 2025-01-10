package org.test.seleniumTestpaper_Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://greenstech.in/selenium-course-content.html");
		

		WebElement txtElement = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		String text = txtElement.getText();
		System.out.println(text);
	}

}
