package org.seliniumTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups {

	WebDriver driver;

	@Test(priority = 1, groups = "BrowseLaunching")
	public void browserLaunching() {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://www.google.com/");

	}

	@Test(priority = 3, groups = "facebook")
	public void facebook() throws InterruptedException {
		driver.get("https://www.facebook.com/");

	}

	@Test(priority = (int) 3.1, groups = "facebook")
	public void facebookLogin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("facebook");

	}

	@Test(priority = (int) 3.2, groups = "facebook")
	private void facebookPassword() throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys("password ");

	}

	@Test(priority = 4, groups = "myntra")
	public void myntraUrl() throws InterruptedException {

		driver.get("https://www.myntra.com/login/password");

	}

	@Test(priority = (int) 4.1, groups = "myntra")
	public void myntraLogin() throws InterruptedException {

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("myntra");

	}

	@Test(priority = (int) 4.2, groups = "myntra")
	public void myntraPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("myntra password");

	}

	@Test(priority = 5, groups = "orangeHrm")
	public void orangeHrm() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}

	@Test(priority = (int) 5.1, groups = "orangeHrm")
	public void orangeHrmLogin() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
	}

	@Test(priority = (int) 5.2, groups = "orangeHrm")
	public void orangeHrmPassword() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
	}

	@Test(priority = (int) 5.3, groups = "orangeHrm")
	public void orangeHrmSubmitutton() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
}
