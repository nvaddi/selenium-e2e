package com.search.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class GoogleSearch_Dropdown {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.google"));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Utils.implicitWaitMethod(5, driver);
		
		List<WebElement> webElements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(WebElement webElement:webElements) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals("selenium webdriver download")) {
				webElement.click();
			}
				
		}
		
	}

}
