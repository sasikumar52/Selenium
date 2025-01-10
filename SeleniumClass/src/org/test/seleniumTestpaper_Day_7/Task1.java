package org.test.seleniumTestpaper_Day_7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.greenstechnologys.com/");
		
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		File s = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File file=new File("C:\\Users\\new\\git\\Selenium\\SeleniumClass\\ScreenShot\\Greens.png");
		
		FileUtils.copyFile(s, file);
		
		
		
		
		
	}
}
