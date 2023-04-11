package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayPrimeno {
	public static void main(String[] args) {
		/*int num=100,count;
		
		System.out.println("enter the value of n:"+num);
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
				}
			}
	}



}
*/
		int num,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num value:");
				num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
				}
			}
	}

}

