package com.cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class CSSLocators {
	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://github.com/");
		

		try {
			//Tag#id
			//driver.findElement(By.cssSelector("label#query-builder-test-label"));
			
			//Tag.className
			//driver.get("https://www.flipkart.com/");
			//driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Mobiles");
			
			//Tag[attribute="value"]
			//driver.get("https://www.flipkart.com/");
			//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("smart phones below 5000"); //with tagName
			//driver.findElement(By.cssSelector("[type='text']")).sendKeys("smart phones below 5000");//without tagNme
			
			
			//tag, class and attribute
			//tag.classname[attribute='value']
			//driver.get("https://www.flipkart.com/");
			//driver.findElement(By.cssSelector("input.Pke_EE[type='text']")).sendKeys("Lenin Cotton Shirts");
			
			driver.findElement(By.xpath("//span[@class='flex-1']")).sendKeys("Java Repositories");
			
			
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//driver.quit();
		}

	}

}
