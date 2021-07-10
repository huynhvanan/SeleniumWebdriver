package com.qa.section01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		// get URL
		System.out.println("[URL:"+driver.getCurrentUrl() +"]");
		// back 
		driver.navigate().back();
		// get handles
		System.out.println("[Handles:"+driver.getWindowHandle() +"]");
		// get source code
		System.out.println("[Code:"+driver.getPageSource() +"]");
	}

}
