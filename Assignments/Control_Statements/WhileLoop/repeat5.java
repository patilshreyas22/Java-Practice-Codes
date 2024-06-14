import java.util.*;

class repeat5{


	public static void main(String args []){
	
	
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter a Number : ");

		int number = sc.nextInt();

		while(number>0){
		
		
			int digit = number % 10;

			if(digit%2==0){
			
			
				if(digit==0){
				
				
				
				}
				else{
				
				System.out.println(digit*digit*digit);
				
				}
			
			
			}

			number = number / 10;
		
		
		}
	
	
	
	
	}



}
