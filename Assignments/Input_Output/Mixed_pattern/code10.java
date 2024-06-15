
import java.util.*;
class code10{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		long num=sc.nextLong();

		long rem=0;
		long rev=0;
		while(num>0){
		
			rem=num%10;
			long d=rem;
			rev=(rev*10)+rem;
			if(rem%2==1){
			
				System.out.print(d*d+",");

			}
			num/=10;
		}
	}
}
