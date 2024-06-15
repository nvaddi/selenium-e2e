package com.dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.Utils;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.getWebDriverObject();
		// String url = Utils.getProperties("config.propertes","url.test.automation");
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.test.automation"));

		WebElement webElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(webElement);

		// selectByVisibleText()
		// drpCountry.selectByVisibleText("Canada");

		// Thread.sleep(3000);

		// selectByValue()
		// drpCountry.selectByValue("uk");

		// Thread.sleep(3000);

		// selectByIndex()
		// drpCountry.selectByIndex(4);
		

		// Capture the options form the web-element
		List<WebElement> webElements = drpCountry.getOptions();
		System.out.println(webElements.size());
		
		for(WebElement webEle:webElements) {
			System.out.println(webEle.getText());
		}

	}

}
