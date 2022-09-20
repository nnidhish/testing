package javaexamples;

public class MultipleExceptionCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10];
try {
	a[10]=10;
}
catch(ArithmeticException e)
{System.out.println("ArrayIndexOutOfBoundException occured");
}
catch(ArrayIndexOutOfBoundsException e)
{System.out.println("ArrayIndexOutOfBoundException occured");
}
	}

}
