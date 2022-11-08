package org.selinium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void kids() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

		List<WebElement> Elements = driver.findElements(By.xpath(
				"//li[@class=\"product-base\"]//descendant::div[@class=\"product-price\"]/span/span[@class=\"product-discountedPrice\"]"));
		List<Integer> minvalue = new ArrayList<>();
		// List<String> product = new ArrayList<String>();

		for (WebElement singleproduct : Elements) {

			String text = singleproduct.getText();
			// product.add(text);

			String replace = text.replace("Rs.", "");
			String trim = replace.trim();
			int value = Integer.parseInt(trim);
			minvalue.add(value);

		}

		List<WebElement> dressname = driver
				.findElements(By.xpath("//li[@class=\"product-base\"]//descendant::div[@class=\"product-price\"]"
						+ "/span/span[@class=\"product-discountedPrice\"]//ancestor::div/h3"));
		for (WebElement dress : dressname) {
			String text = dress.getText();
			// System.out.println(text);

		}

		Integer min = Collections.min(minvalue);

		System.out.println("the minimum price is  " + min);
		List<WebElement> findElements = driver.findElements(By
				.xpath("//li[@class='product-base']//descendant::div[@class=\"product-price\"]/span/span[text()='" + min
						+ "']//ancestor::div[@class=\"product-price\"]//preceding-sibling::h3[@class=\"product-brand\"]"));
		for (WebElement webElement : findElements) {
			String minproductname = webElement.getText();
			System.out.println("the minimum price of a product name is " + minproductname);

		}

		// System.out.println(Elements.size());

	}

//
	public static void main(String[] args) {
		kids();

	}

}// ul[@class='results-base']

//face book
////div[@class="_1xHGtK _373qXS"]//descendant::div[@class="_30jeq3"]//parent::div//parent::a//parent::div/div[@class="_2WkVRV"]
