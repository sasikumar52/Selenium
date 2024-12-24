package org.test.day12KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRobotClass2 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		//SHIFT
		robot.keyPress(KeyEvent.VK_SHIFT);
		//g
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		//r
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
	
		//Release SHIFT
		robot.keyRelease(KeyEvent.VK_SHIFT);
		//TAB
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		//Press SHIFT
		robot.keyPress(KeyEvent.VK_SHIFT);
		//a
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		//b
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		//Release SHIFT
		robot.keyRelease(KeyEvent.VK_SHIFT);
	
	
		

	}

}
