package com.qa.section04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDate {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("datepicker")).sendKeys("07/30/2019");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.expedia.com/");
		driver.findElement(By.cssSelector("uitk-tab-anchor")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		WebElement days = driver.findElement(By.xpath("//*[id='flight-departing-wraper-hp-flight']/div/div/div[2]"));
		List<WebElement> listDay = days.findElements(By.tagName("td"));
		String noDay = "30";
		for(WebElement day:listDay) {
			if(day.getText().contains(noDay)) {
				day.click();
				break;
			}
		}
		driver.close();
	}

}
