package basicsofprogram;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj=new Functions();
		int s=0;
		s=obj.add(1,2);
		System.out.println("result is "+s);
		
		s=obj.sub(2,1);
		System.out.println("result is "+s);
		
		obj.mul(5,5);
		obj.div(5,5);

	}
		public int add(int a,int b) {
		
			int res=a+b;
			return res;
			}
		int sub(int a,int b) {
			
			int res=a-b;
			return res;
			}
		public void mul(int a,int b) {
	
			int res=a*b;
			System.out.println("result is "+res);
			}
		void div(int a,int b) {
			if(b==0) {
				System.out.println("Cannot divide");
			}
			else {
				int res=a/b;
				System.out.println("result is "+res);
			}
		}
}


