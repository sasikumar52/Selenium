package org.test.day12KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
     	robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
