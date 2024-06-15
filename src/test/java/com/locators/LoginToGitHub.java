package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class LoginToGitHub {
	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://github.com/");

		try {
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login_field")).sendKeys("nvaddi");
			driver.findElement(By.id("password")).sendKeys("daksha$43");
			driver.findElement(By.name("commit")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.quit();
		}

	}

}
