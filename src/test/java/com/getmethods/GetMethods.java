package com.getmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		try {
			// get("url") - opens url on browser
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);

			// getTitle() - returns page title
			System.out.println("Page Title:: " + driver.getTitle());

			// getCurrentUrl() - returns the url of the page
			System.out.println("Current URL:: " + driver.getCurrentUrl());

			// getPageSource()- returns source code of the page
			// System.out.println("Pare Source:: "+driver.getPageSource());

			// getWindowHandle() - returns the string type of value
			System.out.println("Window Handle:: " + driver.getWindowHandle());

			driver.findElement(By.linkText("OrangeHRM, Inc")).click();

			// getWindowHandles() - returns the string type of value
			Set<String> windowIDs = driver.getWindowHandles();
			System.out.println("Window Handles:: " + windowIDs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
