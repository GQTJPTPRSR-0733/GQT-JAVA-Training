package com.gqt.methodsproj.pkg1;
class Calculator3{
	
	int add() //method with  no input and return output
	{ 
		int a=10;
	int b=20;
		int c=a+b;
		return c;
	}
	
}
public class MethodType3 {
	public static void main(String[] args) {
		Calculator3 c3=new Calculator3();
		 int res=c3.add();
		 System.out.println("Output from main:"+res);
}

}
