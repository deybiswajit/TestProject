package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXTest {
	public static void main(String[] args) {
//String pattern = "[a-zA-Z]{1}";
		
		String pattern = "(\\w+\\,\\w{1,2})";
		
		Pattern r = Pattern.compile(pattern);
		
		 //Matcher m = r.matcher(priceElement.text());
		 Matcher m = r.matcher("O.i4O,2O");
	
		if (m.find()) {
         	System.out.println("Found value: if");
        }else {
        	System.out.println("Found value: else");
      	}
		
		
		
		String formattingEle="1.376,59";
		
		System.out.println("Total Price Value : "+formattingEle.replace(".","").replace(",","."));
		
	
	}

}
