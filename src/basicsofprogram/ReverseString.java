package basicsofprogram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="nidhish";
		String rev="";
		System.out.println(name);
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
