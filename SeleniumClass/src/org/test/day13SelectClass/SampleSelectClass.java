package org.test.day13SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Select Class 
public class SampleSelectClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddnCountry = driver.findElement(By.id("country-list"));
		//Select Class
		Select select=new Select(ddnCountry);
		//Select by index
		select.selectByIndex(10);
		
		//Print the count of all options od DD
		//1.Get the all options
		List<WebElement> options = select.getOptions();
		//2.length/ count
		int size = options.size();
		System.out.println(size);

		//Print 10th index option text
		//1.Get the all options
		//2.Get 10th index text
		WebElement element = options.get(10);
		String text = element.getText();
		System.out.println(text);
		
		//Print the all options text
		//1.Get the all options
		//2.Iterate the all option
		for (int i = 0; i < options.size(); i++) {
			//2.1 Get each option
			WebElement element2 = options.get(i);
			//2.2 text
			String text2 = element2.getText();
			System.out.println(text2);
		}
		//DROPDOWN
		WebElement element2 = driver.findElement(By.id("skills"));
		Select select2=new Select(element2);
		select2.selectByIndex(0);
		select2.selectByIndex(1);
		select2.selectByIndex(2);
		
		//Select All options
		//1.Get all options
		List<WebElement> options2 = select2.getOptions();
		for (int i = 0; i <options2.size(); i++) {
			select2.selectByIndex(i); 
		}
	
		//Print all selected option
		List<WebElement> allSelectedOptions = select2.getAllSelectedOptions();
		for (WebElement element3 : allSelectedOptions) {
			String text2 = element3.getText();
			System.out.println(text2);
			
		}
		//Print First selected option
		WebElement firstSelectedOption = select2.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println(text3);
		
		//De selected options
		List<WebElement> options3 = select2.getOptions();
		for (int i = 0; i < 10; i++) {
			select2.deselectByIndex(0);
			select2.deselectByIndex(1);
			select2.deselectByIndex(2);
		}
		
		//isMultiple
		boolean b = select2.isMultiple();
		System.out.println(b);

		
	}

}
