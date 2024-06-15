package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://github.com/");
		
		//name
		//driver.findElement(By.name("user_email")).sendKeys("sp.vdnj@gmail.com");
		
		//id
		//driver.findElement(By.id("user_email")).sendKeys("sp.vdnj@gmail.com");
		
		//linkText
		//driver.findElement(By.linkText("Pricing")).click();
		
		//partiallinkText
		//driver.findElement(By.partialLinkText("Pric")).click();
		
		
		//className
		//driver.get("https://www.flipkart.com/");
		//List<WebElement> elementsList = driver.findElements(By.className("_3D0G9a"));
		//System.out.println("Total number of className WebElements "+elementsList.size());
		
		//tagName
		//List<WebElement> tagNamesList = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of tagName WebElements "+tagNamesList.size());
		
		//tagName
		//List<WebElement> images = driver.findElements(By.tagName("img"));
		//System.out.println("Total number of Images WebElements "+images.size());
	}

}
