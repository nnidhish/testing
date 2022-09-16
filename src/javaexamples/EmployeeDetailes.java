package javaexamples;

public class EmployeeDetailes {
String ename;
int empid;
int s;
String D;
int i=1;// number of employee counter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDetailes e1=new EmployeeDetailes();
e1.init("john",1,100000,"tester");
e1.display();
e1.init("Ram",2,100000,"tester");
e1.display();
e1.init("manoj",3,100000,"tester");
e1.display();
	}
	void init(String name,int id,int sal,String Des) {
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
