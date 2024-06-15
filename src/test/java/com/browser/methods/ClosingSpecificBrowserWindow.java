package com.browser.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		
		for (String window : windowIDs) {
			String title = driver.switchTo().window(window).getTitle();

			if (title.equals("OrangeHRM")) {
				driver.close();
			}
		}

	}

}
