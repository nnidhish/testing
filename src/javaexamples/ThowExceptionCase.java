package javaexamples;

public class ThowExceptionCase {
	void throww() {
		int a=2;
	
if(a<3) {
throw new ArithmeticException();}  // "throw can only throw one exception
else {
System.out.println("Eligible");


}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThowExceptionCase n=new ThowExceptionCase();
		n.throww();
		
	}

}
