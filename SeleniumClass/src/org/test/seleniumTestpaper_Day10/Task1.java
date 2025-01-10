package org.test.seleniumTestpaper_Day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.snapdeal.com/ ");
	
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 13",Keys.ENTER);
		driver.findElement(By.xpath("(//p[@class='product-title'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String>li=new ArrayList<String>();
		li.addAll(windowHandles);
		String string = li.get(1);
		driver.switchTo().window(string);
		
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();

		String text = driver.findElement(By.xpath("//div[@class='you-pay']")).getText();
		System.out.println(text);
		driver.switchTo().window(li.get(0));
		driver.close();
	}
}
