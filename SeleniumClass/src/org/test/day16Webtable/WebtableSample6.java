package org.test.day16Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Get rows using enhanced for loop
public class WebtableSample6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		for (WebElement tableRow : tableRows) {
			List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
			for (WebElement tableData : tableDatas) {
				String text = tableData.getText();
				System.out.println(text);

			}
		}
	}
}
