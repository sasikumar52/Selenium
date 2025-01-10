package org.test.seleniumTestpaper_Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for(int i=0;i<tableRows.size();i++)
		{
			WebElement tableRow = tableRows.get(i);
			String text = tableRow.getText();
			System.out.println(text);
			
			System.out.println("------------------------------------------------------------");
			
			Thread.sleep(2000);
			List<WebElement> tableHeaders = tableRow.findElements(By.tagName("th"));
			for(int j=0;j<tableHeaders.size();j++)
			{
				WebElement tableHeader = tableHeaders.get(j);
				String text2 = tableHeader.getText();
				System.out.println(text2);
			}

		}
		
	}

	
}
