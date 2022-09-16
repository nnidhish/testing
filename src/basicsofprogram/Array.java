package basicsofprogram;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int roll[]=new int[1000];
		int rol[]= {10,11,8,7,6,5,400,3,2,100};
		Arrays.sort(rol);
		
		/*for(int i=0;i<rol.length;i++) {		//sorting the array
			for(int j=i+1;j<rol.length;j++) {
				if(rol[i]>rol[j]) {
					int temp;
					temp=rol[i];
					rol[i]=rol[j];
					rol[j]=temp;
				}
			}
		}*/
		
		System.out.println("Descending order= ");
		for(int i=9;i>=0;i--) {
			System.out.print(rol[i]+" ");
		}
		System.out.println("\nAscending order= ");
		for(int i=0;i<10;i++) {
			System.out.print(rol[i]+" ");
			
		}
	}

}
