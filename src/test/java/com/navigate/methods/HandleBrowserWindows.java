package com.navigate.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs = driver.getWindowHandles();

		// Approach-1
		/*
		 * List<String> windowList = new ArrayList(windowIDs); String parentIDs =
		 * windowList.get(0); String childIDs = windowList.get(1);
		 * 
		 * //Switch to Child window driver.switchTo().window(childIDs);
		 * System.out.println(driver.getTitle());
		 * 
		 * //Switch to Parent window driver.switchTo().window(parentIDs);
		 * System.out.println(driver.getTitle());
		 */

		// Approach-2
		for (String window : windowIDs) {
			String title = driver.switchTo().window(window).getTitle();

			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}