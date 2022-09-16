package javaexamples;

public class FunctionOverloadingsub {
//2. Write a program to have 3 methods to subtract different numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FunctionOverloadingsub f=new FunctionOverloadingsub();
				f.sub(4, 2);
				f.sub(6.0f, 5.5f);
				f.sub(10, 2,3);
			}
			void sub(int a,int b) {
				System.out.println("subtraction of two integers "+(a-b));
				
			}
			void sub(float a,float b) {
				System.out.println("subtraction of two float numbers "+(a-b));
				
			}
			void sub(int a,int b,int c) {
				System.out.println("subtraction of three integers "+(a-b-c));
				
			}

}
