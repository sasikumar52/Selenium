package org.test.seleniumday3testpaper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.test.day9Wait.WebdriverWait;

public class Task10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n"
				+ "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement txtFirstName = driver.findElement(By.name("firstName"));
		txtFirstName.sendKeys("Sasi");
		WebElement txtLastName = driver.findElement(By.name("lastName"));
		txtLastName.sendKeys("kumar");
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
		
		WebElement selectMonth = driver.findElement(By.id("month"));
		Select select=new Select(selectMonth);
		select.selectByValue("6");
		WebElement txtDay = driver.findElement(By.name("day"));
		txtDay.sendKeys("27");
		WebElement txtYear = driver.findElement(By.name("year"));
		txtYear.sendKeys("1999");
		WebElement selectGender = driver.findElement(By.id("gender"));
		Select select2=new Select(selectGender);
		select2.selectByValue("1");
		WebElement btnNext2 = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext2.click();
		
		WebElement txtUserName = driver.findElement(By.name("Username"));
		WebElement btnNext3 = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext3.click();
	
	}

}
