package com.navigate.methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = Utils.getWebDriverObject();
		// driver.get("https://demo.nopcommerce.com/"); // accepts URL only in string
		// format

		driver.navigate().to("https://demo.nopcommerce.com/"); // this also accepts in URL in String & URL object
																// formats
		// Example:
		// URL url = new URL("https://demo.nopcommerce.com/"); //URL Object
		// driver.navigate().to(url);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
	}

}
