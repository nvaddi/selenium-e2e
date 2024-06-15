package com.conditional.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class CondtionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		WebElement element;

		try {
			driver.get("https://demo.nopcommerce.com/register");
			element = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

			// isDisplayed()
			// System.out.prWeintln("Image display status " + logo.isDisplayed());

			// isEnabled()
			//System.out.println("Enable status " + driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled());
		
			WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
			WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
			
			System.out.println("Before Selection:: ");
			System.out.println("male radio button "+male_rb.isSelected());		
			System.out.println("female radio button "+female_rb.isSelected());
			
			System.out.println("After Selection:: ");
			male_rb.click();
			System.out.println("male radio button "+male_rb.isSelected());
			female_rb.click();
			System.out.println("female radio button "+female_rb.isSelected());
			
			
		
		} catch (Exception e) {
			System.out.print(e.getMessage());
		} finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

}
