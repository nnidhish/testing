package javaexamples;
//1. Write a program to have 3 methods to add different numbers

public class FunctionOverloadingadd1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloadingadd1 f=new FunctionOverloadingadd1();
		
		f.add(1, 2);
		f.add(1.0f, 5.5f);
		f.add(1, 2,3);
		
	}
	void add(int a,int b) {
		System.out.println("Addition of two integers "+(a+b));
		
		
	}
	void add(float a,float b) {
		System.out.println("Addition of two float numbers "+(a+b));
		
	}
	void add(int a,int b,int c) {
		System.out.println("Addition of three integers "+(a+b+c));
		
	}

}
