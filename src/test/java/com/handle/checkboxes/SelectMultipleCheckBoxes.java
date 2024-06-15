package com.handle.checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class SelectMultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();

		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> pages = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));

		for (int i = 0; i < pages.size(); i++) {
			WebElement pageElement = pages.get(i);
			pageElement.click();

			List<WebElement> webElements = driver.findElements(By.xpath("//td/input[@type='checkbox']"));

			for (WebElement element : webElements) {
				element.click();
			}

			Thread.sleep(3000);
		}

		driver.quit();
	}

}
