package javaexamples;
//3. Write a program where you need to implement multiple inheritance using interfaces

interface inter1{
	void m1();//
	int a=20;
}
interface inter2 {
	void m2();//
}

public class MultipleInterface implements inter2,inter1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj=new MultipleInterface();
		obj.m1();
		obj.m2();
		
	}
	public void m1() {			// two methods must be defined because this class implements interface
		System.out.println("M1 code");
	}
	public void m2() {
		System.out.println("M2 code");
	}
}
