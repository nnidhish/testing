package javaexamples;
//1. Create one interface

interface interface1{
	void m1();//automatic abstract & public method but in abstract class , "abstract keyword must be used

}

public class InterfaceExample1 implements interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample1 obj = new InterfaceExample1();
		obj.m1();
	}
public void m1() { 
	System.out.println("M1 Code");// two methods must be defined because this class extends abstract class
}
}
