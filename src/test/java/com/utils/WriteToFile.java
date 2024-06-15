package com.utils;

public class WriteToFile {

	public static void main(String[] args) {
		String content = "Virinchi is testing....";
		String filePath = "customerDatafile";

		try {
			
			Utils.writeToFile(Utils.getURL(Utils.getPropFilePath(), filePath), content);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
