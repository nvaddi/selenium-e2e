package com.wait.methods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.utils.Utils;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Fluent wait declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		   WebElement txtUserName = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//input[@name='username']"));
			     }
			   });
		   
		   txtUserName.sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
