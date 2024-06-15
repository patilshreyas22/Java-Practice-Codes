
import java.util.*;
class demo{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		
			for(int j=1; j<=row-i; j++) {
			
				System.out.print("\t");
			}
			for(int j=1;j<=((i-1)*2)+1; j++) {
		
				if(i<=j){
					System.out.print(row-j+1+"\t");
				}else
					System.out.print(row-i+2+"\t");

			}

				System.out.println();
		}


	}
}
