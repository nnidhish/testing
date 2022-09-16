package javaexamples;
abstract class Superclass{
	abstract void m1();
	void m2() {
		System.out.println("M2 code");
	}
}

public class AbstractClass extends Superclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj=new AbstractClass();
		obj.m1();
		obj.m2();
	}
	void m1() {
		System.out.println("M1 code");
		
	}

}
