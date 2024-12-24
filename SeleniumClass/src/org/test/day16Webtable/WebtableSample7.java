package org.test.day16Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//get last row from the table
public class WebtableSample7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		int lastIndex=tableRows.size()-1;
		WebElement lastRow = tableRows.get(lastIndex);
		String text = lastRow.getText();
		System.out.println(text);
	}

}
