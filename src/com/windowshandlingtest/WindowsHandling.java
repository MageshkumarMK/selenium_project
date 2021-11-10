package com.windowshandlingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actions.Actions;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https\\:www.google.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.findElement(By.id(""));
		
		
	}

}
