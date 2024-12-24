package org.test.day7JavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		WebElement up = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}

}
