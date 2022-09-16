package basicsofprogram;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="nidhish";
		String sub=" ";
		
		for(int i=4;i<=name.length()-1;i++) {
			sub=sub+name.charAt(i);
		}
		System.out.println(sub);
		System.out.println(name.substring(3,5));
	}

}
