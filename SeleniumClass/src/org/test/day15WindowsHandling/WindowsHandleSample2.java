package org.test.day15WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Switching the windows using List
public class WindowsHandleSample2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone", Keys.ENTER);

		WebElement lnkIphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']"));
		lnkIphone.click();

		String parWindowId = driver.getWindowHandle();
		System.out.println(parWindowId);

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		List<String>li=new ArrayList<String>();
		li.addAll(allWindowsId);
		String x = li.get(1);
		driver.switchTo().window(x);
		
		WebElement btnAddCart = driver.findElement(By.id("add-to-cart-button"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btnAddCart);
		
		driver.switchTo().window(parWindowId);
		driver.close();
		
	}

}
