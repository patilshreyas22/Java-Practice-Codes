
import java.util.*;
class demo{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int row=sc.nextInt();

		for(int i=0;i<=row;i++){
		
			for(int j=1;j<=row-i;j++){
			
				System.out.print("\t");
			}
			if(i%2==1){
			for(int k=1;k<=i;k++){
			
				System.out.print((char)(64+k)+"\t");
			}
			for(int l=i-1;l>=1;l--){
			
				System.out.print((char)(64+l)+"\t");
			}
			}else
			{
			for(int k=1;k<=i;k++){

                                System.out.print((char)(96+k)+"\t");
                        }
                        for(int l=i-1;l>=1;l--){

                                System.out.print((char)(96+l)+"\t");
                        }
			
			}

			System.out.println();
		}
	}
}
