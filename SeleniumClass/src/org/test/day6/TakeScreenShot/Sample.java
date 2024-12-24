package org.test.day6.TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Take Screenshot 
public class Sample {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Initialize take screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		
		//Destination path
		File f= new File("D:\\Sasikumar Java\\eclipse projects\\SeleniumClass\\ScreenShot\\fb.png");
		//Store the Screenshot in destination path
		FileUtils.copyFile(s, f);
		
		//take screenshot in particular webElement
		WebElement screen = driver.findElement(By.xpath("//div[@class='_8ice']"));
		File a = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(a);
		File b= new File("D:\\Sasikumar Java\\eclipse projects\\SeleniumClass\\ScreenShot\\fbelement.png");	
		FileUtils.copyFile(a, b);
		driver.quit();
		
		
		
		
	}

}
