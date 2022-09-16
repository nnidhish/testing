package javaexamples;
class  Login11{
	String name="virat";
	void verifyLogin11() {
		System.out.println("Login Successful");
		
	}
}

public class NewSingleInheritance extends Login11 	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewSingleInheritance n=new NewSingleInheritance();
		n.verifyLogin11();
		n.verifyBen();
	}
	void verifyBen() {
		System.out.println("Beneficiary named "+name+" added Successful"); 
		
	}
	

}
