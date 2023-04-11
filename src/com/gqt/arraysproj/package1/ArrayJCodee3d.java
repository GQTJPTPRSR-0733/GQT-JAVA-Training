package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayJCodee3d {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the count of School:");
		int scl=sc.nextInt();
		int arr[][][]=new int[scl][][];//3 dimensional array
		//taking the class count
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the count of Classes inside the school:"+(i+1));
		arr[i] =new int[sc.nextInt()][];
		}
		//taking the school count
		for (int i=0;i<arr.length;i++) {
			System.out.println("Inside school:"+(i+1));
			
				for (int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the count of Students inside the class:"+(i+1));
		 arr[i][j] =new int[sc.nextInt()];
		}
			}
		//Storing
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside school:"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the marks of Student no:"+(k+1));
				arr[i][j][k]=sc.nextInt();
			}
		}
				}
				//Fetching

		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school:"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The marks of Student no:"+(j+1)+"is:"+arr[i][j][k]);
}
}
	}
}

}
