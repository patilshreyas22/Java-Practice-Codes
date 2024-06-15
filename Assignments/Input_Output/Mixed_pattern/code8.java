
import java.util.Scanner;
class code8{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows :");

		int row=sc.nextInt();

		int sum=0;
		for(int k=row;k>=1;k--){
		
			sum=sum+k;
		}
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=row-i+1;j++){
			
				System.out.print((char)(64+sum--) +" ");
			
			}
			System.out.println();
		}
	}
}
