package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayJCodee1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the count of Classes:");
		int cls=sc.nextInt();
		int arr[][]=new int[cls][];//2 dimensional array
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of Students inside the class:"+(i+1));
		 arr[i] =new int[sc.nextInt()];
		}
		//Storing
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of Student no:"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
				//Fetching


		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of Student no:"+(j+1)+"is:"+arr[i][j]);
}
}
	}
}

