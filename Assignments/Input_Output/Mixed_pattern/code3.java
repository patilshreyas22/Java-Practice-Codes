
import java.util.Scanner;
class code3{

	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows :");

		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int ch=64+row;
		
			for(int j=1;j<=row;j++){
			
				if(i%2==0){
				
					System.out.print(j +" ");

				}
				else
					System.out.print((char)ch-- +" ");
				
			}
			System.out.println();
		}

	}
}
