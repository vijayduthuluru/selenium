package org.selinium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void cricBuzz() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");

		WebElement webElement = driver.findElement(By.xpath("(//ul[@class='cb-ftr-ul'])"));
		System.out.println(webElement.getText());
		List<WebElement> footertext = webElement.findElements(By.tagName("a"));

		System.out.println(footertext.size());

		for (int i = 0; i <footertext.size(); i++) {
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footertext.get(i).sendKeys(chord);
			
		}
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		for (String window : windowHandles) {
			WebDriver tittle = driver.switchTo().window(window);
			System.out.println("tittle======= " + tittle.getTitle());
			
		}
		
		
	}
		
//		Iterator<String> iterator = windowHandles.iterator();
//		while (iterator.hasNext()) {
//			WebDriver window = driver.switchTo().window(iterator.next());
//			System.out.println(" tittle " + window.getTitle());
//			
		
		
		
		
	

	public static void main(String[] args) {
		cricBuzz();

	}

}
