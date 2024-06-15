
import java.util.Scanner;
class code7{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter thenumber of rows :");

		int row=sc.nextInt();

		int num=2;
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=row-i+1;j++){
			
				System.out.print(num++ +" ");
				num++;
			}
			System.out.println();
		}
	}
}
