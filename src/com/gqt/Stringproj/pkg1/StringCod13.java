package com.gqt.Stringproj.pkg1;
import java.util.Scanner;
public class StringCod13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String str2=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
				
	}
			else {
				str2=str2+str.charAt(i);
			}
		}
			System.out.println(str2);
	}

	}
