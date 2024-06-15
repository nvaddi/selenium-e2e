package com.wait.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class SleepCommand {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// this will open new browser
																							// window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
