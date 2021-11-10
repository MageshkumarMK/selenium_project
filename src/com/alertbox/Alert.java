package com.alertbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		a1.click();
		WebElement a11 = driver.findElement(By.xpath("(//button[@onclick='alertbox()'])"));
		a11.click();

		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);

		WebElement b1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		b1.click();
		WebElement b11 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		b11.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();

		alert2.dismiss();

		WebElement c1 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		c1.click();
		WebElement c11 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		c11.click();
		Thread.sleep(1000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Mahesh");
		driver.switchTo().alert().accept();
	

	}

}
