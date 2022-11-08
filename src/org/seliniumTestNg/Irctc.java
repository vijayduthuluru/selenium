package org.seliniumTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
//vikduthu@gmail.com
	//vikram@123

	public static void trainTicketBooking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		// login
		driver.findElement(By.xpath("//button[@class='search_btn']")).click();
		Thread.sleep(2000);  //button[@class='search_btn']

		 driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("hello");

	}

	public static void main(String[] args) throws InterruptedException {
		trainTicketBooking();
	}

}
