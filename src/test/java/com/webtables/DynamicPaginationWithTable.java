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
		int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

		WebElement active_page = null;
		System.out.println("Name: \t"+"Email: \t"+"Status: ");
		for (int page = 2; page <=10; page++) {
			System.out.println("Page no: "+page);
			active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+page+"]"));
			active_page.click();

			if(page==1) {
				
				//driver.findElement(By.xpath("//ul[@class='pagination']//li//span[@class='page-link']"));
				Utils.implicitWaitMethod(5, driver);
				 for(int row = 1; row<=noOfRows;row++) {
						String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[2]")).getText();
						String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[3]")).getText();
						String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[5]")).getText();
					 System.out.println(customerName+"\t"+customerEmail+"\t"+"Status: "+status);
					 
			}
			}else {
				
				active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+page+"]"));
				active_page.click();
				Utils.implicitWaitMethod(5, driver);
				 for(int row = 1; row<=noOfRows;row++) {
						String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[2]")).getText();
						String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[3]")).getText();
						String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[5]")).getText();
					 System.out.println(customerName+"\t"+customerEmail+"\t"+"Status: "+status);
					 
			}
				
			}
	/*		
	 *		active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+page+"]")); 
	 		
			 for(int row = 1; row<=noOfRows;row++) {
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[2]")).getText();
				String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+row+"]//td[5]")).getText();
			 System.out.println(customerName+"\t"+customerEmail+"\t"+"Status: "+status);
			 } */
		}
	}
}
