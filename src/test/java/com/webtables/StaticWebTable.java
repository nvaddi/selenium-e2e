package com.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();

		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.test.automation"));
		int tableRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(tableRows);
		int tableColumns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(tableColumns);

		for (int i = 1; i < tableColumns; i++) {
			System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[" + i + "]")).getText()
					+ "       ");
		}
		System.out.println();

		for (int i = 2; i <= tableRows; i++) {

			for (int j = 1; j <= tableColumns; j++) {
				System.out
						.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
								.getText() + "       ");
			}
			System.out.println();
		}
		System.out.println();
		for (int k = 2; k <= tableRows; k++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + k + "]//td[2]"))
					.getText();
			Utils.implicitWaitMethod(5, driver);
			if (authorName.equals("Amit")) {
				System.out.println("Author: "+authorName+"\n    Book name: "+ driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + k + "]//td[1]")).getText());
			}
		}

	}

}
