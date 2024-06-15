package com.axes.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Utils;

public class XPathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver = Utils.getWebDriverObject();
		
		
		try {
		
		//Self selects the current node
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		//String text = driver.findElement(By.xpath("//a[contains(text(), 'rediff')]/self::a")).getText();
		//String text = driver.findElement(By.xpath("//a[contains(text(), 'Zomato')]/self::a")).getText();
		//System.out.println("Self :: "+text);
		
		//Parent
		driver.get("https://github.com/");
		//String text = driver.findElement(By.xpath("//div['search-suggestions']/child::div/child::a")).getText();
		//System.out.println(text);
		
		driver.findElement(By.xpath("//div['HeaderMenu-toggle-bar[2]']/following-sibling::div"));
									 //div['HeaderMenu-toggle-bar[2]']/following-sibling::div
		
		}catch(Exception e) {
			
		}finally {
			
		}
		

	}

}
