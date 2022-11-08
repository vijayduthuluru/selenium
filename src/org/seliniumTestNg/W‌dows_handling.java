package org.seliniumTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W‌dows_handling {

	public static void cricBuzz() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.cricbuzz.com/");		

	}
	public static void main(String[] args) {
		cricBuzz();
		
	}

}
