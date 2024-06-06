import java.util.*;
class repeat2{


	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
	
		int number = sc.nextInt();

		while(number>0){
		
		int digit = number % 10;

		if(digit%3!=0){
		
			System.out.print(digit);
		}
		
		number = number / 10;
		
		}
	
	
	}



}
