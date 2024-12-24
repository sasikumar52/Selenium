package org.test.day15WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Switching the Windows control [Windows Handling]
public class WindowsHandleSample1 {
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

		// iterate all windows id using for each loop
		for (String eachWindowId : allWindowsId) {

			if (!parWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}

		WebElement btnAddCart = driver.findElement(By.id("add-to-cart-button"));
		//btnAddCart.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btnAddCart);
	}

}
