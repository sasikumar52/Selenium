package org.test.HotelBooking;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	public HotelBooking() {
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

		driver.findElement(By.id("email")).sendKeys("sasimathiru97@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sasi@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// 2.Search Hotel
		driver.findElement(By.xpath("(//h3[@class='mt-4'])[2]")).click();

		WebElement afterLoginMsg = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String textWelcomeMessageLogin = afterLoginMsg.getText();
		System.out.println(textWelcomeMessageLogin);

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

		WebElement txtDateCheckIn = driver.findElement(By.name("check_in"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','2024-12-29')", txtDateCheckIn);

		WebElement txtDateCheckOut = driver.findElement(By.name("check_out"));
		js.executeScript("arguments[0].setAttribute('value','2024-12-31')", txtDateCheckOut);

		WebElement ddnNoOfRooms = driver.findElement(By.id("no_rooms"));
		select = new Select(ddnNoOfRooms);
		select.selectByValue("2");

		WebElement ddnNoOfAdults = driver.findElement(By.id("no_adults"));
		select = new Select(ddnNoOfAdults);
		select.selectByVisibleText("2-Two");

		WebElement txtNoOfChild = driver.findElement(By.id("no_child"));
		txtNoOfChild.sendKeys("1");

		WebElement frameSearch = driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(frameSearch);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.switchTo().defaultContent();

		// 3. Select Hotel Name
		// Print select hotel
		String textSelectHotel = driver.findElement(By.xpath("//h5[contains(text(),'Select')]")).getText();
		System.out.println(textSelectHotel);

		// Print last Hotel Name
		List<WebElement> lstHotelName = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
		int size = lstHotelName.size();
		WebElement lastHotelName = lstHotelName.get(size - 1);
		String textLastHotelName = lastHotelName.getText();
		System.out.println("Last Hotel Name : " + textLastHotelName);

		// Print 5th Hotel Price
		List<WebElement> lstHotelPrice = driver.findElements(By.xpath("//div[@class='prize']//h2"));
		WebElement fifthHotelprice = lstHotelPrice.get(4);
		String textFifthHotelPrice = fifthHotelprice.getText();
		System.out.println("5th Hotel Price : " + textFifthHotelPrice);

		// select 3rd Hotel name
		List<WebElement> lstBtnContinue = driver.findElements(By.xpath("//a[@class='btn filter_btn']"));
		WebElement btnThirdHotel = lstBtnContinue.get(2);
		btnThirdHotel.click();

		// Alert Message
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// 4.Book Hotel
		WebElement bookedHotelName = driver.findElement(By.xpath("//h2[@class='px-3 py-2']"));
		String textBookedHotel = bookedHotelName.getText();
		String bookedHotelsubstring = textBookedHotel.substring(13);
		System.out.println("Booked Hotel Name : " + bookedHotelsubstring);

		Thread.sleep(3000);

		// Add Guest Details
		driver.findElement(By.xpath("//input[@id='own']")).click();

		WebElement ddnUserTitle = driver.findElement(By.id("user_title"));
		select = new Select(ddnUserTitle);
		select.selectByValue("Mr");

		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("Sasi");

		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("Kumar");

		WebElement txtPhone = driver.findElement(By.id("user_phone"));
		txtPhone.sendKeys("9047898091");

		WebElement txtEmail1 = driver.findElement(By.id("user_email"));
		txtEmail1.sendKeys("sasimathiru97@gmail.com");

		// Add GST Details
		WebElement btnGST = driver.findElement(By.id("gst"));
		btnGST.click();

		WebElement txtRegistration = driver.findElement(By.id("gst_registration"));
		txtRegistration.sendKeys("9043592058");

		WebElement txtCompanyName = driver.findElement(By.id("company_name"));
		txtCompanyName.sendKeys("Greens Tech OMR Branch");

		WebElement txtCompanyAddress = driver.findElement(By.id("company_address"));
		txtCompanyAddress.sendKeys("Thoraipakkam");

		WebElement btnNextStep = driver.findElement(By.id("step1next"));
		btnNextStep.click();

		// Add Special Request
		WebElement btnLate = driver.findElement(By.id("late"));
		btnLate.click();

		WebElement txtRequest = driver.findElement(By.id("other_request"));
		txtRequest.sendKeys("we need Late Check-in");

		WebElement btnNextStep2 = driver.findElement(By.id("step2next"));
		btnNextStep2.click();

		// Add payment Details
		WebElement btnCardType = driver.findElement(By.xpath("//div[@class='credit-card pm']"));
		btnCardType.click();

		WebElement ddnPaymentType = driver.findElement(By.id("payment_type"));
		select = new Select(ddnPaymentType);
		select.selectByValue("debit_card");

		WebElement ddnCardType = driver.findElement(By.id("card_type"));
		select = new Select(ddnCardType);
		select.selectByValue("visa");

		WebElement txtCardNum = driver.findElement(By.id("card_no"));
		txtCardNum.sendKeys("5555555555552222");

		WebElement txtCardName = driver.findElement(By.id("card_name"));
		txtCardName.sendKeys("Sasikumar");

		WebElement ddnCardMonth = driver.findElement(By.id("card_month"));
		select = new Select(ddnCardMonth);
		select.selectByVisibleText("November");

		/*
		 * WebElement ddnCardYear = driver.findElement(By.id("card_year")); select = new
		 * Select(ddnCardYear); select.selectByVisibleText("2024");
		 */
		WebElement txtCVV = driver.findElement(By.id("cvv"));
		txtCVV.sendKeys("123");

		WebElement btnSubmit = driver.findElement(By.id("submitBtn"));
		btnSubmit.click();

		WebElement orderId = driver.findElement(By.xpath("//h2[@class='couppon-code']"));
		String textOrderId = orderId.getText();
		String orderIdSubString = textOrderId.substring(1, 11);
		System.out.println(orderIdSubString);

		WebElement bookingConfirmation = driver.findElement(By.xpath("//h2[text()=' Booking is Confirmed ']"));
		String textBookingConfirmation = bookingConfirmation.getText();
		String substring2 = textBookingConfirmation.substring(12);
		System.out.println(substring2);

		// 5.change Booking
		WebElement btnWelcome = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
		btnWelcome.click();

		WebElement btnMyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		btnMyAccount.click();
		
	String bookingText = driver.findElement(By.xpath("(//div[@class='col-md-5'])[1]")).getText();
	String bookingSubString = bookingText.substring(0, 8);
	System.out.println(bookingSubString);

		// search order Id
		WebElement txtSearch = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].setAttribute('value','" + orderIdSubString + "');", txtSearch);

		WebElement btnEdit = driver.findElement(By.xpath("//button[text()='Edit']"));
		btnEdit.click();

		// Enter only CheckInDate
		WebElement txtEditCheckinDate = driver
				.findElement(By.xpath("//input[@class='form-control from hasDatepicker']"));
		js.executeScript("arguments[0].setAttribute('value','2024-12-30')", txtEditCheckinDate);

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		// print Booking updated successfully
		String textBookingSuccessMsg = driver.findElement(By.xpath("//li[@class='alertMsg']")).getText();
		System.out.println(textBookingSuccessMsg);

		// 6.Cancel Booking

		// search order Id
		WebElement txtSearchCancel = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].setAttribute('value', '" + orderIdSubString + "');", txtSearchCancel);

		String actOrderIdtext = driver.findElement(By.xpath("//div[@class='room-code']")).getText();
		String substring = actOrderIdtext.substring(1, 11);
		System.out.println("Actual order id text: " + substring);

		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		// print Your booking cancelled successfully
		String bookingCancelText = driver.findElement(By.xpath("//li[@class='alertMsg']")).getText();
		System.out.println(bookingCancelText);

		// search order Id
		WebElement txtSearchCancel2 = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].setAttribute('value','" + orderIdSubString + "');", txtSearchCancel2);

		// print cancelled
		String cancelText = driver.findElement(By.xpath("//button[text()='Cancelled']")).getText();
		System.out.println(cancelText);

		WebElement txtSearch1 = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].setAttribute('value','" + orderIdSubString + "');", txtSearch1);

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		HotelBooking booking = new HotelBooking();
		booking.booking();
	}
}
