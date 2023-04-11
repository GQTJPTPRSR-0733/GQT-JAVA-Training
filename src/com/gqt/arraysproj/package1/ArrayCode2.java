package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCode2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the count of Classes:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students:");
		int stu=sc.nextInt();
		int arr[] []=new int[cls][stu];
		//Storing
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of Student no:"+(j+1));
				arr[i][j]=sc.nextInt();
				//Fetching
				
			}
		}
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of Student no:"+(j+1)+"is:"+arr[i][j]);
}
}
	}
}