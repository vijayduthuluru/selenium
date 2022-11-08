package org.seliniumTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	
	
	WebDriver driver;
	

	@Test(priority = 1)
	public void facebookUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	@Parameters("username")
	public void facebookLogin(String username) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	@Parameters("password")
	private void facebookPassword(String password) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	
		
		
	

}
