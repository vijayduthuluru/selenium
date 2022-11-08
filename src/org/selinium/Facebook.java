package org.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void getingText() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
WebElement findElement = driver.findElement(By.name("q"));
findElement.sendKeys("s");

	
}



	


	public static void main(String[] args) {
		getingText();
	}


}
