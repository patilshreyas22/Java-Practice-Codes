
import java.util.*;
class code6{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of rows :");
		int row=sc.nextInt();

	
		for(int i=row;i>=1;i--){
			int ch=96+row;
			int num=row;
		
			for(int j=1;j<=row-i+1;j++){
			
				if(i%2==0){
				
					System.out.print((char)(ch--)+" ");
				}
				else
					System.out.print(num-- +" ");

			
			}
			System.out.println();


		}
	}
}
