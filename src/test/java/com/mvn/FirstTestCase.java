package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.orangehrm.com/");
		String actualTitle = driver.getTitle();

		// System.out.println("Title "+driver.getTitle());
		driver.quit();
		driver.findElement(By.className(""));
		if (actualTitle.equals("OrangeHRM | Sign In")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

}
