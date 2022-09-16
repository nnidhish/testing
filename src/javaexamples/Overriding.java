package javaexamples;
//Write a program to implement method over riding using super keyword

class animal2 {		
	
	 void fourlegs() {
	System.out.println("Super class animal");}
}



public class Overriding extends animal2 {
	
	void fourlegs() {
		super.fourlegs();		//super keyword is used to to call super class object
		
		System.out.println("Sub class cat");
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding obj= new Overriding();
		obj.fourlegs();
		
	}

}
