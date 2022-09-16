package basicsofprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int prime=1;
		int i;
		if(a==0||a==1) {
			System.out.println("not a prime number");
		}
		else
		{
			for(i=2;i<=a/2;i++) {
				if(a%i==0) {System.out.println("not a prime number");
				prime=0;}
				else {
					prime=1;
				
			}
		}

	}
		if(prime==1) {System.out.println("is a prime number");}

}}
