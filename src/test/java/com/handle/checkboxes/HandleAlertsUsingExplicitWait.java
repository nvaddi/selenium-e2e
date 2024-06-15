package com.handle.checkboxes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.Utils;

public class HandleAlertsUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);

		Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());

		String alertMessage = myAlert.getText();
		System.out.println(alertMessage);
		myAlert.accept();
	}

}
