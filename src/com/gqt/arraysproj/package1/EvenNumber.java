package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Entr the n value:");
	number=sc.nextInt();
	for(int i=0;i<=number;i++) {
		if(i%2==0) {
			System.out.println(i+"\t");
		}
	}
	
}
}
