package com.qa.section03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColectionWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com");
		// get all tag a
		List<WebElement> links = driver.findElements(By.cssSelector("a"));
		for(WebElement link:links) {
			System.out.println("[Link: "+link.getText() + "]");
		}
		driver.close();
	}

}
