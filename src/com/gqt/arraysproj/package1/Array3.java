package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the count of Schools:");
	    int sch=sc.nextInt();
		System.out.println("Enter the count of Classes:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students:");
		int stu=sc.nextInt();
		int arr[][][]=new int[sch][cls][stu];
		//
		for(int i=0;i<sch;i++) {
				System.out.println("Inside scl:"+(i+1));
				for(int j=0;j<cls;j++) {
					System.out.println("Inside classes :"+(j+1));
					for(int k=0;k<stu;k++) {
						System.out.println("Enter the marks of Students no:"+(k+1));
					arr[i][j][k]=sc.nextInt();
					}
				}
		}		
		//
			for(int i=0;i<sch;i++) {
			System.out.println("Inside school:"+(i+1));
			for(int j=0;j<cls;j++) {
			System.out.println("Enter the  classes no:"+(j+1));
		    for(int k=0;k<stu;k++) {
		System.out.println("The marks of Students no."+(k+1)+"is:"+arr[i][j][k]);	
	}
	}
					}
		}
	}


