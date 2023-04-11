package com.gqt.Stringproj.pkg1;
import java.util.Scanner;
public class StringCode10 {
public static void main(String[] rgs) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.next();
	str=str.toLowerCase();
	int vowels_cnt=0;
	int cons_cnt=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		vowels_cnt++;
		}
		else {
			cons_cnt++;
		}
	}
	System.out.println("Vowel Count is:"+vowels_cnt);
	System.out.println("Constant Count is:"+cons_cnt);
}
}
