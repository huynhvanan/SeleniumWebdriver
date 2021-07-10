package com.qa.section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drapanddrop {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // vi chi co 1 iframe
		WebElement drap = driver.findElement(By.id("drapable"));
		WebElement drop = driver.findElement(By.id("dropable"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(drap).moveToElement(drop).release(drap).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
