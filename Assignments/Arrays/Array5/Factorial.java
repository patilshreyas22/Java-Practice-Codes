import java.util.*;

class Factorial{

	
	public static void main(String args []){
	
		
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		int arr [] = new int [size];

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = scanner.nextInt();
		
		}

		int factorial [] = new int[size];


		for(int i = 0 ; i<factorial.length ; i++){
		
			int value = arr[i];
			int product = 1;

			if(value==1){
				
				product = 1;
							
			}else if(value==0){
			
				product = 0;
			
			}else{

			while(value >= 1){
				
				product = product * value;
				value--;
				
			}

		}

		factorial[i] = product;

	}
	

		for(int i = 0 ; i<factorial.length ; i++){
			
			System.out.println("The factorial of element " + arr[i] + " is " + factorial[i]);
		
		}
	
	}

}
