package com.qa.section03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPrices {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.walmart.com");
		// Search Mens Shoes
		driver.findElement(By.cssSelector("#global-search-input")).clear();
		driver.findElement(By.cssSelector("#global-search-input")).sendKeys("Mens Shoes");
		driver.findElement(By.cssSelector("#global-search-submit")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// get WebElements
		List<WebElement> listSearchs = driver.findElements(By.cssSelector("div.search-result-gridview-item-wrapper"));
		for(WebElement product:listSearchs) {
			String productPrice = product.findElement(By.cssSelector("span.price-main:first-child")).getText().trim();
			String productPrice2 = productPrice.replace("$", "").replace(" ", "");
			double productPrice3 = Double.parseDouble(productPrice2);
			if(productPrice3 > 20.00 || productPrice3 > 50.00) {
				WebElement productTitle = product.findElement(By.cssSelector("a.product-title-link"));
				System.out.println("[Product Name: "+productTitle.getText()+"]");
				System.out.println("[Product Link: "+productTitle.getAttribute("href")+"]");
				System.out.println("[Product Price: "+productPrice+"]");
			}
		}
	}

}
