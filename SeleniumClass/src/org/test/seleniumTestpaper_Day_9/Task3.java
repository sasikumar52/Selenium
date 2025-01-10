package org.test.seleniumTestpaper_Day_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement element = driver.findElement(By.name("birthday_year"));
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for(int i=0;i<options.size();i++)
		{
			WebElement webElement = options.get(i);
			String attribute = webElement.getAttribute("value");
			System.out.println(attribute);
		}
		
	}
}
