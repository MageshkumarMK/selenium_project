package com.testingday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetProperty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",    
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upCasting

		driver.get("https://www.irctc.co.in/nget/train-search"); // get
		
		

		String currentUrl = driver.getCurrentUrl();     //getCurrentUrl
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();            //maximizing
		
		
		String title = driver.getTitle();            //getTitle
		System.out.println(title);
		
		driver.navigate().to("https://www.fb.com");   //navigateTo
		
		driver.navigate().back();                     //navigateBack
		
		driver.navigate().refresh();                    //refresh
		
		driver.navigate().forward();                     //forward
		  String currentUrl2 = driver.getCurrentUrl();
	        System.out.println(currentUrl2);
		
		driver.close();                                 //close
		
		
		
		
	}
}
