package org.test.HotelBooking;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelAscending {
	public HotelAscending() {
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	Select select;

	public void booking() throws IOException, InterruptedException {
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
		List<WebElement> ddnSelectRooms = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
		for (int i = 0; i < ddnSelectRooms.size(); i++) {
			List<WebElement> ddnSelectRooms1 = driver
					.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
			ddnSelectRooms1.get(i).click();
			ddnRoomType.click();

		}
		ddnRoomType.click();

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

		driver.findElement(By.xpath("//label[text()='Price low to high']")).click();

		Thread.sleep(3000);

		List<Integer> dev = new ArrayList<Integer>();
		ArrayList<Integer> qa = new ArrayList<Integer>();

		List<WebElement> listOfPriceLow = driver.findElements(By.xpath("//div[@class='prize']//h2"));
		for (WebElement webElement : listOfPriceLow) {
			String allPrices = webElement.getText();
			String replaceAll = allPrices.replaceAll("[$, ]", "");
			int converted = Integer.parseInt(replaceAll);
			dev.add(converted);
		}
		qa.addAll(dev);
		Collections.sort(dev);
		Collections.sort(qa);
		if (dev.equals(qa)) {
			System.out.println("Inserted elements in dev " + dev);
			System.out.println("Price low to high is verified");
		} else {
			System.out.println("Price low to high is not verified");
		}

		driver.findElement(By.xpath("//label[text()='Price High to low']")).click();
		Thread.sleep(3000);

		List<Integer> dev1 = new ArrayList<Integer>();
		ArrayList<Integer> qa1 = new ArrayList<Integer>();

		List<WebElement> listOfPriceHigh = driver.findElements(By.xpath("//div[@class='prize']//h2"));
		for (WebElement webElement : listOfPriceHigh) {
			String allPrices = webElement.getText();
			String replaceAll = allPrices.replaceAll("[$, ]", "");
			int converted = Integer.parseInt(replaceAll);
			dev1.add(converted);
		}

		qa1.addAll(dev1);
		Collections.sort(qa1);
		Collections.reverse(qa1);
		if (dev1.equals(qa1)) {
			System.out.println("Inserted elements in dev " + dev1);
			System.out.println("Price High to low is verified");
		} else {
			System.out.println("Price High to Low is not verified");
		}
		driver.findElement(By.xpath("//label[@for='value_nasc']")).click();
		Thread.sleep(3000);

		List<String> dev2 = new ArrayList<String>();
		List<String> qa2 = new ArrayList<String>();
		List<WebElement> hotelNameListAsc = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
		for (int i = 0; i < hotelNameListAsc.size(); i++) {
			String hotelNameText = hotelNameListAsc.get(i).getText();
			dev2.add(hotelNameText);
		}
		qa2.addAll(dev2);
		Collections.sort(qa2);
		if (dev2.equals(qa2)) {
			System.out.println("Inserted elements in dev " + dev2);
			System.out.println("HotelName ascending is verified");
		} else {
			System.out.println("Inserted elements in dev " + dev2);
			System.out.println("Inserted elements in dev " + qa2);
			System.out.println("HotelName ascending is not verified");
		}
		driver.findElement(By.xpath("//label[@for='value_ndesc']")).click();
		Thread.sleep(3000);
		List<String> dev3 = new ArrayList<String>();
		List<String> qa3 = new ArrayList<String>();
		
		List<WebElement> hotelNameListDes = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
		for (int i = 0; i < hotelNameListDes.size(); i++) {
			String hotelNameDesText = hotelNameListDes.get(i).getText();
			dev3.add(hotelNameDesText);
		}
		qa3.addAll(dev3);
		Collections.sort(qa3);
		Collections.reverse(qa3);
		if (dev3.equals(qa3)) {
			System.out.println("Inserted elements in dev " + dev3);
			System.out.println("Price High to low is verified");
		} else {
			System.out.println("Inserted elements in dev " + dev3);
			System.out.println("Inserted elements in dev " + qa3);
			System.out.println("Price High to Low is not verified");
		}


		

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		HotelAscending booking = new HotelAscending();
		booking.booking();
	}

}
