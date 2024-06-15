
import java.util.*;
class code9{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of rows :");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
		
			int num=i;
			for(int j=1;j<=row-i+1;j++){
			
			
				if(i%2==1){
				
					System.out.print(j+" ");
				}
				else{
				
					System.out.print((char)(64+row-j-i+2)+" ");
				}

			}
			System.out.println();
		}
	}
}
