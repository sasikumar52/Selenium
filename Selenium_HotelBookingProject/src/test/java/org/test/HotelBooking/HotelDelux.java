package org.test.HotelBooking;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelDelux {
	WebDriver driver;
	Select select;

	public void booking() throws InterruptedException {
		// 1.Login
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

		// 2.Search Hotel
		WebElement afterLoginMsg = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String LoginMsg = afterLoginMsg.getText();
		System.out.println(LoginMsg);

		WebElement ddnState = driver.findElement(By.id("state"));
		select = new Select(ddnState);
		select.selectByValue("Tamil Nadu");

		WebElement ddnCity = driver.findElement(By.className("select2-selection__placeholder"));
		ddnCity.click();
		WebElement ddncitySearch = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		ddncitySearch.sendKeys("Chennai", Keys.ENTER);
		// Select all
		WebElement ddnRoomType = driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		ddnRoomType.click();

		List<WebElement> ddRoomTypeList = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));

		ddRoomTypeList.get(1).click();

		WebElement dateCheckIn = driver.findElement(By.name("check_in"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','2024-11-25')", dateCheckIn);

		WebElement dateCheckOut = driver.findElement(By.name("check_out"));
		js.executeScript("arguments[0].setAttribute('value','2024-11-27')", dateCheckOut);

		WebElement ddnRooms = driver.findElement(By.id("no_rooms"));
		select = new Select(ddnRooms);
		select.selectByValue("2");

		WebElement ddnAdults = driver.findElement(By.id("no_adults"));
		select = new Select(ddnAdults);
		select.selectByValue("2");

		WebElement txtNoChild = driver.findElement(By.id("no_child"));
		txtNoChild.sendKeys("1");

		WebElement framHotelSearch = driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(framHotelSearch);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.switchTo().defaultContent();

		// 3. Select Hotel Name
		// Print select hotel
		String selectText = driver.findElement(By.xpath("//h5[contains(text(),'Select')]")).getText();
		System.out.println(selectText);

		Thread.sleep(2000);

		List<WebElement> hotelNameList = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));

		List<Boolean> allHotelList = new ArrayList<Boolean>();

		for (WebElement eachHotel : hotelNameList) {

			String hotelNameText = eachHotel.getText();
			System.out.println(hotelNameText);
			boolean endsWith = hotelNameText.contains("Deluxe");
			allHotelList.add(endsWith);
		}

		if (allHotelList.contains(false)) {
			
			System.out.println("Non Deluxe Htels are present");
		}
		else {
			
			System.out.println("All are Deluxe Hotels");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HotelDelux bDelux = new HotelDelux();
		bDelux.booking();

	}

}
