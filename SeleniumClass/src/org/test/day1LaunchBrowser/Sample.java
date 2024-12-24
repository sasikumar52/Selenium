package org.test.day1LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		//launch the web driver
		WebDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.facebook.com/");
		//to maximize the window 
		driver.manage().window().maximize();
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		//to get the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	

}
