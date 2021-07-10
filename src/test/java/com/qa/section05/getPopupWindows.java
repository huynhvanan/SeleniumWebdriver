package com.qa.section05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPopupWindows {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.facebook.com/register");
		driver.findElement(By.id("privacy-link")).click();
		String strPerentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			if(!windows.equals(strPerentWindow)) {
				driver.switchTo().window(window);
			}
		}
		driver.findElement(By.cssSelector("a.signup_btn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(strPerentWindow);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
