package com.wait.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//from here to till the driver is closed this sleep is allowed for all statements
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// this will open new browser
																							// window
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
