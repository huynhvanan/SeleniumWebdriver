package com.qa.section03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.goodreads.com/");
		// get all images
		List<WebElement> listImgs = driver.findElements(By.cssSelector("img[src$='.jpg']"));
		// get attribute alt
		int i = 0;
		for(WebElement img:listImgs) {
			if(img.isDisplayed()) {
				i = i++;
				System.out.println("[Image Name: "+ img.getAttribute("alt") +"]");
			}
			i++;
		}
		System.out.println("[Total img is displayed: "+i+"]");
		driver.close();
	}

}
