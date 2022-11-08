package org.selinium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class geturl {

	@SuppressWarnings("unlikely-arg-type")
	public static void windoshandleing() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println("window id is === " + parentwindow);
		System.out.println("window title is ===" + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("welcome");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> listofwimdows = driver.getWindowHandles();
		
		for (String string : listofwimdows) {
		
				
			
				
			
				driver.switchTo().window(string);
		}
				driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vijay");
			
		}	
			
		
			
		
//		List<String> windows = new ArrayList<>(listofwimdows);
//		System.out.println(listofwimdows);
//		System.out.println(listofwimdows.size());
//		for (int i = 0; i < windows.size(); i++) {
//
//			if (i == 1) {
//				driver.switchTo().window(windows.get(i));
//				driver.manage().window().maximize();
//				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vijay");
//				Thread.sleep(1000);
//				driver.close();
//
//			}
//			
//			else if (i==2) {
//				
//				WebElement findElement = driver.findElement(By.xpath("//input[@id='name']"));
//				findElement.clear();
//				findElement.sendKeys("i am back");
//				
//				
	//	}
//
//		}
//	}

	public static void main(String[] args) throws InterruptedException {
		windoshandleing();

	}

}
