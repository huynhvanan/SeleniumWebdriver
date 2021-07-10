package com.qa.section01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.gecko.driver", "src/test/resources/executables/geckodriver.exe");
		// assign driver
		driver = new FirefoxDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("[title:"+driver.getTitle() +"]");
	}

}
