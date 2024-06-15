package com.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class DynamicPaginationWithTable {

	public static void main(String[] args) {

		WebDriver driver = Utils.getWebDriverObject();
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.opencart"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='input-username']"));
		userName.clear();
		userName.sendKeys("demo");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Utils.implicitWaitMethod(10, driver);

		driver.findElement(By.xpath("//*[@id='menu-customer']")).click();

		Utils.implicitWaitMethod(5, driver);
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		Utils.implicitWaitMethod(10, driver);
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();

		int noOfPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println("noOfPages: " + noOfPages);

		int noOfColumns = driver.findElements(By.xpath(
				"//form[@id='form-customer']//table[@class='table table-bordered table-hover']//tbody//tr[3]//td"))
				.size();
		int noOfRows = driver
				.findElements(By.xpath(
						"//form[@id='form-customer']//table[@class='table table-bordered table-hover']//tbody//tr"))
				.size();

		WebElement element = null;
		for (int page = 1; page < noOfPages; page++) {

			
	//element = driver.findElement(By.xpath("//form[@id='form-customer']//div[@class='row']//div[@class='col-sm-6 text-start']//ul[@class='pagination']//li[@class='page-item active']//span[@class='page-link'][1]"));
	
	element = driver.findElement(By.xpath(
						"//form[@id='form-customer']//div[@class='row']//div[@class='col-sm-6 text-start']//ul[@class='pagination']//li[@class='page-item']["
								+ page + "]"));
				Utils.implicitWaitMethod(10, driver);
				element.click();
			

			for (int row = 1; row < noOfRows; row++) {
				for (int column = 1; column < noOfColumns; column++) {

					System.out.print(driver.findElement(By.xpath(
							"//form[@id='form-customer']//table[@class='table table-bordered table-hover']//tbody//tr["
									+ row + "]//td[" + column + "]"))
							.getText() + "\t");
				}
				System.out.println();
			}
		}
	}
}
