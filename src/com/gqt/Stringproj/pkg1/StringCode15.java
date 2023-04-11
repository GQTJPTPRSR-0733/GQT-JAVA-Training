package com.gqt.Stringproj.pkg1;
import java.util.Scanner;
public class StringCode15 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String str=sc.next();
	
	

	StringBuffer alpha=new StringBuffer();
	StringBuffer num=new StringBuffer();
	StringBuffer special=new StringBuffer();
	for(int i=0;i<str.length();i++) {
		if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
			
	}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(special);
	}
}
	