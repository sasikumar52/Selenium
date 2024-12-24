package org.test.day16Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.How to get all the headers from the table
public class WebtableSample2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < tableRows.size(); i++) {
			WebElement tableRow = tableRows.get(i);
			List<WebElement> tableHeaders = tableRow.findElements(By.tagName("th"));
			for (int j = 0; j < tableHeaders.size(); j++) {
				WebElement tableHeader = tableHeaders.get(j);
				String text = tableHeader.getText();
				System.out.println(text);
			}
		}
	}
}
