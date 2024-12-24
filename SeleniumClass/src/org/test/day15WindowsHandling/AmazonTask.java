package org.test.day15WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTask {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("Iphone",Keys.ENTER);
		WebElement lnkIpnon = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]"));
		Actions actions=new Actions(driver);
		actions.contextClick(lnkIpnon).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String ParWindowId = driver.getWindowHandle();
		System.out.println(ParWindowId);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		for (String windowId : allWindowsId) {
			if(!ParWindowId.equals(windowId))
			{
				driver.switchTo().window(windowId);
			}
		}
		
		WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btnAddToCart);
		
		
	}
}
