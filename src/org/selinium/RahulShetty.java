package org.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShetty {

	public static void iFrame() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement findElement = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(2000);
		Select droupdown = new Select(findElement);
				droupdown.selectByVisibleText("Option3");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		iFrame();
	}

	

}