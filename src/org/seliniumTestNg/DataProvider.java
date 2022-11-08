package org.seliniumTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	WebDriver driver;

	@Test(priority = 1)
	public void orangeHrm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}

	@Test(priority = (int) 1.1, dataProvider = "getData")
	
	public void orangeHrmLogin(String username, String password) throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
	}

//
//	@Test(priority = (int) 1.2)
//	public void orangeHrmPassword() throws InterruptedException {
//
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = (int) 1.3)
//	public void orangeHrmSubmitutton() throws InterruptedException {
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);
//	}

@org.testng.annotations.DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "1111111";
		data[0][1] = "22222";
		data[1][0] = "33333333333";
		data[1][1] = "444444";
		data[2][0] = "Admin";
		data[2][1] = "admin123";
		return data;
	}

}
