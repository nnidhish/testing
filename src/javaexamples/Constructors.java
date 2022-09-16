package javaexamples;

public class Constructors {
	String ename;
	int empid;
	int s;
	static int i=1;
	String D;
	public static void main(int[] args) {
		System.out.println("hello ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors e1=new Constructors("manoj",3,100000,"tester");
	
		e1.display();
		Constructors e2=new Constructors("john",1,100000,"tester");
		e2.display();
		Constructors e3=new Constructors("Ram",2,100000,"tester");
		e3.display();
		
	}
	Constructors(String name,int id,int sal,String Des){
		ename=name;
		empid=id;
		s=sal;
		D=Des;
	}
	void display() {
		System.out.println("Employee "+i+" name= "+ename);
		System.out.println("Employee "+i+" Id= "+empid);
		System.out.println("Employee "+i+" salary= "+s);
		System.out.println("Employee "+i+" designation= "+D+"\n");
		i++;

	}
}
