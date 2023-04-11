package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the count of university:");
		int uni=sc.nextInt();
		int arr[][][][]=new int[uni][][][];//4 dimensional array
		//taking the college count
				for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the count of College inside the university:"+(i+1));
				arr[i] =new int[sc.nextInt()][][];
				}
		//taking the class count
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the count of Classes inside the University:"+(i+1));
		arr[i]=new int[sc.nextInt()][][];
		}
		//taking the student count
		for (int i=0;i<arr.length;i++) {
			System.out.println("Inside university:"+(i+1));
			for (int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the count of Students inside the class:"+(j+1));
		 arr[i][j]=new int[sc.nextInt()][];
		}
			}
		//Storing
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside University:"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Inside College:"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
			System.out.println("Inside class:"+(k+1));
			for(int l=0;l<arr[i][j][k].length;l++) {
				System.out.println("Enter the marks of Student no:"+(l+1));
				arr[i][j][k][l]=sc.nextInt();
			}
		}
				}
		}
				//Fetching
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside University:"+(i+1));
			//System.out.println("Enter the name of university: ");
		for(int j=0;j<arr[i].length;j++) {
		System.out.println("Inside College:"+(j+1));
		for(int k=0;k<arr[i][j].length;k++) {
			System.out.println("Inside class:"+(k+1));
			for(int l=0;l<arr[i][j][k].length;l++) {
				System.out.println("The marks of Student no:"+(l+1)+"is:"+arr[i][j][k][l]);
}
}
	}
}

}

}
