import java.util.*;

class repeat9{

	public static void main(String args []){
	
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Number : ");

	int number = sc.nextInt();

	int sum = 0;


	while(number>0){
	
		int digit = number % 10;

		if(digit%2!=0){
		
		int sqr = digit * digit;

		sum = sum + sqr;
					
		
		}

		number = number / 10;
	
	
	}
	
	System.out.print(sum);	
	
	}


}
