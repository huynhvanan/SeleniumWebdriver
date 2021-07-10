package com.qa.section05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert02 {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Alert
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alertComfirm = driver.switchTo().alert();
		String strComfirmContent = alertComfirm.getText();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[Alert Comfirm Content: "+strComfirmContent+"]");
//		alertComfirm.accept();
		alertComfirm.dismiss();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
