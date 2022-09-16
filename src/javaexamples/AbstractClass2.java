package javaexamples;
abstract class Superclass2{
	abstract void m1();
	
}
abstract class Subclass extends Superclass2{
	abstract void m2();
	
}
public class AbstractClass2 extends Subclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass2 obj=new AbstractClass2();
		obj.m1();
		obj.m2();
	}
	void m1() {
		System.out.println("M1 code");
		
	}
	void m2() {
		System.out.println("M2 code");
		
	}

}
