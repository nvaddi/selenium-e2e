package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext5']")).sendKeys("Testing success...");

	}

}
