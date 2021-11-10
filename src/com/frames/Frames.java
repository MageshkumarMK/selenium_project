package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		//WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		//driver.switchTo().frame(singleFrame);
		//WebElement inputText = driver.findElement(By.xpath("//input[@type='text']"));
		//inputText.sendKeys("mK");
		// Thread.sleep(1000);
		//driver.switchTo().defaultContent(); // from frame to webpage
		WebElement tabMultiple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		tabMultiple.click();
		WebElement multipleFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multipleFrame);
		WebElement input1 = driver.findElement(By.xpath("//input[@type='text']"));
		input1.sendKeys("mahesh");

		driver.switchTo().defaultContent();

	}

}
