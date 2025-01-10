package org.test.seleniumTestpaper_Day_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement element = driver.findElement(By.name("country"));
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
}
