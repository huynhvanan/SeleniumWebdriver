package com.qa.section03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElement {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.facebook.com/");
		try {
			driver.findElement(By.id("passssss")).clear();
			driver.findElement(By.id("passssss")).sendKeys("abcdef");
		}catch(Exception e) {
			System.out.println("Fail: Element chua ton tai");
		}
		driver.close();
	}

}
