

/*
 *    
 *    1
 *  1 2 1
 *1 2 3 2 1
 *
 *
 */
import java.util.*;
class demo{

	public static void main(String[] aths){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row :");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=row-i;j++){
			
				System.out.print("\t");
		
			}
			for(int k=1;k<=i;k++){
			
				System.out.print(k+"\t");
			}
			for(int l=i-1;l>=1;l--){
			
				System.out.print(l+"\t");
			}
			System.out.println();
		}
}
}
