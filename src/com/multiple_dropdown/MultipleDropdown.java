package com.multiple_dropdown;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upCasting
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement multipledd = driver.findElement(By.id("multi-select"));
		Select s = new Select(multipledd);
		boolean multiple = s.isMultiple();
		System.out.println("is it multiple dropdown   " + multiple);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) { // for each to iterate string
			System.out.println(webElement.getText());

		}
		int size = options.size(); // size to count options
		System.out.println(size);

		for (int i = 0; i < size; i++) { // for loop
			if (i == 3 || i == 6 || i == 4) {
				s.selectByIndex(i); // multiple select by index
				s.selectByVisibleText("California"); // multiple select by visible text
			//	Thread.sleep(1000);
			//	s.deselectByVisibleText("ohio");
			//	s.deselectByIndex(0);
			//	s.deselectByIndex(3);
			//	s.deselectByVisibleText("oHio");
				
				s.deselectAll();

			}

		}

	}

}
