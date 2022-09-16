package basicsofprogram;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a= (float) 10.00;
		float b= (float) 5.3;
		float res=a-b;
	//	double c=5.43333;
		//float d=5.4444f;
		System.out.println("result of two numbers are "+res);
		//System.out.println(c);
		//System.out.println(d);
		
		
		String firstName="Nidhish";
		String lastName="Karkera";
		System.out.println("Full Name= "+firstName+" "+lastName);
		
		int marks=80;
		if(marks<35)
			System.out.println("fail");
		else if(marks>=35 && marks<50)
		{	System.out.println("pass");}
		else if(marks>=50 && marks<80) {
				System.out.println("SecondClass");
				}
		else {System.out.println("First class");}
			
		}
		}
	

	


