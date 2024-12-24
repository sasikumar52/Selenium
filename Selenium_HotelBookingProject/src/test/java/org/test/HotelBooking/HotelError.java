package org.test.HotelBooking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelError {
	WebDriver driver;
	public void booking()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("sasimathiru97@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Sasi@123");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		WebElement afterLoginMsg = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String LoginMsg = afterLoginMsg.getText();
		System.out.println(LoginMsg);
		
		WebElement frame1 = driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.switchTo().defaultContent();

		List<WebElement> searchLists = driver.findElements(By.xpath("//div[@class='invalid-feedback animated fadeInDown']"));
		for (WebElement searchList : searchLists) {
			String searchListText = searchList.getText();
			System.out.println(searchListText);
         }
		
	}
	public static void main(String[] args) {
		HotelError booking = new HotelError();
		booking.booking();
	}

}
