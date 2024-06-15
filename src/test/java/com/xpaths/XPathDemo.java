package com.xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class XPathDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://www.flipkart.com/");

		//XPath with Single Attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Denim Jeans Pants");
		
		
		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@type='text'][@class='Pke_EE']")).sendKeys("iPhone Deals & Offers");
		

		
		//XPath with and Operator
		//driver.findElement(By.xpath("//input[@type='text' and @class='Pke_EE']")).sendKeys("Summer Deals on Flipkart");
		
		
		//XPath with and or Operators
		//driver.findElement(By.xpath("//input[@type='text' or @class='Pke_EE']")).sendKeys("XPath with and or Operators");
		
		//XPath with inner text()
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//boolean displayStatus = driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed();
		//System.out.println(displayStatus);
		
		//String val = driver.findElement(By.xpath("//a[text()='Login']")).getText();
		//System.out.println(val);
		
		
		//XPath with contains method
		//driver.findElement(By.xpath("//input[contains(@title, 'Search')]")).sendKeys("XPath with contains method");
		
		//XPath starts-with method
		driver.findElement(By.xpath("//input[starts-with(@title, 'Search')]")).sendKeys("XPath starts-with method");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
