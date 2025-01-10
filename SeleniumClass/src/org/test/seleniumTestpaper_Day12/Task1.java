package org.test.seleniumTestpaper_Day12;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");

		WebElement txtEmail = driver.findElement(By.id("email"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','Sasi')", txtEmail);
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','Sasi@123')", txtPassword);

		Object object = js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		String nameString=(String) object;
		System.out.println(nameString);
		
		Object object2 = js.executeScript("return arguments[0].getAttribute('value')", txtPassword);
		String passString=(String) object2;
		System.out.println(passString);
	}
}
