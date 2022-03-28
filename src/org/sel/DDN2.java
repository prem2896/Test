package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDN2 {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Prem2896");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("9H2V85");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select t = new Select(hotels);
		t.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select u = new Select(roomType);
		u.selectByIndex(1);
		
		Thread.sleep(1000);
		
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		Select v = new Select(roomNo);
		v.selectByIndex(3);
		
		Thread.sleep(1000);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.sendKeys("07/03/2022");
		
		Thread.sleep(1000);
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.sendKeys("08/03/2022");
		
		Thread.sleep(1000);
		
		WebElement adultNo = driver.findElement(By.id("adult_room"));
		Select w = new Select(adultNo);
		w.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement childNo = driver.findElement(By.id("child_room"));
		Select x = new Select(childNo);
		x.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
		//
		WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
		btnSelect.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		//
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Prem");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Kumar");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("India");
		
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys("5869256347851245");
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select a = new Select(ccType);
		a.selectByIndex(2);
		
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select b = new Select(ccExpMonth);
		b.selectByIndex(2);
		
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select c = new Select(ccExpYear);
		c.selectByIndex(4);
		
		WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys("124");
	
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
		//
		WebElement orderNo = driver.findElement(By.id("order_no"));
		String orderId = orderNo.getAttribute("value");
		System.out.println(orderId);
}
} 
