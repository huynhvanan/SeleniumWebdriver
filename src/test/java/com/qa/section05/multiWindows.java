package com.qa.section05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindows {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]")).click();
		String strParentWindows = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			System.out.println("["+driver.getCurrentUrl()+"]");
			System.out.println("["+driver.getTitle()+"]");
			if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows")) {
				break;
			}
		}
		if(driver.findElement(By.xpath("//h3")).getText().equals("Opening a new window")){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		driver.quit();
	}

}
