
import java.util.Scanner;
class code1{

	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows :");

		int num=sc.nextInt();
		int temp=1;
		

		for(int i=1;i<=num;i++){
		
			for(int j=1;j<=num;j++){
			
				System.out.print(temp++ +" ");
			}
			System.out.println();
		}

	}
}
