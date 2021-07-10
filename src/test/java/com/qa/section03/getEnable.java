package com.qa.section03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getEnable {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.facebook.com/");
		boolean isDisplayed = driver.findElement(By.cssSelector("#email")).isDisplayed();
		boolean isEnable = driver.findElement(By.cssSelector("#email")).isEnabled();
		System.out.println("[Element is displayed: "+isDisplayed+"]");
		System.out.println("[Element is enable: "+isEnable+"]");
		driver.close();
	}

}
