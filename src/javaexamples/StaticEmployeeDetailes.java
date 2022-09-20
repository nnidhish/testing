package javaexamples;

public class StaticEmployeeDetailes {
String ename;
int empid;
int s;
String D;
static String country="Indian";	// static data variable
static String title;
int i=1;// number of employee counter
static int j=1; //number of employee counter used inside static function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEmployeeDetailes e1=new StaticEmployeeDetailes();
e1.init("john",1,100000,"tester");
displaytitle();
e1.display();
e1.init("Ram",2,100000,"tester");
displaytitle();
e1.display();
e1.init("manoj",3,100000,"tester");
displaytitle();
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
	System.out.println("Employee "+i+" designation= "+D);
	System.out.println("Employee "+i+" Nationality= "+country+"\n");
	i++;

}

static void displaytitle() {			//static function
	title="Employee";
	System.out.println(title+" "+(j++)+" Details ");
}
static {								//static block
	System.out.println("Employees of TietoEvry\n");
}
}
