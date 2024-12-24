package org.test.seleniumday4testpaper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.greenstechnologys.com/");
		
		WebElement txtElement = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		String text = txtElement.getText();
		System.out.println(text);
	}

}
