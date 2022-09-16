package javaexamples;
//2. Create new class that implements above interface and provide definition of methods of interface in sub class

interface interface2{
	void m1();//automatic abstract & public method but in abstract class , "abstract keyword must be used

}

public class InterfaceExample2 implements interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample2 obj = new InterfaceExample2();
		obj.m1();
	}
public void m1() {
	System.out.println("M1 Code");// two methods must be defined because this class extends abstract class
}
}
