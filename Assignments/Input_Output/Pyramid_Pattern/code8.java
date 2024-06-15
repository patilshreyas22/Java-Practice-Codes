
import java.util.*;
class demo{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=row-i;j++){
			
				System.out.print("\t");
			}
			for(int k=1;k<=((i-1)*2)+1;k++){
			
				if(i%2==1){
					System.out.print(i+"\t");
				}
				else{
					System.out.print((char)(64+i)+"\t");
			}
			}
			System.out.println();
		}
	}
}
