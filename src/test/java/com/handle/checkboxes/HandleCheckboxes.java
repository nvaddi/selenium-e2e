package com.handle.checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utils.getWebDriverObject();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//to select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//to select all checkboxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//to select all checkboxes
		/* for (int i = 0; i < args.length-1; i++) {
			
			WebElement element = checkBoxes.get(i);
			element.click();
			
		} */
		
		//to select all checkboxes
	/*	for (WebElement checkBox : checkBoxes) {
			checkBox.click();
			
		} */
		
		//to select last 3 checkboxes
		/* for(int i=checkBoxes.size()-3; i<checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		} */
		
		//to select first 3 checkboxes
				for(int i=0; i<checkBoxes.size()-4; i++) {
					checkBoxes.get(i).click();
				}
				
				Thread.sleep(5000);
				
	//Un-selecting the checkboxes
				//to unselecting the selected checkboxes
				for (WebElement checkBox : checkBoxes) {
					
					if(checkBox.isSelected()){
						checkBox.click();
					}
					
				}
	}

}
