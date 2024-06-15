package com.browser.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//this will open new browser window

		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open another new browser window
		Thread.sleep(5000);
		//driver.close(); //Now, 2 windows are opened if you use driver.close() then will get exception
		driver.quit();// here no exception
	}

}
