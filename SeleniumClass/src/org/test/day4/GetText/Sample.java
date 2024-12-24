package org.test.day4.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Get Text
public class Sample {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtLogin = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = txtLogin.getText();
		System.out.println(text);
		
		
	}

}
