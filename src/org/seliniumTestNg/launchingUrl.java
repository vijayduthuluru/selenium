package org.seliniumTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class launchingUrl {

	WebDriver driver;
	

	@BeforeSuite
	public void launchingU() throws InterruptedException {
		
		
		
		//driver.manage().timeouts().wait(3000);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

	}

	@Test
	public void password() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	}

	@AfterSuite
	public void loginbutton() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
