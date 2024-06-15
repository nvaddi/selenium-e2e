package com.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.bootsrap.dropdown"));

		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();

		// Select single option
		// driver.findElement(By.xpath("//input[@value='Java']")).click();

		// Capture all the elements and findout the size
		List<WebElement> options = driver.findElements(By.xpath("//ul//label"));
		System.out.println("size:: " + options.size());

		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		//Select multiple options
		for (WebElement option : options) {
			if(option.getText().equals("Java")||option.getText().equals("Python")|| option.getText().equals("Angular")||option.getText().equals("C#")) {
				option.click();
			}
		}

	}

}
