package com.webtables;

public class FindPages {

	public static void main(String[] args) {
		
		String text = "Showing 1 to 10 of 694 (7013 Pages)";
		
		int noOfPages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println(noOfPages);
		
	/*	String[] pagesArr = text.split("\\(");
		
		String s = pagesArr[1];
		
		pagesArr=null;
		pagesArr = s.split(" Pages");
		int noOfPages = Integer.parseInt(pagesArr[0]);
		*/
		
	}

}
