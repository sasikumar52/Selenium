package org.test.day15WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Windows Handling
public class Sample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.className("Pke_EE"));
		txtSearch.sendKeys("Realme 5g", Keys.ENTER);
		
		WebElement lnkPhone = driver.findElement(By.xpath("(//div[text()='realme 12 Pro 5G (Submarine Blue, 256 GB)'])[1]"));
		lnkPhone.click();
		
		String parWindowId = driver.getWindowHandle();
		System.out.println(parWindowId);
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		
		List<String>list=new ArrayList<String>();
		list.addAll(allwindowId);
		String x = list.get(1);
		driver.switchTo().window(x);
		
		WebElement btnAddCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		btnAddCart.click();
		
		WebElement btnPlace = driver.findElement(By.xpath("//span[text()='Place Order']"));
		btnPlace.click();
		

	}

}
