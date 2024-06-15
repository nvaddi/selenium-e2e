package com.handle.checkboxes;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

import dev.failsafe.internal.util.Assert;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//1. Normal Alert with OK Button
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * Alert myAlert = driver.switchTo().alert(); 
		 * String alertMessage = myAlert.getText(); 
		 * System.out.println(alertMessage); myAlert.accept();
		 */
		
		
		//2. Confirmation Alert
		/* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		Alert myAlert = driver.switchTo().alert();
		String alertMessage = myAlert.getText();
		System.out.println("Alert message: "+alertMessage);
		
		//myAlert.accept();
		myAlert.dismiss();
		*/
		
		//3. Prompt Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Testing...");
		String alertMessage = myAlert.getText();
		myAlert.accept();
		
		
		
		//Assert("I am a JS Alert",alertMessage)
	}

}
