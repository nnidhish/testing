package javaexamples;

public class PrivateAccess
{
	private void method1()
	{
		System.out.println("inside private method");
	}
public static void main(String args[])
{
	PrivateAccess obj=new PrivateAccess();


	//obj.method1();
	obj.method1();// 
}
}