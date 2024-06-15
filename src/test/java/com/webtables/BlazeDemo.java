package com.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.Utils;

public class BlazeDemo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		WebDriver driver = Utils.getWebDriverObject();
		driver.get(Utils.getURL(Utils.getPropFilePath(), "url.blazedemo"));
		double freight = 0;
		int noOfColumns = 0;
		WebElement chooseFlight=null;

		WebElement fromCountry = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Utils.implicitWaitMethod(5, driver);
		Select fromCountries = new Select(fromCountry);
		//List<WebElement> listOfFromCountries = fromCountries.getOptions();
		fromCountries.selectByValue("Philadelphia");

		WebElement toCountry = driver.findElement(By.xpath("//select[@name='toPort']"));
		Utils.implicitWaitMethod(5, driver);
		Select toCountries = new Select(toCountry);
		Utils.implicitWaitMethod(5, driver);
		//List<WebElement> listOfToCountries = toCountries.getOptions();
		Utils.implicitWaitMethod(10, driver);
		toCountries.selectByValue("London");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		noOfColumns = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		freight = Utils.stringToDoubleConverter(driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[6]")).getText().substring(1));

		for (int i = 1; i < noOfColumns; i++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]")).getText().substring(1);
			
			double priceConvert = Utils.stringToDoubleConverter(price);
			if ( freight>priceConvert) {
				freight = priceConvert;
				chooseFlight = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[1]"));
				
			}
		}
		
		chooseFlight.click();
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Narendra D Modi");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("H.No 1-1/49");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("509321");
		Utils.implicitWaitMethod(5, driver);
		WebElement cardType = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select cType = new Select(cardType);
		Utils.implicitWaitMethod(5, driver);
		//List<WebElement> allCards = cType.getOptions();
		cType.selectByVisibleText("American Express");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("509038562741");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("06");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Naredra Modi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText().equals("Thank you for your purchase today!")) {
			System.out.println("Project Execution Completed Successfully");
		}else {
			System.out.println("Please check it looks there is some issue");
		}
			
	}

}