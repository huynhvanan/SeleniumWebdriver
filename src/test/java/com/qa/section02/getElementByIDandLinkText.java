package com.qa.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElementByIDandLinkText {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com");
		// get LinkText
		driver.findElement(By.linkText("Form Authentication")).click();
		// get username
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		// get password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		// Click button by Xpath
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
