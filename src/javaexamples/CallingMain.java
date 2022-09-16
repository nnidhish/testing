package javaexamples;
//Try to write a program where you will have more than one main function. Let me know which main is called by JVM.

public class CallingMain {
	
	void main(int a) {
		System.out.println("main 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default main 1");
		CallingMain n=new CallingMain();
		n.main(1);
	}
}
