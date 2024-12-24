package org.test.day16Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to get all the data's from the table
public class WebtableSample3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		// iterate the table rows
		for (int i = 0; i < tableRows.size(); i++) {
			// get the rows one by one from table rows
			WebElement tableRow = tableRows.get(i);
			List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
			// iterate the table datas
			for (int j = 0; j < tableDatas.size(); j++) {
				// get the datas one by one from table datas
				WebElement tableData = tableDatas.get(j);
				// get the text from the webpage
				String text = tableData.getText();
				System.out.println(text);
			}
		}
	}

}
