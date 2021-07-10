package com.qa.section01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("[title:"+driver.getTitle() +"]");
		// open google
		driver.navigate().to("https://www.google.com/");
		System.out.println("[title:"+driver.getTitle() +"]");
		driver.navigate().back();
		System.out.println("[title:"+driver.getTitle() +"]");
		driver.navigate().forward();
		System.out.println("[title:"+driver.getTitle() +"]");
	}

}
