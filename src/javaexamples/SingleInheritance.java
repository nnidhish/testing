package javaexamples;
class  Login{
	String name="virat";
	void verifyLogin() {
		System.out.println("Login Successful");
		
	}
}
class AddBen extends Login{
	void verifyBen() {
		System.out.println("Beneficiary named "+name+" added Successful"); 
		
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBen n=new AddBen();
		n.verifyLogin();
		n.verifyBen();
	}

}
