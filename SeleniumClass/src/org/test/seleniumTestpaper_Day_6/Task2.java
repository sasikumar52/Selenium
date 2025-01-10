package org.test.seleniumTestpaper_Day_6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.google.co.in/webhp");
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		
		WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']"));
		
		Actions actions=new Actions(driver);
		
		actions.doubleClick(element).perform();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}
