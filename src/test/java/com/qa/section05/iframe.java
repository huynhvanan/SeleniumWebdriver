package com.qa.section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://jqueryui.com/draggable/");
		// iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		// xpath
		String value = driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		System.out.println("[p: "+value+"]");
		driver.switchTo().defaultContent();
		String valueh1 = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println("[h1: "+valueh1+"]");
		driver.quit();
	}

}
