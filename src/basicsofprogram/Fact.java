package basicsofprogram;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int i=a;
		int fact=1;
		
		while(a>=1){
			fact=fact*a;
			a--;
		}
		System.out.println("Factorial of "+i+" is "+fact);
		
	}

}
