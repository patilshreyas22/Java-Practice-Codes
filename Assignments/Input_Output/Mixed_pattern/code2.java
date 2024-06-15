
import java.util.Scanner;
class code2
{

	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows :");

		int row=sc.nextInt();
		

		char ch='C';
		for(int i=1;i<=row;i++){
			int temp=row-1+i;
		
			for(int j=1;j<=row;j++){
			
				System.out.print((char)(ch)+""+temp-- +" ");
			}
			System.out.println();
		}

	}
}
