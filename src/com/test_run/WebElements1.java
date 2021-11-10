package com.test_run;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class WebElements1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement signUp = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy' ]"));
		signUp.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//input[@data-type='text']"));
		firstName.sendKeys("mahesh");
		WebElement lastName = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));

		lastName.sendKeys("N");
		WebElement phoneOrEmailId = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		phoneOrEmailId.sendKeys("Maheshkumar@yahoo.in");
		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmEmail.sendKeys("MaheshkumarN@yahoo.in");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("qwsdfc$765");
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(25);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(0);
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByIndex(24);
		WebElement clickBox = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		clickBox.click();
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\mahesh mk\\eclipse-workspace\\Selenium_Testing\\screenshot\\ss(error).png");
		FileUtils.copyFile(source, destination);

	}

}