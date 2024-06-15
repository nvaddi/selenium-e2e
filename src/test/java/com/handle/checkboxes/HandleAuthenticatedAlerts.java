package com.handle.checkboxes;

import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class HandleAuthenticatedAlerts {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		// driver.get("https://the-internet.herokuapp.com/basic_auth"); //prompt for user-name & password

		
		//Syntax: https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //takes user-name & password from url and logs in

	}

}
