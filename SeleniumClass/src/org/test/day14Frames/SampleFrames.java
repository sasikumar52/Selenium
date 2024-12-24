package org.test.day14Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Frames
public class SampleFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement img = driver.findElement(By.xpath("//div[@class='whyLearn']"));
		img.click();
	}

}
