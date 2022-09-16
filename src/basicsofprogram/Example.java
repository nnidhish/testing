package basicsofprogram;

class Example1 {

	 void display() {
		System.out.println("in exap");
		
	}

}
class Test extends Example1{
	void show() {}
	
	}
public class Example{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Test();
		e.display();
		
	}
}
