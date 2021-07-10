package com.qa.section04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multSelectBox {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.linkedin.com/jobs/search?keywords=Information%20technology&location=Can%20Tho%2C%20Vietnam&geoId=101320799&trk=public_jobs_jobs-search-bar_search-submit&position=1&pageNum=0");
		driver.findElement(By.xpath("//button[contains(text(), 'Experience Level')]")).click();
		List<WebElement> listItems = driver.findElements(By.cssSelector("#EXPERIENCE-dropdown li"));
		for(WebElement item:listItems) {
			if(item.getText().contains("Associate") || item.getText().contains("Director")) {
				item.click();
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
