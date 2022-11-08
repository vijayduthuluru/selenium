package org.seliniumTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {

	WebDriver driver;

	@Test(priority = 1)
	public void myntraUrl() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.myntra.com/login/password");
	Thread.sleep(1000);
	}
	@Test(priority = 2)
	public void myntraLogin() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("myntra");
	}

	@Test(priority = 3)
	public void myntraPassword() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("myntra password");
	}
}
