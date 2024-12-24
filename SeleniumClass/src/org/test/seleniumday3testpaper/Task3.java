package org.test.seleniumday3testpaper;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();                                                                                               
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Sasi");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Kumar");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("19,Panchayat Mainroad, Perungudi");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("sasikumar@gmail.com");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhone.sendKeys("9047898081");
		
		WebElement btnMale = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		btnMale.click();
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		
		WebElement ddnSkills = driver.findElement(By.id("Skills"));
		Select select= new Select(ddnSkills);
		select.selectByValue("Java");
		
		WebElement ddnLanguage = driver.findElement(By.id("msdd"));		
		ddnLanguage.click();
		
		WebElement sec = driver.findElement(By.id("section"));
		sec.click();
		
		WebElement ddnCountry = driver.findElement(By.id("select2-country-container"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", ddnCountry);
	
		WebElement ddnYear = driver.findElement(By.id("yearbox"));
		Select select1= new Select(ddnYear);
		select1.selectByValue("1997");
		
		WebElement ddnMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select2= new Select(ddnMonth);
		select2.selectByValue("June");
		
		WebElement ddnDay = driver.findElement(By.id("daybox"));
		Select select3= new Select(ddnDay);
		select3.selectByValue("27");
		
		WebElement txtPassword = driver.findElement(By.id("firstpassword"));
		txtPassword.sendKeys("Sasi@123");
		WebElement txtPassword2 = driver.findElement(By.id("secondpassword"));
		txtPassword2.sendKeys("Sasi@123");
		

		
		
	}

}
