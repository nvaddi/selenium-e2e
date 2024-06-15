package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	static WebDriver driver;

	public static WebDriver getWebDriverObject() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static String getURL(String propFilePath, String urlProp) {

		Properties properties = null;
		String url = null;
		
		try (InputStream inputStream = new FileInputStream(propFilePath)) {
			properties = new Properties();
			properties.load(inputStream);
			url = (String) properties.get(urlProp);

		} catch (Exception e) {
			System.out.println("Exception occured" + e.getMessage());
		}
		return url;
	}

	public static String getPropFilePath() {
		return "src/test/resources/config.propertes";
	}

	public static void implicitWaitMethod(int waitTime, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
	}

	public static double stringToDoubleConverter(String value) {
		return Double.parseDouble(value);
	}

	public static void writeToFile(String filePath, String content) throws IOException {

		// Defining the file name of the file
		Path fileName = Path.of(filePath);

		// Writing into the file
		Files.writeString(fileName, content);

		// Reading the content of the file
		String file_content = Files.readString(fileName);

		// Printing the content inside the file
		System.out.println(file_content);
	}
}
