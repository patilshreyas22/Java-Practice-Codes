
import java.util.Scanner;
class code4{

	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows :");

		int row=sc.nextInt();
		for(int i=row;i>=1;i--){
			int num=i;
		
			for(int j=1;j<=row-i+1;j++){
				System.out.print(num +" ");
				num=num+i;;
			
			
			}
			System.out.println();
		}

	}
}
