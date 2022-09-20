package javaexamples;

public class MultipleExceptionCases1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		try {
			a[10]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");		//this exception is called
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
