package com.qa.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElementByNameandClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		// get String from className example
		String strText = driver.findElement(By.className("example")).getText();
		System.out.println("[String Class Name Example: "+strText+"]");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("nguyen.ngoc.nhan@gmail.com");
		// Click button by Xpath
		driver.findElement(By.xpath("//i[text()='Retrieve password']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
