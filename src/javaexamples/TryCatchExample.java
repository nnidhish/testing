package javaexamples;
//Write a program to handle Arithmetic Exception using try catch block

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}

System.out.println("End of the Program");
	}

}
