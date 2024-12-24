package org.test.day16Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium Webtable
//1.How to get all the rows from the table
public class WebtableSample1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		// iterate the table rows
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement tableRow = tableRows.get(i);
			String text = tableRow.getText();
			System.out.println(text);
		}
	}

}
