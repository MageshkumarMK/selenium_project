package com.testing1project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Mahesh115");
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("qwerty@123");
		driver.findElement(By.className("login_button")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		WebElement location = driver.findElement(By.id("location"));
		Select a = new Select(location);
		a.selectByVisibleText("Los Angeles");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select b = new Select(hotel);
		b.selectByIndex(1);
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select c = new Select(roomType);
		c.selectByValue("Super Deluxe");
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select d = new Select(roomNos);
		d.selectByIndex(2);
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("28/10/2021");
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("30/10/2021");
		WebElement adultsNos = driver.findElement(By.id("adult_room"));
		Select e = new Select(adultsNos);
		e.selectByIndex(2);
		driver.findElement(By.className("reg_button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("radiobutton_0")).click();
		// driver.findElement(By.xpath("//*[@id=\"select_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"select_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]"))
		driver.findElement(By.id("continue")).click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstName.sendKeys("Mahesh ");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea"))
				.sendKeys("67 mh road california ");
		driver.findElement(By.cssSelector("#cc_num")).sendKeys("1234567891234567");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select f = new Select(ccType);
		f.selectByIndex(1);
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		Select g = new Select(ccMonth);
		g.selectByIndex(3);
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select h = new Select(ccYear);
		h.selectByIndex(12);
		driver.findElement(By.id("cc_cvv")).sendKeys("619");
		driver.findElement(By.id("book_now")).click();
		driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]")).click();
		 driver.findElement(By.cssSelector("#booked_form > table > tbody > tr:nth-child(3) > td > input:nth-child(1)")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();

	}

}
