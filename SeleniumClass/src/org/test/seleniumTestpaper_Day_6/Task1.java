package org.test.seleniumTestpaper_Day_6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
}
