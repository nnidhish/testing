package javaexamples;
class  Login1{
	String name="virat";
	void verifyLogin() {
		
		System.out.println("Login Successful");
		
	}
}
class AddBen1 extends Login1{
	
	void verifyBen() {
		System.out.println("Beneficiary named "+name+" added Successful"); 

	}
}
class TransferFunds extends AddBen1{
	void verifyTransfer() {
		System.out.println("Funds successfully transfered to "+name);
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds n=new TransferFunds();
		n.verifyLogin();
		n.verifyBen();
		n.verifyTransfer();
	}

}
