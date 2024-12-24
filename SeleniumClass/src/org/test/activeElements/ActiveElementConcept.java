package org.test.activeElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("Sasikumar",Keys.TAB,"Sasi@vini",Keys.ENTER);
	}
}
