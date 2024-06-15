package com.wait.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.Utils;

public class ExplicitWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//Declaration 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		webElement.sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Leave")));
		webElement.click();
		//webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		//webElement.sendKeys("Leave");
		
	}

}
