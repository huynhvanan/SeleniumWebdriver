package com.qa.section03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getBasicElement {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		// config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
		// assign driver
		driver = new ChromeDriver();
		// open url
		driver.get("https://www.facebook.com/");
		// get Attribute
		String getAtt = driver.findElement(By.cssSelector("#email")).getAttribute("data-testid");
		// get tagName
		String getTagName = driver.findElement(By.cssSelector("#email")).getTagName();
		// get Text
		String getText = driver.findElement(By.cssSelector("#email")).getText();
		// get CSS
		// get Background Color (background-color)
		String getBackgroundColor = driver.findElement(By.cssSelector("#email")).getCssValue("background-color");
		// get Color (color)
		String getColor = driver.findElement(By.cssSelector("#email")).getCssValue("color");
		// get Font Size (font-size)
		String getFontSize = driver.findElement(By.cssSelector("#email")).getCssValue("font-size");
		// get Font/Font Family (font, font-family)
		String getFont = driver.findElement(By.cssSelector("#email")).getCssValue("font");
		// get Height (height)
		String getHeight = driver.findElement(By.cssSelector("#email")).getCssValue("height");
		// get Width (width)
		String getWidth = driver.findElement(By.cssSelector("#email")).getCssValue("width");
		// Print to console
		System.out.println("[get Attribute: "+getAtt+"]");
		System.out.println("[get tagName: "+getTagName+"]");
		System.out.println("[get Text: "+getText+"]");
		System.out.println("[get Background Color: "+getBackgroundColor+"]");
		System.out.println("[get Color: "+getColor+"]");
		System.out.println("[get Font Size: "+getFontSize+"]");
		System.out.println("[get Font/Font Family: "+getFont+"]");
		System.out.println("[get Height: "+getHeight+"]");
		System.out.println("[get Width: "+getWidth+"]");
		// close driver
		driver.close();
	}

}
