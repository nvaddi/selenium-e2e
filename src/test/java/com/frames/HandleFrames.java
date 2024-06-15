package com.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.Utils;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.getWebDriverObject();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext1']")).sendKeys("Testing....frame1..Msg");

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext2']")).sendKeys("Testing...frame2...Msg");

		driver.switchTo().defaultContent();

		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext4']")).sendKeys("Testing...frame4...Msg");

		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext3']")).sendKeys("Testing...frame3...Msg");

		driver.switchTo().frame(0);
		// Inner Iframe
		driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click(); //Selects "Hi I am the UI.Vision IDE"
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click(); //Selects "I am a human"
		
		//Check box
		driver.findElement(By.xpath("//div[@id='i19']")).click();//Selects "Web Testing"
		driver.findElement(By.xpath("//div[@id='i19']//div[@class='rq8Mwb']")).click();//Selects Form Autofilling
		driver.findElement(By.xpath("//div[@id='i25']//div[@class='uHMk6b fsHoPb']")).click();//General Web Automation
		
		//Drop down
		driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select options = new Select(driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")));
		//options.selectByIndex(1);
		//options.deselectAll();
		//options.selectByVisibleText("Yes");
		//options.selectByIndex(0);
		
		
		/*
		  driver.switchTo().defaultContent();
		  Thread.sleep(5000);
		  WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		  driver.switchTo().frame(frame5);
		  driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		  
		  driver.findElement(By.xpath("//input[@type='text' and @name='mytext5']")).sendKeys("Testing...frame5...Msg"); 
		  */
	}

}