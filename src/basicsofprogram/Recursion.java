package basicsofprogram;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion obj=new Recursion();
			System.out.println("Factorial is= "+obj.fact(5));
	}

	
	
	 int fact(int a) {
		if(a==1) {
			return 1;
		}
		else {return a * fact(a-1);}
		}
	 
	}


