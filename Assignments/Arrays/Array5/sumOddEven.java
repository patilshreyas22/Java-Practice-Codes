import java.util.*;

class OddEven{
	
	public static void main(String args []){
	
	
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the Array :");

		int size = scanner.nextInt();

		int arr [] = new int [size];

		System.out.println("Add elements into the Array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = scanner.nextInt();

		}
		
		int oddsum = 0;
		int evensum = 0;


		for(int i = 0 ; i<arr.length ; i++){
			
			if(arr[i]%2==0){
			
				evensum += arr[i];
			}
			else{
			
				oddsum += arr[i];
			}
		
		}

		System.out.println("The OddSum is " + oddsum + " and the EvenSum is " + evensum);
	
	
	}


}
