package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDN {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Prem2896");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("9H2V85");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement Location = driver.findElement(By.id("location"));
		
		Select s = new Select(Location);
		
		s.selectByIndex(2);
		
		List<WebElement> all = s.getOptions();
		
		all.get(2);
		
		System.out.println(all.get(2).getText());
		
		for (WebElement x : all) {
			
			System.out.println(x.getAttribute("Value"));
			
			
		}
		
		
		
		
}
}