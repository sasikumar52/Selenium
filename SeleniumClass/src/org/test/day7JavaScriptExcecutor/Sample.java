package org.test.day7JavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Java Script Executor
public class Sample {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Insert the Values in TextBox
		WebElement txtUserName = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','GreensOMR')", txtUserName);
		
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Greens@123')", txtPassWord);
		
		//To Click The button
		WebElement btnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnLogin);
		
		//Get the attribute value
		Object o = js.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		
		//Convert object into string
		String s= (String)o;
		System.out.println(s);


	}

}
