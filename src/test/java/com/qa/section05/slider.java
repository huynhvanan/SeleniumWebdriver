package com.qa.section05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// implicitly Wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// open url
		driver.get("https://jqueryui.com/slider/#colorpicker");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame(0); // vi chi co 1 iframe
		WebElement red = driver.findElement(By.xpath("//body/div[@id='red']/span[1]"));
		WebElement green = driver.findElement(By.xpath("//body/div[@id='green']/span[1]"));
		WebElement blue = driver.findElement(By.xpath("//body/div[@id='blue']/span[1]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(red).moveByOffset(-20, 0).release(red).build().perform();
		actions.clickAndHold(green).moveByOffset(10, 0).release(green).build().perform();
		actions.clickAndHold(blue).moveByOffset(20, 0).release(blue).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
