package com.dynamicxpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamicx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		List<WebElement> productRate = driver.findElements(By.xpath("(//span[@class='product-strike'])/preceding-sibling::span"));
		ArrayList<Integer> a= new ArrayList<Integer>();
		for (int i = 0; i < productRate.size(); i++) { 
			String replaceAll = productRate.get(i).getText().replaceAll("Rs.", "");
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
		}
			int size =a.size();
			System.out.println("size of productRate"  +size);
			System.out.println(Collections.max(a));
			System.out.println(Collections.min(a));
			
			
		
		
	}

}
