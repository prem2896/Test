package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement adyarAddress = driver.findElement(By.xpath("(//u1[@class='address'])"));
		
		String Adyar = adyarAddress.getText();
		
		System.out.println(Adyar);
		
		System.out.println("=============");

		System.out.println("Create new branch");
		
		System.out.println("Second Branch");
		
	}
	

}
