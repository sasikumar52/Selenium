package org.addtocartproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//without default address
public class Task2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omrbranch.com/");

		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Sasimathiru97@gmail.com");

		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Sasi@123");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();

		WebElement txtSearch = driver.findElement(By.id("search"));
		txtSearch.sendKeys("Nuts", Keys.ENTER);

		WebElement btnAdd = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		btnAdd.click();

		WebElement btnAdd2 = driver.findElement(By.xpath("//button[@id='cart-22']"));
		btnAdd2.click();

		WebElement btnQuantity = driver.findElement(By.xpath("//div[@class='value-button input-number-increment']"));
		btnQuantity.click();

		WebElement btnGotoCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		btnGotoCart.click();

		WebElement btnAddress = driver.findElement(By.xpath(
				"//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"));
		btnAddress.click();

		WebElement ddnAddressType = driver.findElement(By.id("address_type"));
		ddnAddressType.click();
		Select selectAddress = new Select(ddnAddressType);
		selectAddress.selectByValue("Home");

		WebElement txtFirstName = driver.findElement(By.name("first_name"));
		txtFirstName.sendKeys("Sasi");

		WebElement txtLastName = driver.findElement(By.name("last_name"));
		txtLastName.sendKeys("Sasikumar");

		WebElement txtMobile = driver.findElement(By.name("mobile"));
		txtMobile.sendKeys("9047898091");

		WebElement txtHouseNo = driver.findElement(By.name("apartment"));
		txtHouseNo.sendKeys("99");

		WebElement txtAddress = driver.findElement(By.name("address"));
		txtAddress.sendKeys("Anna Nagar, Pallavaram");

		WebElement ddnState = driver.findElement(By.name("state"));
		Select selectState = new Select(ddnState);
		selectState.selectByVisibleText("Tamil Nadu");

		WebElement ddnCity = driver.findElement(By.name("city"));
		Select selectCity = new Select(ddnCity);
		selectCity.selectByVisibleText("Chennai");

		WebElement txtZipCode = driver.findElement(By.name("zipcode"));
		txtZipCode.sendKeys("600075");

		WebElement btnSaveAddress = driver.findElement(By.xpath("(//button[text()='Save'])[3]"));
		btnSaveAddress.click();

		Thread.sleep(3000);

		WebElement selectPay = driver.findElement(By.xpath("//select[@id='payment_type']"));
		Select select = new Select(selectPay);
		select.selectByValue("debit_card");

		WebElement radioBtn = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		radioBtn.click();

		WebElement txtCardNumber = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		txtCardNumber.sendKeys("5555555555552222");

		WebElement txtMonth = driver.findElement(By.xpath("//select[@id='month']"));
		txtMonth.sendKeys("June", Keys.ENTER);

		WebElement txtYear = driver.findElement(By.id("year"));
		txtYear.sendKeys("2026", Keys.ENTER);

		WebElement txtCVV = driver.findElement(By.name("cvv"));
		txtCVV.sendKeys("123");

		WebElement btnPlaceOrder = driver.findElement(By.xpath("//button[@id='placeOrder']"));
		btnPlaceOrder.click();

		WebElement txtOrderStatus = driver.findElement(By.className("orderStatus"));
		String orderStatus = txtOrderStatus.getText();
		System.out.println(orderStatus);

	}

}
