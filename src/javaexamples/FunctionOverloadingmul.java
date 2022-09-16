package javaexamples;
//3. Write a program to have 3 methods to multiplication different numbers
public class FunctionOverloadingmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FunctionOverloadingmul f=new FunctionOverloadingmul();
				f.mul(2, 2);
				f.mul(1.0f, 5.5f);
				f.mul(1, 2,3);
			}
			void mul(int a,int b) {
				System.out.println("Multiplication of two integers "+(a*b));
				
			}
			void mul(float a,float b) {
				System.out.println("Multiplication of two float numbers "+(a*b));
				
			}
			void mul(int a,int b,int c) {
				System.out.println("Multiplication of three integers "+(a*b*
						c));
				
			}

}
