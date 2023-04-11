package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCodd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Universities:");
	    int uni=sc.nextInt();
		  System.out.println("Enter the count of Schools:");
		    int scl=sc.nextInt();
			System.out.println("Enter the count of Classes:");
			int cls=sc.nextInt();
			System.out.println("Enter the count of Students:");
			int stu=sc.nextInt();
			int arr[][][][]=new int[uni][scl][cls][stu];
			//
			for(int i=0;i<uni;i++) {
				System.out.println("Inside universities:"+(i+1));
			for(int j=0;j<scl;j++) {
					System.out.println("Inside school:"+(j+1));
					for(int k=0;k<cls;k++) {
						System.out.println("Inside classes :"+(k+1));
						for(int l=0;l<stu;l++) {
							System.out.println("Enter the marks of Students no:"+(l+1));
						arr[i][j][k][l]=sc.nextInt();
						}
					}
			}		

	}
			//
			for(int i=0;i<uni;i++) {
				System.out.println("Inside universities:"+(i+1));
			for(int j=0;j<scl;j++) {
					System.out.println("Inside school:"+(j+1));
					for(int k=0;k<cls;k++) {
						System.out.println("Inside classes :"+(k+1));
						for(int l=0;l<stu;l++) {
			System.out.println("The marks of Students no."+(k+1)+"is:"+arr[i][j][k]);	
		}
		}
						}
			}
		}


}
