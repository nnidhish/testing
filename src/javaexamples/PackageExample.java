/*
1. Create two package with pack1 & pack2
2. Create one class in pack1 with some function
3. In pack2 import above pack1 and try to use this function which in pack1
*/

package javaexamples;
import basicsofprogram.Functions;


public class PackageExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Functions obj=new Functions();
//doubt// solution- u need to create object of subclass when u extend protected class.
//A obj1=new A();
//obj1.method1();

int a=obj.add(10,20);
System.out.println("Sum of two number is "+a);
System.out.print("Multiplication ");
obj.mul(10,10);
	}

}
