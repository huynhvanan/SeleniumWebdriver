package com.qa.section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovers {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement picture = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]"));
		WebElement linkProfile = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(picture).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.moveToElement(linkProfile).click().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
