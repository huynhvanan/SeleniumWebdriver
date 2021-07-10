package com.qa.section04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seclectBox {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.facebook.com/register");
		String strDay = driver.findElement(By.id("day")).getAttribute("value").toString();
		String strMonth = driver.findElement(By.id("month")).getAttribute("value").toString();
		String strYear = driver.findElement(By.id("year")).getAttribute("value").toString();
		System.out.println("[Day: "+strDay+"]");
		System.out.println("[Month: "+strMonth+"]");
		System.out.println("[Year: "+strYear+"]");
		// input day
		List<WebElement> listDay = driver.findElements(By.cssSelector("select#day>option"));
		for(WebElement day:listDay) {
			if(day.getText().trim().contains("30")) {
				day.click();
				break;
			}
		}
		// input month
		List<WebElement> listMonth = driver.findElements(By.cssSelector("select#month>option"));
		for(WebElement month:listMonth) {
			if(month.getText().trim().contains("8")) {
				month.click();
				break;
			}
		}
		// input year
		List<WebElement> listYear = driver.findElements(By.cssSelector("select#year>option"));
		for(WebElement year:listYear) {
			if(year.getText().trim().contains("2000")) {
				year.click();
				break;
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
