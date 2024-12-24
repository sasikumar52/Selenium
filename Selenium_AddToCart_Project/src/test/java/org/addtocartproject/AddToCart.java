package org.addtocartproject;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AddToCart extends BaseClass  {
	public void order() throws IOException, InterruptedException
	{
	chromeBrowserLaunch();
	enterApplnUrl("https://omrbranch.com/");
	maximizeWindow();
	implicitWait();
	
	WebElement txtEmail = findLocatorById("email");
	elementSendKeys(txtEmail,getCellData("OmrProject", 1, 0));
	WebElement txtPass = findLocatorById("pass");
	elementSendKeys(txtPass, getCellData("OmrProject", 1, 1));
	WebElement btnLogin = findLocatorByXpath("//button[@type='submit']");
	elementClick(btnLogin);
	
	WebElement txtSearch = findLocatorById("search");
	elementSendKeys(txtSearch, getCellData("OmrProject", 1, 2));
	WebElement btnSearch = findLocatorByXpath("(//button[@type='submit'])[1]");
	elementClick(btnSearch);
	
	WebElement btnAdd = findLocatorByXpath("(//a[text()='Add'])[2]");
	elementClick(btnAdd);
	WebElement btnAdd2 = findLocatorByXpath("//button[@id='cart-23']");
	elementClick(btnAdd2);
	WebElement btnQuantity = findLocatorByXpath("//div[@class='value-button input-number-increment']");
	elementClick(btnQuantity);
	WebElement btnGoToCart = findLocatorByXpath("//a[text()=' Go To Cart ']");
	elementClick(btnGoToCart);
	
	WebElement btnAddress = findLocatorByXpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
	elementClick(btnAddress);
	WebElement ddnAddressType = findLocatorById("address_type");
	elementClick(ddnAddressType);
	elementSelectByValue(ddnAddressType, "Home");
	
	WebElement txtFirstName = findLocatorByName("first_name");
	elementSendKeys(txtFirstName, getCellData("OmrProject", 1, 3));
	WebElement txtLastName = findLocatorByName("last_name");
	elementSendKeys(txtLastName, getCellData("OmrProject", 1, 4));
	WebElement txtMobile = findLocatorByName("mobile");
	elementSendKeys(txtMobile, getCellData("OmrProject", 1, 5));
	WebElement txtHouseNo = findLocatorByName("apartment");
	elementSendKeys(txtHouseNo, getCellData("OmrProject", 1, 6));
	WebElement txtAddress = findLocatorByName("address");
	elementSendKeys(txtAddress, getCellData("OmrProject", 1, 7));
	
	WebElement ddnState = findLocatorByName("state");
	elementSelectByText(ddnState, "Tamil Nadu");
	WebElement ddnCity = findLocatorByName("city");
	elementSelectByText(ddnCity, "Chennai");
	WebElement txtZipcode = findLocatorByName("zipcode");
	elementSendKeys(txtZipcode, getCellData("OmrProject", 1, 10 ));
	WebElement btnSaveAddress = findLocatorByXpath("(//button[text()='Save'])[3]");
	elementClick(btnSaveAddress);
	
	Thread.sleep(3000);
	
	WebElement selectPay = findLocatorByXpath("//select[@id='payment_type']");
	elementClick(selectPay);
	elementSelectByValue(selectPay, "debit_card");
	WebElement radioBtn = findLocatorByXpath("//label[text()=' Visa ']");
	elementClick(radioBtn);
	
	WebElement txtCardNumber = findLocatorByXpath("//input[@placeholder='Card Number']");
	elementSendKeys(txtCardNumber, getCellData("OmrProject", 1, 11));
	WebElement txtMonth = findLocatorByXpath("//select[@id='month']");
	elementSendKeys(txtMonth, getCellData("OmrProject", 1, 12));
	WebElement txtYear = findLocatorById("year");
	elementSendKeys(txtYear, getCellData("OmrProject", 1, 13));
	WebElement txtCVV = findLocatorByName("cvv");
	elementSendKeys(txtCVV, getCellData("OmrProject", 1, 14));
	
	WebElement btnPlaceOrder = findLocatorByXpath("//button[@id='placeOrder']");
	elementClick(btnPlaceOrder);
	
	WebElement txtOrderNo = findLocatorByXpath("//p[text()='Order No: ']");
	createCellAndSetCellData("OmrProject", 1, 15, elementGetText(txtOrderNo));
	
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		AddToCart add=new AddToCart();
		add.order();
		
	}

}
