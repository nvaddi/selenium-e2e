package com.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.getWebDriverObject();
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.orangehrm"));
		Thread.sleep(5000);
		// login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Utils.implicitWaitMethod(5,driver);

		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		Utils.implicitWaitMethod(5,driver);
		
		// clicked on dropdown
		driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i"))
				.click();
	
		// select single option
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();

		// count no. of options
		List<WebElement> listCount = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of elements: " + listCount.size());
		
		int i =1;
		for(WebElement element:listCount) {
			System.out.println("Element-"+i+" "+element.getText());
			i++;
		}

	}

}
